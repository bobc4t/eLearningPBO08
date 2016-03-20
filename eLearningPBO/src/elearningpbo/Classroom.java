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
    private Subject subjek;
    private Student murid;
    private Assignment tugas;
    
    public void setSubject(String subjectCode, String subjectName){
        subjek.setSubjectCode(subjectCode);
        subjek.setSubjectName(subjectName);
    }
    
    public Subject getSubject(){
        return subjek;
    }
    
    public void addStudent(String email, String password, String name, String idStudent){
        murid = new Student(email, password, name, idStudent);
    }
       
    public void newAssignment(String assignmentCode, String assignmentName, String assingmentDueDate){
        tugas = new Assignment();
        tugas.setAssignCode(assignmentCode);
        tugas.setAssignName(assignmentName);
        tugas.setAssignDueDate(assignmentName);
    }
    
}
