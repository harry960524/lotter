package lottery.domains.content.vo.bill;

import lottery.domains.content.entity.HistoryUserLotteryReport;

public class HistoryUserLotteryReportVO
{
  private String name;
  private double transIn;
  private double transOut;
  private double spend;
  private double prize;
  private double spendReturn;
  private double proxyReturn;
  private double cancelOrder;
  private double activity;
  private double dividend;
  private double billingOrder;
  private double packet;
  private double rechargeFee;
  private boolean hasMore;
  
  public HistoryUserLotteryReportVO() {}
  
  public HistoryUserLotteryReportVO(String name)
  {
    this.name = name;
  }
  
  public void addBean(HistoryUserLotteryReport bean)
  {
    this.transIn += bean.getTransIn();
    this.transOut += bean.getTransOut();
    this.spend += bean.getSpend();
    this.prize += bean.getPrize();
    this.spendReturn += bean.getSpendReturn();
    this.proxyReturn += bean.getProxyReturn();
    this.cancelOrder += bean.getCancelOrder();
    this.activity += bean.getActivity();
    this.dividend += bean.getDividend();
    this.billingOrder += bean.getBillingOrder();
    this.packet += bean.getPacket();
    this.rechargeFee += bean.getRechargeFee();
  }
  
  public void addBean(HistoryUserLotteryReportVO bean)
  {
    this.transIn += bean.getTransIn();
    this.transOut += bean.getTransOut();
    this.spend += bean.getSpend();
    this.prize += bean.getPrize();
    this.spendReturn += bean.getSpendReturn();
    this.proxyReturn += bean.getProxyReturn();
    this.cancelOrder += bean.getCancelOrder();
    this.activity += bean.getActivity();
    this.dividend += bean.getDividend();
    this.billingOrder += bean.getBillingOrder();
    this.packet += bean.getPacket();
    this.rechargeFee += bean.getRechargeFee();
  }
  
  public double getPacket()
  {
    return this.packet;
  }
  
  public void setPacket(double packet)
  {
    this.packet = packet;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public double getTransIn()
  {
    return this.transIn;
  }
  
  public void setTransIn(double transIn)
  {
    this.transIn = transIn;
  }
  
  public double getTransOut()
  {
    return this.transOut;
  }
  
  public void setTransOut(double transOut)
  {
    this.transOut = transOut;
  }
  
  public double getSpend()
  {
    return this.spend;
  }
  
  public void setSpend(double spend)
  {
    this.spend = spend;
  }
  
  public double getPrize()
  {
    return this.prize;
  }
  
  public void setPrize(double prize)
  {
    this.prize = prize;
  }
  
  public double getSpendReturn()
  {
    return this.spendReturn;
  }
  
  public void setSpendReturn(double spendReturn)
  {
    this.spendReturn = spendReturn;
  }
  
  public double getProxyReturn()
  {
    return this.proxyReturn;
  }
  
  public void setProxyReturn(double proxyReturn)
  {
    this.proxyReturn = proxyReturn;
  }
  
  public double getCancelOrder()
  {
    return this.cancelOrder;
  }
  
  public void setCancelOrder(double cancelOrder)
  {
    this.cancelOrder = cancelOrder;
  }
  
  public double getActivity()
  {
    return this.activity;
  }
  
  public void setActivity(double activity)
  {
    this.activity = activity;
  }
  
  public double getBillingOrder()
  {
    return this.billingOrder;
  }
  
  public void setBillingOrder(double billingOrder)
  {
    this.billingOrder = billingOrder;
  }
  
  public double getDividend()
  {
    return this.dividend;
  }
  
  public void setDividend(double dividend)
  {
    this.dividend = dividend;
  }
  
  public double getRechargeFee()
  {
    return this.rechargeFee;
  }
  
  public void setRechargeFee(double rechargeFee)
  {
    this.rechargeFee = rechargeFee;
  }
  
  public boolean isHasMore()
  {
    return this.hasMore;
  }
  
  public void setHasMore(boolean hasMore)
  {
    this.hasMore = hasMore;
  }
}
