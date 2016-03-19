/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearningpbo;

import java.util.Scanner;

/**
 *
 * @author deni2live
 */
public class Classroom {
    
    private String classCode; //Variable for storing class code
    public void setClassCode(String classCode)
    {
        this.classCode = classCode;
    }
    public String getClassCode()
    {
        return classCode;
    }
   
    private Subject subject; //Variable (or an object) of subject beared by this classroom
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
   
    public Classroom(String classCode)
    {
        setClassCode(classCode);
    }
    
    //Student objects and method for adding student
    protected Student student[];
    private int studentCount = 0;
    public void addStudent()
    {
        String ID = inputString();
        String name = inputString();
        String email = inputString();
        String password = inputString();
        this.studentCount = studentCount++;
        student[studentCount] = new Student(email, password, name, ID);
    }
    
    //input something String-y
    public String inputString()
    {
        Scanner input = new Scanner(System.in);
        String output = input.next();
        return output;
    }
}
