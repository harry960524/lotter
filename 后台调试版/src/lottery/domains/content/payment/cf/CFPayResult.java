package lottery.domains.content.payment.cf;

public class CFPayResult
{
  private String respCode;
  private String respMessage;
  
  public String getRespCode()
  {
    return this.respCode;
  }
  
  public void setRespCode(String respCode)
  {
    this.respCode = respCode;
  }
  
  public String getRespMessage()
  {
    return this.respMessage;
  }
  
  public void setRespMessage(String respMessage)
  {
    this.respMessage = respMessage;
  }
}
