/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dept.bean;




import java.io.Serializable;


public class DepartmentBean implements Serializable {
    

  
private String Category;
private String Cname;
private String Pname;
private String damageKind;


    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category =Category;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String Cname) {
        this.Cname = Cname;
    }

public void setPname(String Pname)
{
   this.Pname = Pname;
}

public String getPname()
{
return Pname;
}
public void setdamageKind(String damageKind)
{
this.damageKind = damageKind;
}

public String getdamageKind()
{
return damageKind;
}
}


