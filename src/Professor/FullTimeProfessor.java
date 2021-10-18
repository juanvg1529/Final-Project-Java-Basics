package Professor;

import java.net.IDN;

public class FullTimeProfessor extends Professors {
    private int experienceYears;

    public FullTimeProfessor(String professorsName, float professorSalary, int professorsID, int experienceYears) {
        super(professorsName, professorSalary, professorsID);
        this.experienceYears = experienceYears;
    }

    @Override
    public float getSalary() {
        return (float) (super.professorSalary+this.experienceYears*1.10);
    }

    @Override
    public String getProfessorType() {
        return "Full Time Professor ";
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
}
