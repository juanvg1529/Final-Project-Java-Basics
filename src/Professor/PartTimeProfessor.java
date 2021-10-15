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
        return super.professorSalary*hoursPerWeek;
    }
}
