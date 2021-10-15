package Professor;

public abstract class Professors {

    //atributes
    protected int professorsID;
    protected String professorsName;
    protected float professorSalary;

    int idCounterProfesors=1;

    //constructor
    public Professors(String professorsName, float professorSalary) {
        this.professorsName = professorsName;
        this.professorSalary = professorSalary;
        this.professorsID=this.idCounterProfesors++;
        /*
        <p>Everytime a professor is created the counter will add</p>
        */
    }
   public abstract float getSalary();
}

