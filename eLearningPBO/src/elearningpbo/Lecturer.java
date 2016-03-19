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
import java.util.Scanner;
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
    
    protected Classroom listClassroom[];
    private int classtotal = 0;
    
    public Lecturer(String email, String password, String name, String idLecturer)
    {
        setIdLecturer(idLecturer);
        super.setName(name);
        super.setEmail(email);
        super.setPassword(password);
    }
    
    public void createClassroom()
    {
        String classCode = inputClassCode();
        classtotal = classtotal++;
        listClassroom[classtotal] = new Classroom(classCode);
    }
    
    public void removeClassroom(int index)
    {
        classtotal = classtotal--;
        listClassroom[index] = null; //This is not final.
    }
    
    public String getClassroom(int index)
    {
        String output = listClassroom[index].getClassCode();
        return output;
    }
    
    public String inputClassCode()
    {
        Scanner input = new Scanner(System.in);
        String classCode = input.next();
        return classCode;
    }
}
