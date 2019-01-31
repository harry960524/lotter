package lottery.domains.content.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_game_dividend_bill", catalog="ecai")
public class UserGameDividendBill
{
  private int id;
  private int userId;
  private String indicateStartDate;
  private String indicateEndDate;
  private double scale;
  private double billingOrder;
  private double thisLoss;
  private double lastLoss;
  private double totalLoss;
  private double userAmount;
  private String settleTime;
  private String collectTime;
  private int status;
  private String remarks;
  
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="id", unique=true, nullable=false)
  public int getId()
  {
    return this.id;
  }
  
  public void setId(int id)
  {
    this.id = id;
  }
  
  @Column(name="user_id", nullable=false, unique=true)
  public int getUserId()
  {
    return this.userId;
  }
  
  public void setUserId(int userId)
  {
    this.userId = userId;
  }
  
  @Column(name="indicate_start_date", length=10)
  public String getIndicateStartDate()
  {
    return this.indicateStartDate;
  }
  
  public void setIndicateStartDate(String indicateStartDate)
  {
    this.indicateStartDate = indicateStartDate;
  }
  
  @Column(name="indicate_end_date", length=10)
  public String getIndicateEndDate()
  {
    return this.indicateEndDate;
  }
  
  public void setIndicateEndDate(String indicateEndDate)
  {
    this.indicateEndDate = indicateEndDate;
  }
  
  @Column(name="scale", nullable=false, precision=5, scale=4)
  public double getScale()
  {
    return this.scale;
  }
  
  public void setScale(double scale)
  {
    this.scale = scale;
  }
  
  @Column(name="billing_order", nullable=false, precision=16, scale=4)
  public double getBillingOrder()
  {
    return this.billingOrder;
  }
  
  public void setBillingOrder(double billingOrder)
  {
    this.billingOrder = billingOrder;
  }
  
  @Column(name="this_loss", nullable=false, precision=16, scale=4)
  public double getThisLoss()
  {
    return this.thisLoss;
  }
  
  public void setThisLoss(double thisLoss)
  {
    this.thisLoss = thisLoss;
  }
  
  @Column(name="last_loss", nullable=false, precision=16, scale=4)
  public double getLastLoss()
  {
    return this.lastLoss;
  }
  
  public void setLastLoss(double lastLoss)
  {
    this.lastLoss = lastLoss;
  }
  
  @Column(name="total_loss", nullable=false, precision=16, scale=4)
  public double getTotalLoss()
  {
    return this.totalLoss;
  }
  
  public void setTotalLoss(double totalLoss)
  {
    this.totalLoss = totalLoss;
  }
  
  @Column(name="user_amount", nullable=false, precision=16, scale=4)
  public double getUserAmount()
  {
    return this.userAmount;
  }
  
  public void setUserAmount(double userAmount)
  {
    this.userAmount = userAmount;
  }
  
  @Column(name="settle_time", length=19)
  public String getSettleTime()
  {
    return this.settleTime;
  }
  
  public void setSettleTime(String settleTime)
  {
    this.settleTime = settleTime;
  }
  
  @Column(name="collect_time", length=19, nullable=true)
  public String getCollectTime()
  {
    return this.collectTime;
  }
  
  public void setCollectTime(String collectTime)
  {
    this.collectTime = collectTime;
  }
  
  @Column(name="status", nullable=false)
  public int getStatus()
  {
    return this.status;
  }
  
  public void setStatus(int status)
  {
    this.status = status;
  }
  
  @Column(name="remarks", length=255, nullable=true)
  public String getRemarks()
  {
    return this.remarks;
  }
  
  public void setRemarks(String remarks)
  {
    this.remarks = remarks;
  }
}
