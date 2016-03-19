/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearningpbo;

/**
 *
 * @author deni2live
 */
public class Assignment {
    private String assignCode;
    private String assignName;
    private String assignDueDate;
    
    
    public void setAssignCode(String kode){
        this.assignCode = kode;
    }
    
    public String getAssignCode(){
        return assignCode;
    }
    
    public void setAssignName(String nama){
        this.assignName = nama;
    }
    
    public String getAssignName(){
        return assignName;
    }
    
    public void setAssignDueDate(String tanggal){
        this.assignDueDate = tanggal;
    }
    
    public String getAssignDueDate(){
        return assignDueDate;
    }
}
