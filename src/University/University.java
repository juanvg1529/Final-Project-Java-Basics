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

    public University(List<Students> studentsList, List<Professors> professorsList, List<Courses> coursesList) {
        this.studentsList = studentsList;
        this.professorsList = professorsList;
        this.coursesList = coursesList;
    }
}
