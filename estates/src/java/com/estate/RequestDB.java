/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estate;

import EstateManager.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class RequestDB {
    
    /**
     *
     * @return
     */
    public static List<RequestBean> getRequest(){
    List<RequestBean> list=new ArrayList<>();
    String sql="select * from report";
    try{
    Connection conn=DatabaseConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(sql);
    ResultSet rs=ps.executeQuery();
    while(rs.next()){
    RequestBean bean=new RequestBean();
    bean.setCategory(rs.getString("cate"));
    bean.setCategoryname(rs.getString("categoryname"));
    bean.setPropertyname(rs.getString("propertyname"));
    bean.setDamage(rs.getString("damage"));
    list.add(bean);
   }
    }
    catch(SQLException e){
    e.printStackTrace();
    }
    
    return list;
    }
    
}
