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
public class Classroom {
    
    private String classCode;
    public void setClassCode(String classCode)
    {
        this.classCode = classCode;
    }
    public String getClassCode()
    {
        return classCode;
    }
   
    private Subject subject;
    public void setSubject(String code, String name)
    {
        subject = new Subject(code, name);
    }
    public String getSubjectName()
    {
        String subjectName = this.subject.getSubjectName();
        return subjectName;
    }
    public String getSubjectCode()
    {
        String subjectName = this.subject.getSubjectName();
        return subjectName;
    }
   
}
