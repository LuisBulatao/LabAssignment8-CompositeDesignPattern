public class Teacher implements Units {
    private String professorName;
    private String professorSubject;
    private double professorSalary;

    public Teacher(String professorName, String professorSubject, double professorSalary) {
        this.professorName = professorName;
        this.professorSubject = professorSubject;
        this.professorSalary = professorSalary;
    }

    @Override
    public int getStudentCount() {
        return 0;
    }

    @Override
    public double getBudget() {
        return professorSalary;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Teacher: " + professorName + ", Subject: " + professorSubject + ", Salary: " + professorSalary);
    }
}