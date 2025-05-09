public class Student implements Units {
    private String studentName;
    private String studentId;
    private double studentTuitionFee;

    public Student(String studentName, String studentId, double studentTuitionFee) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentTuitionFee = studentTuitionFee;
    }

    @Override
    public int getStudentCount() {
        return 1;
    }

    @Override
    public double getBudget() {
        return -studentTuitionFee;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Student: " + studentName + " (ID: " + studentId + "), Tuition: " + studentTuitionFee);
    }
}
