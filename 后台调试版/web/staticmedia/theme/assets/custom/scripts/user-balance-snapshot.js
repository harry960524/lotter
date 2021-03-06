var UserBalanceSnapshot = function() {
	
	var handelDatePicker = function() {
		$('.date-picker').datepicker({
			language: 'zh-CN',
			format: 'yyyy-mm-dd',
            autoclose: true
        });
	}
	
	var UserBalanceSnapshotTable = function() {
		var tableList = $('#user-balance-snapshot-list');
		var tablePagelist = tableList.find('.page-list');
		
		var getSearchParams = function() {
			var sDate = tableList.find('[data-field="time"] > input[name="from"]').val();
			var eDate = tableList.find('[data-field="time"] > input[name="to"]').val();
			eDate = getNetDate(eDate);
			return {sDate: sDate, eDate: eDate};
		}
		
		var pagination = $.pagination({
			render: tablePagelist,
			pageSize: 20,
			ajaxType: 'post',
			ajaxUrl: './user-balance-snapshot/list',
			ajaxData: getSearchParams,
			beforeSend: function() {
				
			},
			complete: function() {
				
			},
			success: function(list) {
				var table = tableList.find('table > tbody').empty();
				var innerHtml = '';
				$.each(list, function(idx, val) {
					innerHtml +=
					'<tr class="align-center">'+
						'<td>' + val.id + '</td>'+
						'<td>' + val.totalMoney.toFixed(3) + '</td>'+
						'<td>' + val.lotteryMoney.toFixed(3) + '</td>'+
						'<td>' + (val.totalMoney + val.lotteryMoney).toFixed(3) + '</td>'+
						'<td>' + val.time + '</td>'+
					'</tr>';
				});
				table.html(innerHtml);
			},
			pageError: function(response) {
				bootbox.dialog({
					message: response.message,
					title: '提示消息',
					buttons: {
						success: {
							label: '<i class="fa fa-check"></i> 确定',
							className: 'btn-success',
							callback: function() {}
						}
					}
				});
			},
			emptyData: function() {
				var tds = tableList.find('thead tr th').size();
				tableList.find('table > tbody').html('<tr><td colspan="'+tds+'">没有相关数据</td></tr>');
			}
		});
		
		tableList.find('[data-command="search"]').unbind('click').click(function() {
			init();
		});
		
		var init = function() {
			pagination.init();
		}
		
		var reload = function() {
			pagination.reload();
		}
		
		return {
			init: init
		}
	}();
	
	return {
		init: function() {
			UserBalanceSnapshotTable.init();
			handelDatePicker();
		}
	}
}();