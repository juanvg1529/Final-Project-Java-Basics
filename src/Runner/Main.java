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

        Scanner scan= new Scanner(System.in);
        boolean isStillRunnin = true;
        while (isStillRunnin) {

            startMenu();

            byte menuOption = scan.nextByte();


            switch (menuOption) {
                case 1:
                    printProfessorsInfo(globerUniversity.getProfessorsList());
                    break;
                case 2:
                    boolean isTwoStillRuninn=true;
                    while (isTwoStillRuninn){
                        System.out.println("Please choese one of the next courses to get their info about " +
                                "\n the professor and the classmates:");
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
                                    isStillRunnin=false;
                                }
                            }
                        }
                        else {
                            System.out.println("please type a number that corresponds");
                        }
                    }

                    break;
                case 3:

                    getStudentListInfo(globerUniversity);
                    System.out.println("there are "+globerUniversity.getStudentsList().size()+" studiying with us!");
                    System.out.println("Please type the Students information:" );
                    System.out.println("\nStudent's name:");
                    Scanner newName= new Scanner(System.in);
                    String newStudentsName=newName.nextLine();
                    Scanner newID= new Scanner(System.in);
                    System.out.println("Student's Id, following the list: ");
                    int newStudentsID=newID.nextInt();
                    Scanner newAge=new Scanner(System.in);
                    System.out.println("Students' Age:");
                    int newStudentsAge=newAge.nextInt();
                    globerUniversity.addStudent(new Students(newStudentsID,newStudentsName,newStudentsAge));
                    System.out.println( "choose the class to add the student: ");
                    starSubMenuClasses(globerUniversity);
                    int addStudenttoclass=scan.nextInt();
                    int studentsID=globerUniversity.getStudentsList().size();
                    globerUniversity.addStudentToCourse(addStudenttoclass,studentsID);
                   getStudentListInfo(globerUniversity);
                    break;
                case 4:
                    boolean isFourStillRunnin=true;
                    while (isFourStillRunnin)
                    {
                        Scanner supportInput= new Scanner(System.in);
                        startSubMenuCase4();
                        int subMenuOptionCase4=supportInput.nextInt();

                        switch (subMenuOptionCase4)
                        {
                            case 1://create a new class and add a professor
                                System.out.println("Type the name of the new Course: ");
                                Scanner newClassName= new Scanner(System.in);
                                String newClasstoAdd=newClassName.nextLine();
                                System.out.println("Type the room to asign to the new Course: ");
                                Scanner newRoom= new Scanner(System.in);
                                int newRoomtoAdd=newRoom.nextInt();
                                int subMenuCounter=0;

                                System.out.println("these are our Professors: ");
                                for(Professors i: globerUniversity.getProfessorsList() )
                                {
                                    subMenuCounter++;
                                    System.out.println(subMenuCounter+"."+"Name: "+i.getProfessorsName()+".ID: "+i.getProfessorsID()+"."+i.getProfessorType());
                                }
                                System.out.println("type the number of professor to add to the new Course: ");
                                Scanner newIDProfessor= new Scanner(System.in);
                                int typeID=newIDProfessor.nextInt();
                                globerUniversity.addCourse(new Courses(newClasstoAdd,newRoomtoAdd,globerUniversity.getProfessorsList().get(typeID-1)));
                                int lastClass=globerUniversity.getCoursesList().size()-1;
                                System.out.println("You have create the new course: "+globerUniversity.getCoursesList().get(lastClass).getCourseName()+" at the room: "
                                +globerUniversity.getCoursesList().get(lastClass).getRoomAsigned()+", and you have assignated the Professor: "+globerUniversity.getProfessorsList().get(typeID-1).getProfessorsName()+".");

                                break;
                            case 2:
                                if(globerUniversity.getCoursesList().size()<=6){
                                    System.out.println("please add a class first");
                                } else{
                                    System.out.println("here is our list of students");
                                    getStudentListInfo(globerUniversity);
                                    System.out.println("type the ID of the student you want to add to the new class");
                                    Scanner askId= new Scanner(System.in);
                                    int askIDStudent=askId.nextInt();
                                    for(int i=0;i<globerUniversity.getStudentsList().size();i++){
                                        int actualID=globerUniversity.getStudentsList().get(i).getStudentsID();
                                        if(actualID==askIDStudent)
                                        {

                                            int lastCourseID=globerUniversity.getCoursesList().size();
                                            globerUniversity.addStudentToCourse(lastCourseID,i);
                                            int lastClassIndex=globerUniversity.getCoursesList().size()-1;
                                            System.out.println("You have create the new course: "+globerUniversity.getCoursesList().get(lastClassIndex).getCourseName()
                                                    +" and you have add the student: "+globerUniversity.getStudentsList().get(i).getStudentsName());
                                            isFourStillRunnin=false;
                                        }

                                    }
                                }

                                break;
                            case 3:
                                System.out.println("Gettin back to the main menu...");
                                isFourStillRunnin=false;
                                break;
                        }
                    }
                    break;
                case 5:
                    boolean isFiveStillRunin=true;
                    while (isFiveStillRunin)
                    {
                        System.out.println("Here are our students of our university");
                        getStudentListInfo(globerUniversity);
                        System.out.println("please type the ID of the student to know in wich courses is added: ");

                        Scanner askingForID=new Scanner(System.in);
                        int theIdWeNeedToLookInto=askingForID.nextInt();
                        for(Courses i: globerUniversity.getCoursesList())
                        {
                            for(Students iSecond: i.getStudentsAtCourse()){
                                if(theIdWeNeedToLookInto==iSecond.getStudentsID())
                                {
                                    System.out.println("The student: "+iSecond.getStudentsName()+" is added to the courses:");
                                    System.out.println("\n"+i.getCourseName());
                                    isFiveStillRunin=false;
                                }

                            }
                        }
                        System.out.println("\n++++++++++++++++++++++++\n");
                    }

                    break;
                case 6:
                    System.out.println("bye bye. Thanks for using our System");
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
                "\n 3) Add a new student to an existing class" +
                "\n 4) Create a new course, add a new professor and new classmates"+
                "\n 5) Get all courses info in which a random student is signed up " +
                "\n 6) Exit");
    }

    public static void startSubMenuCase4(){
        System.out.println("Please type one of the following options if you wan to: " +
                "\n1)Create a new Course and assing a professor" +
                "\n2)Add a student to new Course" +
                "\n3) Get back to the main menu");
    }
    public static int starSubMenuClasses(University university)
    {

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
        newUniversity.addProfessor(new FullTimeProfessor("Francisco el matematico", 1000, 152,26));
        newUniversity.addProfessor(new FullTimeProfessor("Ms Poppin", 100632,452, 15));
        newUniversity.addProfessor(new FullTimeProfessor("Naruto uzumaki", 10056,865, 20));
        newUniversity.addProfessor(new FullTimeProfessor("Perry the platyus", 58064,89, 30));

        //Part time professors
        newUniversity.addProfessor(new PartTimeProfessor("Carmen Sandiego",15222,29,36));
        newUniversity.addProfessor(new PartTimeProfessor("Lady bug",12641,28,15));
        newUniversity.addProfessor(new PartTimeProfessor("lil nas X",4984,15,40));

        //students
        newUniversity.addStudent(new Students(12, "juanito alimañana", 20));
        newUniversity.addStudent(new Students(23, "Peppa pig", 17));
        newUniversity.addStudent(new Students(35, "melo caramelo", 24));
        newUniversity.addStudent(new Students(45,"Florinda Mesa", 25));
        newUniversity.addStudent(new Students(52, "armando casas", 29));
        newUniversity.addStudent(new Students(66, "Elton Jhon", 29));
        newUniversity.addStudent(new Students(78, "Lady Gaga", 16));
        newUniversity.addStudent(new Students(80, "Rana Rene", 35));
        newUniversity.addStudent(new Students(52, "Mary lu", 326));
        newUniversity.addStudent(new Students(89, "Mario El crack", 326));
        newUniversity.addStudent(new Students(36, "Luisito el pillo", 30));
        newUniversity.addStudent(new Students(25, "Yisus Crist SuperStar", 326));
        newUniversity.addStudent(new Students(15, "Stromae le paris", 18));
        newUniversity.addStudent(new Students(87, "Popeye the sailor", 56));

        //Courses

        newUniversity.addCourse(new Courses("spying",15,newUniversity.getProfessorsList().get(3)));
        newUniversity.addCourse(new Courses("Etics",15,newUniversity.getProfessorsList().get(4)));
        newUniversity.addCourse(new Courses("Differential Equations",15,newUniversity.getProfessorsList().get(0)));
        newUniversity.addCourse(new Courses("Biomaterials",15,newUniversity.getProfessorsList().get(2)));
        newUniversity.addCourse(new Courses("Piano 3",15,newUniversity.getProfessorsList().get(6)));
        newUniversity.addCourse(new Courses("Advance Salsa",15,newUniversity.getProfessorsList().get(1)));

        newUniversity.addStudentToCourse(1,1);
        newUniversity.addStudentToCourse(1,2);
        newUniversity.addStudentToCourse(1,3);
        newUniversity.addStudentToCourse(1,4);
        newUniversity.addStudentToCourse(2,5);
        newUniversity.addStudentToCourse(2,6);
        newUniversity.addStudentToCourse(2,4);
        newUniversity.addStudentToCourse(3,7);
        newUniversity.addStudentToCourse(3,12);
        newUniversity.addStudentToCourse(4,10);
        newUniversity.addStudentToCourse(5,9);
        newUniversity.addStudentToCourse(6,8);
        newUniversity.addStudentToCourse(6,11);
        newUniversity.addStudentToCourse(3,11);

        return newUniversity;
    }


}


