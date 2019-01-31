package lottery.domains.content.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="activity_cost_bill", catalog="ecai")
public class ActivityCostBill
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private int id;
  private int userId;
  private double totalCost;
  private double money;
  private String time;
  private String drawIp;
  
  public ActivityCostBill() {}
  
  public ActivityCostBill(int id, int userId, double totalCost, double money, String time, String drawIp)
  {
    this.id = id;
    this.userId = userId;
    this.totalCost = totalCost;
    this.money = money;
    this.time = time;
    this.drawIp = drawIp;
  }
  
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
  
  @Column(name="user_id", nullable=false)
  public int getUserId()
  {
    return this.userId;
  }
  
  public void setUserId(int userId)
  {
    this.userId = userId;
  }
  
  @Column(name="total_cost", nullable=false, precision=16, scale=5)
  public double getTotalCost()
  {
    return this.totalCost;
  }
  
  public void setTotalCost(double totalCost)
  {
    this.totalCost = totalCost;
  }
  
  @Column(name="money", nullable=false, precision=16, scale=5)
  public double getMoney()
  {
    return this.money;
  }
  
  public void setMoney(double money)
  {
    this.money = money;
  }
  
  @Column(name="time", nullable=false, length=19)
  public String getTime()
  {
    return this.time;
  }
  
  public void setTime(String time)
  {
    this.time = time;
  }
  
  @Column(name="draw_ip", nullable=false, length=30)
  public String getDrawIp()
  {
    return this.drawIp;
  }
  
  public void setDrawIp(String drawIp)
  {
    this.drawIp = drawIp;
  }
}
