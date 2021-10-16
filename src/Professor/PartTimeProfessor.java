package Professor;

public class PartTimeProfessor extends Professors {
     public int hoursPerWeek;
    //Constructor
    public PartTimeProfessor(String professorsName, float professorSalary, int hoursPerWeek) {
        super(professorsName, professorSalary);
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public float getSalary() {
        return super.professorSalary*hoursPerWeek*0.0052f;
        //0,0052 its the relation between 1 month vs 192 hours of work at month in colombia
    }

    @Override
    public String getProfessorType() {
        return "Part Time Professor";
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }
}
