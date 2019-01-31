package lottery.domains.content.vo.lottery;

import lottery.domains.content.entity.Lottery;
import lottery.domains.content.entity.LotteryOpenCode;
import lottery.domains.utils.lottery.open.OpenTime;

public class LotteryOpenStatusVO
{
  private Lottery lottery;
  private OpenTime openTime;
  private LotteryOpenCode openCode;
  
  public Lottery getLottery()
  {
    return this.lottery;
  }
  
  public void setLottery(Lottery lottery)
  {
    this.lottery = lottery;
  }
  
  public OpenTime getOpenTime()
  {
    return this.openTime;
  }
  
  public void setOpenTime(OpenTime openTime)
  {
    this.openTime = openTime;
  }
  
  public LotteryOpenCode getOpenCode()
  {
    return this.openCode;
  }
  
  public void setOpenCode(LotteryOpenCode openCode)
  {
    this.openCode = openCode;
  }
}
