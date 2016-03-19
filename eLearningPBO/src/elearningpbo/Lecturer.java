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
public class Lecturer extends Person
{
    String idLecturer;
    public void setIdLecturer(String idLecturer)
    {
        this.idLecturer = idLecturer;
    }
    public String getIdLecturer()
    {
        return idLecturer;
    }
    
    Classroom listClassroom[];
    int classtotal = 0;
    
    public Lecturer(String email, String password, String name, String idLecturer)
    {
        setIdLecturer(idLecturer);
        super.setName(name);
        super.setEmail(email);
        super.setPassword(password);
    }
    
    public void createClassroom()
    {
        classtotal = classtotal++;
        listClassroom[classtotal] = new Classroom();
    }
}
