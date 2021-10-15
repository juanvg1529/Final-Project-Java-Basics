package University;

import Courses.Courses;
import Professor.Professors;
import Students.Students;

import java.util.ArrayList;
import java.util.List;

public class University {
    List <Students> studentsList;
    List <Professors> professorsList;
    List <Courses> coursesList;

    public University() {
        this.studentsList =  new ArrayList<Students>();
        this.professorsList = new ArrayList<Professors>();
        this.coursesList = new ArrayList<Courses>();
    }

    //methods

    //the enter parameter is an obj from the class Professor
    public void addProfessor(Professors professors)
    {
        professorsList.add(professors);
    }

    public List<Students> getStudentsList() {
        return studentsList;
    }

    public List<Professors> getProfessorsList() {
        return professorsList;
    }

    public List<Courses> getCoursesList() {
        return coursesList;
    }
}
