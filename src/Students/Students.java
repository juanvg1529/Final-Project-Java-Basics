package Students;

public class Students {
    private String studentsName;
    private int StudentsID;
    private int StudentsAge;

    public Students(String studentsName, int studentsID, int studentsAge) {
        this.studentsName = studentsName;
        StudentsID = studentsID;
        StudentsAge = studentsAge;
    }

    public String getStudentsName() {
        return studentsName;
    }

    public void setStudentsName(String studentsName) {
        this.studentsName = studentsName;
    }

    public int getStudentsID() {
        return StudentsID;
    }

    public void setStudentsID(int studentsID) {
        StudentsID = studentsID;
    }

    public int getStudentsAge() {
        return StudentsAge;
    }

    public void setStudentsAge(int studentsAge) {
        StudentsAge = studentsAge;
    }
}
