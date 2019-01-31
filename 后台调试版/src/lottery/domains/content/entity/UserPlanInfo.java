package lottery.domains.content.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_plan_info", catalog="ecai", uniqueConstraints={@javax.persistence.UniqueConstraint(columnNames={"user_id"})})
public class UserPlanInfo
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private int id;
  private int userId;
  private int level;
  private int planCount;
  private int prizeCount;
  private double totalMoney;
  private double totalPrize;
  private int status;
  
  public UserPlanInfo() {}
  
  public UserPlanInfo(int userId, int level, int planCount, int prizeCount, double totalMoney, double totalPrize, int status)
  {
    this.userId = userId;
    this.level = level;
    this.planCount = planCount;
    this.prizeCount = prizeCount;
    this.totalMoney = totalMoney;
    this.totalPrize = totalPrize;
    this.status = status;
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
  
  @Column(name="user_id", unique=true, nullable=false)
  public int getUserId()
  {
    return this.userId;
  }
  
  public void setUserId(int userId)
  {
    this.userId = userId;
  }
  
  @Column(name="level", nullable=false)
  public int getLevel()
  {
    return this.level;
  }
  
  public void setLevel(int level)
  {
    this.level = level;
  }
  
  @Column(name="plan_count", nullable=false)
  public int getPlanCount()
  {
    return this.planCount;
  }
  
  public void setPlanCount(int planCount)
  {
    this.planCount = planCount;
  }
  
  @Column(name="prize_count", nullable=false)
  public int getPrizeCount()
  {
    return this.prizeCount;
  }
  
  public void setPrizeCount(int prizeCount)
  {
    this.prizeCount = prizeCount;
  }
  
  @Column(name="total_money", nullable=false, precision=16, scale=5)
  public double getTotalMoney()
  {
    return this.totalMoney;
  }
  
  public void setTotalMoney(double totalMoney)
  {
    this.totalMoney = totalMoney;
  }
  
  @Column(name="total_prize", nullable=false, precision=16, scale=5)
  public double getTotalPrize()
  {
    return this.totalPrize;
  }
  
  public void setTotalPrize(double totalPrize)
  {
    this.totalPrize = totalPrize;
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
}
