import java.util.ArrayList;
import java.util.List;

public class Department implements Units {
    private String departmentName;
    private List<Units> units = new ArrayList<>();

    public Department(String name) {
        this.departmentName = name;
    }

    public void addUnit(Units unit) {
        units.add(unit);
    }

    @Override
    public int getStudentCount() {
        return units.stream().mapToInt(Units::getStudentCount).sum();
    }

    @Override
    public double getBudget() {
        return units.stream().mapToDouble(Units::getBudget).sum();
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Department: " + departmentName);
        for (Units unit : units) {
            unit.displayDetails(indent + "  ");
        }
    }
}
