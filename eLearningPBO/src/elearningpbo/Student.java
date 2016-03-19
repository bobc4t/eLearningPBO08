/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearningpbo;

/**
 *
 * @author radenpioneer
 */
public class Student extends Person
{
    //Variable idStudent with type String
    private String idStudent;
    public void setIdStudent(String idStudent)
    {
        this.idStudent = idStudent;
    }
    public String getIdStudent()
    {
        return idStudent;
    }
    
    //Student Constructor
    public Student(String email, String password, String name, String idStudent)
    {
        setIdStudent(idStudent);
        super.setName(name);
        super.setEmail(email);
        super.setPassword(password);
    }
}
