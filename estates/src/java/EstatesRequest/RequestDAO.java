/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstatesRequest;

import java.util.ArrayList;
import java.sql.*;
import EstatesRequest.Request;
import java.util.logging.Level;
import java.util.logging.Logger;
import EstateManager.DatabaseConnection;


/**
 *
 * @author CLARICE
 */
public class RequestDAO  {
  
    public static Connection conn;
   public static PreparedStatement ps;
   public static ResultSet rs=null;
   
    public static ArrayList<EstateBean> retrieve() throws SQLException{
             ArrayList<EstateBean> reqList = new ArrayList<EstateBean>();
   
   conn = DatabaseConnection.getConnection();
       String sql = "select * from report";
       ps=conn.prepareStatement(sql);
       
      rs = ps.executeQuery(sql);
     
     while(rs.next()){
           EstateBean req = new EstateBean();
           
           req.setCategory(rs.getString("cate"));
            req.setCname(rs.getString("categoryname"));
             req.setPname(rs.getString("propertyname"));
              req.setDamage(rs.getString("damage"));
              reqList.add(req);
}
     
     return reqList;
   
    }
}


