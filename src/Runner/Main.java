package Runner;

import Professor.FullTimeProfessor;
import Professor.Professors;
import Students.Students;
import University.University;
import Courses.Courses;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        University globerUnivesity = new University();
        globerUnivesity.addProfessor(new FullTimeProfessor("Francisco el matematico", 1000, 9));
        globerUnivesity.addProfessor(new FullTimeProfessor("jejej jaja", 100632, 5));
        globerUnivesity.addStudent(new Students(123, "juanito alimañana", 20));
        globerUnivesity.addStudent(new Students(124, "Peppa pig", 17));
        globerUnivesity.addStudent(new Students(125, "melo caramelo", 24));
        globerUnivesity.addStudent(new Students(126, "rosa melano", 25));
        globerUnivesity.addStudent(new Students(127, "armando casas", 29));

//        System.out.println(globerUnivesity.getStudentsList().get(0).getStudentsName());


        System.out.println("the professors name is: " + globerUnivesity.getProfessorsList().get(0).getProfessorsName() + " ,he is a " + globerUnivesity.getProfessorsList().get(0).getProfessorType());
        Scanner scan = new Scanner(System.in);

        boolean isStillRunnin = true;
        while (isStillRunnin) {
            startMenu();
            byte menuOption = scan.nextByte();


            switch (menuOption) {
                case 1:
                    printProfessorsInfo(globerUnivesity.getProfessorsList());
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
                    isStillRunnin = false;
                    //exit
                    break;


            }
        }


        }

    public static void printProfessorsInfo(List<Professors> professorsList) {
        String infoToString="";
        for (Professors i : professorsList) {
             System.out.println("the professors name is: " + i.getProfessorsName() + " ,he is a " + i.getProfessorType());
        }
    }
    public static void startMenu()
    {
        System.out.println("Hello human, welcome to the Glober University, please type a number if you want to: " +
                "\n 1) Get all the Professors information " +
                "\n 2) Get all courses information, the professors from the course and the classmates!" +
                "\n 3) inscript a new student to an existing class" +
                "\n 4) Create a new course, add a new professor and new classmates"+
                "\n 5) Get all courses info in which a random student is signed up " +
                "\n 6) Exit");
    }
}


