/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Request;

import EstateManager.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author CLARICE
 */
public class requestDAO {
     public static Connection con = null;
   public static PreparedStatement pr = null;
   public static ResultSet rs=null;
 
 
  public static ArrayList<requestBean> retrieveData() throws SQLException{
     ArrayList<requestBean> list=new ArrayList<requestBean>();
     String sql="select * from report";
    con= DatabaseConnection.getConnection();
    pr=con.prepareStatement(sql);
    rs=pr.executeQuery();
    
    while(rs.next()){
    requestBean bean=new requestBean();
    bean.setCategory(rs.getString("cate"));
    bean.setCname(rs.getString("categoryname"));
    bean.setPname(rs.getString("propertyname"));
    bean.setDamage(rs.getString("damage"));
    
    list.add(bean);
   }
   return list;
        }
  
   
}
