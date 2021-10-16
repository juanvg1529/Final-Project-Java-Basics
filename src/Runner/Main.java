package Runner;

import Professor.FullTimeProfessor;
import Students.Students;
import University.University;
import Courses.Courses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        University globerUnivesity = new University();
        globerUnivesity.addProfessor(new FullTimeProfessor("Francisco el matematico", 1000, 9));
        globerUnivesity.addProfessor(new FullTimeProfessor("jejej jaja", 100632, 5));
        globerUnivesity.addStudent(new Students(123,"juanito alimañana",20 ));

        System.out.println(globerUnivesity.getStudentsList().get(0).getStudentsName());



        System.out.println("the professors name is: "+ globerUnivesity.getProfessorsList().get(0).getProfessorsName()+" ,he is a "+ globerUnivesity.getProfessorsList().get(0).getProfessorType());
        Scanner scan=new Scanner(System.in);
         byte menuOption= scan.nextByte();
         boolean isStillRunnin=true;
         while (isStillRunnin)
         {

             switch (menuOption)
             {
                 case 1:
                     //Al profesor data
                     break;
                 case 2:
                     //all courses,and submenu to show off classes including the teacher, students an other data
                     break;
                 case 3:
                     //create a new student an added to students list
                     break;
                 case 4:
                     //create a new class and a techer and a relevant data
                     break;
                 case 5:
                     break;
                     //al the classes that a student is cursing
                 case 6:
                     System.out.println("bye bye");
                     isStillRunnin=false;
                     //exit
                     break;




             }
         }

    }
}
