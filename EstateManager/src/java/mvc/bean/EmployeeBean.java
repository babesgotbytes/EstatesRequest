
package mvc.bean;

import java.io.Serializable;


public class EmployeeBean implements Serializable {
  
private String Name;
private String PhoneNumber;
private String Email;
private String status;
private int id;
/*
public EmployeeBean()
{
Name = "";
PhoneNumber = "";
Email = "";
}

public EmployeeBean(String Name, String PhoneNumber, String Email)
{
this.Name = Name;
this.PhoneNumber= PhoneNumber;
this.Email = Email;
}
*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

public void setName(String Name)
{
   this.Name = Name;
}

public String getName()
{
return Name;
}
public void setPhoneNumber(String PhoneNumber)
{
this.PhoneNumber = PhoneNumber;
}

public String getPhoneNumber()
{
return PhoneNumber;
}
public void setEmail(String Email)
{
this.Email = Email;
}
public String getEmail()
{
return Email;
}
}


