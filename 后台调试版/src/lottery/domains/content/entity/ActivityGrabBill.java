package lottery.domains.content.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="activity_grab_bill", catalog="ecai")
public class ActivityGrabBill
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private int id;
  private int userId;
  private String time;
  private double cost;
  private double packageMoney;
  
  public ActivityGrabBill() {}
  
  @Column(name="cost", nullable=false)
  public double getCost()
  {
    return this.cost;
  }
  
  public void setCost(double cost)
  {
    this.cost = cost;
  }
  
  @Column(name="package", nullable=false)
  public double getPackageMoney()
  {
    return this.packageMoney;
  }
  
  public void setPackageMoney(double packageMoney)
  {
    this.packageMoney = packageMoney;
  }
  
  public ActivityGrabBill(int userId, String time, double cost, double packageMoney)
  {
    this.userId = userId;
    this.time = time;
    this.cost = cost;
    this.packageMoney = packageMoney;
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
  
  @Column(name="time", nullable=false, length=19)
  public String getTime()
  {
    return this.time;
  }
  
  public void setTime(String time)
  {
    this.time = time;
  }
}
