public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Luis Joshua Bulatao", "22-12052-303", 50000);
        Student student2 = new Student("Princess Heart Bulatao", "24-12052-303", 45000);

        Teacher teacher1 = new Teacher("Prof. Jerry Esperanza", "Computer Science", 70000);
        Teacher teacher2 = new Teacher("Prof. Marc Laureta", "IT", 55000);

        Department csDepartment = new Department("Computer Science");
        csDepartment.addUnit(teacher1);
        csDepartment.addUnit(student1);

        Department itDepartment = new Department("Information Technology");
        itDepartment.addUnit(teacher2);
        itDepartment.addUnit(student2);

        College engCollege = new College("College of Informatics and Computing Studies");
        engCollege.addUnit(csDepartment);
        engCollege.addUnit(itDepartment);

        engCollege.displayDetails("");
        System.out.println("Total Students: " + engCollege.getStudentCount());
        System.out.println("Total Budget: " + engCollege.getBudget());
    }
}
