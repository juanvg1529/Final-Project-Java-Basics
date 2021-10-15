package Runner;

import Professor.FullTimeProfessor;
import University.University;

public class Main {
    public static void main(String[] args) {

        University globerUnivesity= new University();
         globerUnivesity.addProfessor(new FullTimeProfessor("Francisco el matematico",1000,9) );
        System.out.println( globerUnivesity.getProfessorsList().get(0).getProfessorsName());
    }
}
