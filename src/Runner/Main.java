package Runner;

import Professor.FullTimeProfessor;
import Professor.PartTimeProfessor;
import Professor.Professors;
import Students.Students;
import University.University;
import Courses.Courses;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University globerUniversity = startUniversityInitialValues();


        Scanner scan= new Scanner(System.in);
        boolean isStillRunnin = true;
        while (isStillRunnin) {

            startMenu();

            byte menuOption = scan.nextByte();


            switch (menuOption) {
                case 1:
                    printProfessorsInfo(globerUniversity.getProfessorsList());
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
             System.out.println("==============================================" +
                     "\nthe professors name is: " + i.getProfessorsName()+"," +
                     "\n is a: " + i.getProfessorType()+"," +
                     "\n has a salary of :"+i.getProfessorSalary()+"and a total of: "+i.getSalary()+
                     "\n ==============================================" +
                     "\n");

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
    public static University startUniversityInitialValues()
    {
        University newUniversity = new University();
        newUniversity.addProfessor(new FullTimeProfessor("Francisco el matematico", 1000, 25));
        newUniversity.addProfessor(new FullTimeProfessor("Ms Poppin", 100632, 15));
        newUniversity.addProfessor(new FullTimeProfessor("Naruto uzumaki", 10056, 20));
        newUniversity.addProfessor(new FullTimeProfessor("Perry the platy[us", 58064, 30));

        newUniversity.addProfessor(new PartTimeProfessor("Carmen Sandiego",15222,29));
        newUniversity.addProfessor(new PartTimeProfessor("Lady bug",12641,28));
        newUniversity.addProfessor(new PartTimeProfessor("lil nas X",4984,15));

        newUniversity.addStudent(new Students(123, "juanito alimañana", 20));
        newUniversity.addStudent(new Students(124, "Peppa pig", 17));
        newUniversity.addStudent(new Students(125, "melo caramelo", 24));
        newUniversity.addStudent(new Students(126, "rosa melano", 25));
        newUniversity.addStudent(new Students(127, "armando casas", 29));
        return newUniversity;
    }
}


