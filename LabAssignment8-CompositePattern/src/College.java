import java.util.ArrayList;
import java.util.List;
public class College implements Units {
    private String courseName;
    private List<Units> units = new ArrayList<>();

    public College(String name) {
        this.courseName = name;
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
        System.out.println(indent + "College: " + courseName);
        for (Units unit : units) {
            unit.displayDetails(indent + "  ");
        }
    }
}
