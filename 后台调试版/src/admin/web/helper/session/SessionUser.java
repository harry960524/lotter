package admin.web.helper.session;

import java.io.Serializable;

public final class SessionUser
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private String username;
  private String password;
  private int roleId;
  
  public String getUsername()
  {
    return this.username;
  }
  
  public void setUsername(String username)
  {
    this.username = username;
  }
  
  public String getPassword()
  {
    return this.password;
  }
  
  public void setPassword(String password)
  {
    this.password = password;
  }
  
  public int getRoleId()
  {
    return this.roleId;
  }
  
  public void setRoleId(int roleId)
  {
    this.roleId = roleId;
  }
}
