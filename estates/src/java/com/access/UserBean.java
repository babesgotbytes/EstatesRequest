/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.access;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class UserBean implements Serializable{
        private String fname;
        private String sname;
        private String managerid;
        private String email;
        private String pass;
        public boolean valid;

    public UserBean() {
    }
    public UserBean(String fname, String sname, String managerid, String email, String pass) {
        this.fname = fname;
        this.sname = sname;
        this.managerid = managerid;
        this.email = email;
        this.pass = pass;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getManagerid() {
        return managerid;
    }

    public void setManagerid(String managerid) {
        this.managerid = managerid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
     public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
        
}
