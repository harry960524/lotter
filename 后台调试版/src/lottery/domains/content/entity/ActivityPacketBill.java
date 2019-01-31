package lottery.domains.content.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="activity_packet_bill", catalog="ecai")
public class ActivityPacketBill
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private int id;
  private int userId;
  private String time;
  private int packetId;
  private double amount;
  private int status;
  private double cost;
  private String ip;
  
  @Column(name="ip")
  public String getIp()
  {
    return this.ip;
  }
  
  public void setIp(String ip)
  {
    this.ip = ip;
  }
  
  @Column(name="cost")
  public double getCost()
  {
    return this.cost;
  }
  
  public void setCost(double cost)
  {
    this.cost = cost;
  }
  
  @Column(name="packet_id", nullable=false)
  public int getPacketId()
  {
    return this.packetId;
  }
  
  public void setPacketId(int packetId)
  {
    this.packetId = packetId;
  }
  
  @Column(name="amount", nullable=false)
  public double getAmount()
  {
    return this.amount;
  }
  
  public void setAmount(double amount)
  {
    this.amount = amount;
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
  
  @Column(name="time", length=19)
  public String getTime()
  {
    return this.time;
  }
  
  public void setTime(String time)
  {
    this.time = time;
  }
}
