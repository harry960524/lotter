package lottery.domains.content.payment.ht;

import com.alibaba.fastjson.annotation.JSONField;

public class HTPayResult
{
  @JSONField(name="is_success")
  private String isSuccess;
  @JSONField(name="sign")
  private String sign;
  @JSONField(name="errror_msg")
  private String errrorMsg;
  @JSONField(name="trans_id")
  private String transId;
  @JSONField(name="order_id")
  private String orderId;
  @JSONField(name="bank_status")
  private String bankStatus;
  
  public String getIsSuccess()
  {
    return this.isSuccess;
  }
  
  public void setIsSuccess(String isSuccess)
  {
    this.isSuccess = isSuccess;
  }
  
  public String getSign()
  {
    return this.sign;
  }
  
  public void setSign(String sign)
  {
    this.sign = sign;
  }
  
  public String getErrrorMsg()
  {
    return this.errrorMsg;
  }
  
  public void setErrrorMsg(String errrorMsg)
  {
    this.errrorMsg = errrorMsg;
  }
  
  public String getTransId()
  {
    return this.transId;
  }
  
  public void setTransId(String transId)
  {
    this.transId = transId;
  }
  
  public String getOrderId()
  {
    return this.orderId;
  }
  
  public void setOrderId(String orderId)
  {
    this.orderId = orderId;
  }
  
  public String getBankStatus()
  {
    return this.bankStatus;
  }
  
  public void setBankStatus(String bankStatus)
  {
    this.bankStatus = bankStatus;
  }
}
