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
public class Subject {
    private String subjectCode;
    private String subjectName;
    
    public void setSubjectCode(String kode){
        this.subjectCode = kode;
    }
    
    public String getSubjectCode(){
        return subjectCode;
    }
    
    public void setSubjectName(String nama){
        this.subjectName = nama;
    }
    
    public String getSubjectName(){
        return subjectName;
    }
}
