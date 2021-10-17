package University;

import Courses.Courses;
import Professor.Professors;
import Students.Students;

import java.util.ArrayList;
import java.util.List;

public class University {
   protected List <Students> studentsList;
   protected List <Professors> professorsList;
   protected List <Courses> coursesList;

    public University() {
        this.studentsList =  new ArrayList<Students>();
        this.professorsList = new ArrayList<Professors>();
        this.coursesList = new ArrayList<Courses>();
    }

    //methods

    //the enter parameter is an obj from the class Professor
    public void addProfessor(Professors professors)
    {
       this.professorsList.add(professors);
    }

    public void addCourse(Courses courses)
    {
        this.coursesList.add(courses);
    }

    public  void addStudent(Students newStudent)
    {
        this.studentsList.add(newStudent);
    }


    //getters and Setters

    public List<Students> getStudentsList()
    {
        return studentsList;
    }


    public List<Professors> getProfessorsList() {
        return professorsList;
    }

    public List<Courses> getCoursesList() {
        return coursesList;
    }

    public void setStudentsList(List<Students> studentsList) {
        this.studentsList = studentsList;
    }

    public void setProfessorsList(List<Professors> professorsList) {
        this.professorsList = professorsList;
    }

    public void setCoursesList(List<Courses> coursesList) {
        this.coursesList = coursesList;
    }
}
