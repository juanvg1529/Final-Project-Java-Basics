package Runner;

import Professor.FullTimeProfessor;
import Professor.PartTimeProfessor;
import Professor.Professors;
import Students.Students;
import University.University;
import Courses.Courses;

import java.net.IDN;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University globerUniversity = startUniversityInitialValues();
        //System.out.println(globerUniversity.getCoursesList().get(3).getProfessorsCourse().getProfessorsName());

        for( int i=0; i+1<=globerUniversity.getCoursesList().size();i++)
        {

            System.out.println(globerUniversity.getCoursesList().get(i).getProfessorsCourse().getProfessorsName()+ globerUniversity.getCoursesList().get(i).getCourseName());
        }
        //searchClassMatesInfo(globerUniversity,1);
//
//        for( Students i:globerUniversity.getCoursesList().get(1).getStudentsAtCourse()){
//
//            System.out.println(i.getStudentsName());
//        }
////

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
                    boolean band2=true;
                    while (band2){
                        starSubMenuClasses(globerUniversity);
                        int subMenuOption=scan.nextInt();
                        if (subMenuOption<globerUniversity.getCoursesList().size()+1)
                        {
                            for ( int i=0; i<=globerUniversity.getCoursesList().size()+1;i++)
                            {
                                if(subMenuOption==i-1) {
                                    getCourseInformation(globerUniversity,subMenuOption-1);
                                    System.out.println(subMenuOption);
                                    getProfessorsClass(globerUniversity,subMenuOption-1);
                                    searchClassMatesInfo(globerUniversity,subMenuOption-1);
                                    band2=false;
                                }

                            }
                        }
                        else {
                            System.out.println("please type a number that corresponds");
                        }
                        //all courses,and submenu to show off classes including the teacher, students an other data

                    }

                    break;
                case 3:

                    getStudentListInfo(globerUniversity);
                    System.out.println("Please type the Students information:" );
                    System.out.println("\n Student's name:");
                    Scanner newName= new Scanner(System.in);
                    String newStudentsName=newName.nextLine();
                    Scanner newID= new Scanner(System.in);
                    System.out.println("Student's Id: ");
                    int newStudentsID=newID.nextInt();
                    Scanner newAge=new Scanner(System.in);
                    System.out.println("Students' Age:");
                    int newStudentsAge=newAge.nextInt();
                    globerUniversity.addStudent(new Students(newStudentsID,newStudentsName,newStudentsAge));
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

        for (Professors i : professorsList) {
             System.out.println("\n" +
                     "==============================================" +
                     "\nthe professors name is: " + i.getProfessorsName()+"," +
                     "\n is a: " + i.getProfessorType()+"," +
                     "\n has a salary of :"+i.getProfessorSalary()+"and a total of: "+i.getSalary()+
                     "\n the professors ID is: "+i.getProfessorsID()+
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
    public static int starSubMenuClasses(University university)
    {
        System.out.println("Please chooese one of the next courses to get their info about " +
                "\n the professor and the classmates:");
        int counter=0;
        for(Courses i: university.getCoursesList())
        {
            counter++;
            System.out.println("\n"+counter+") "+i.getCourseName());

        }
        return  counter;
    }
    public static void getCourseInformation(University university,int courseID)
    {
        System.out.println("\n" +
                "The course name is: " +university.getCoursesList().get(courseID).getCourseName()+" the room asigned is: "+university.getCoursesList().get(courseID).getRoomAsigned());
    }
    public static void getProfessorsClass(University university,int courseID)
    {
        System.out.println("\n"+"The professor asigned is: "+university.getCoursesList().get(courseID).getProfessorsCourse().getProfessorsName()+". \n");


    }
    public static void searchClassMatesInfo(University university,int courseID)
    {
        System.out.println("the students coursing the: "+university.getCoursesList().get(courseID).getCourseName()+"'s course are: ");
        int counter=0;
        if(university.getCoursesList().get(courseID).getStudentsAtCourse().size()>0){
        for( Students i:university.getCoursesList().get(courseID).getStudentsAtCourse()){

            counter++;
            System.out.println(counter+"."+i.getStudentsName()+".");
        }
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=" +
                "\n");
        }else
        {
            System.out.println("There is no students at this course yet");
        }


    }

    public static void getStudentListInfo (University university)
    {
        System.out.println("These are the students inscripted at the university and their ID's");
        for(Students i : university.getStudentsList())
        {
            System.out.println("Name: "+i.getStudentsName()+".ID: "+i.getStudentsID()+"\n-------------------------------");
        }

    }

    public static  University startUniversityInitialValues()
    {
        University newUniversity = new University();
        //Full time professors
        newUniversity.addProfessor(new FullTimeProfessor("Francisco el matematico", 1000, 25));
        newUniversity.addProfessor(new FullTimeProfessor("Ms Poppin", 100632, 15));
        newUniversity.addProfessor(new FullTimeProfessor("Naruto uzumaki", 10056, 20));
        newUniversity.addProfessor(new FullTimeProfessor("Perry the platyus", 58064, 30));

        //Part time professors
        newUniversity.addProfessor(new PartTimeProfessor("Carmen Sandiego",15222,29));
        newUniversity.addProfessor(new PartTimeProfessor("Lady bug",12641,28));
        newUniversity.addProfessor(new PartTimeProfessor("lil nas X",4984,15));

        //students
        newUniversity.addStudent(new Students(123, "juanito alimañana", 20));
        newUniversity.addStudent(new Students(124, "Peppa pig", 17));
        newUniversity.addStudent(new Students(125, "melo caramelo", 24));
        newUniversity.addStudent(new Students(126, "rosa melano", 25));
        newUniversity.addStudent(new Students(127, "armando casas", 29));
        newUniversity.addStudent(new Students(128, "Elton Jhon", 29));
        newUniversity.addStudent(new Students(129, "Lady Gaga", 16));
        newUniversity.addStudent(new Students(130, "Rana Rene", 35));
        newUniversity.addStudent(new Students(131, "Mary lu", 326));

        //Courses

        newUniversity.addCourse(new Courses("spying",15,newUniversity.getProfessorsList().get(3)));
        newUniversity.addCourse(new Courses("Etics",15,newUniversity.getProfessorsList().get(4)));
        newUniversity.addCourse(new Courses("Differential Equations",15,newUniversity.getProfessorsList().get(0)));
        //newUniversity.addCourse(new Courses("Biomaterials",15,newUniversity.getProfessorsList().get(2)));
        newUniversity.addCourse(new Courses("Piano 3",15,newUniversity.getProfessorsList().get(6)));
        newUniversity.addCourse(new Courses("Advance Salsa",15,newUniversity.getProfessorsList().get(1)));

        newUniversity.addStudentToCourse(1,1);
        newUniversity.addStudentToCourse(1,2);
        newUniversity.addStudentToCourse(1,3);
        newUniversity.addStudentToCourse(1,4);
        newUniversity.addStudentToCourse(2,5);
        newUniversity.addStudentToCourse(2,6);
        newUniversity.addStudentToCourse(2,4);
       // newUniversity.getCoursesList().get(0).addStudentsToCourse(newUniversity.getStudentsList().get(0));
//        newUniversity.addCourse();
        return newUniversity;
    }


}


