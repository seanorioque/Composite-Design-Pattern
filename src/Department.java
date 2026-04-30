
import java.util.ArrayList;
import java.util.List;


public class Department implements EducationalUnit {

    private final String name;
    private final List<EducationalUnit> members = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(EducationalUnit unit) {
        members.add(unit);
    }

    public void remove(EducationalUnit unit) {
        members.remove(unit);
    }

    public List<EducationalUnit> getChildren() {
        return List.copyOf(members);
    }


    @Override
    public int getStudentCount() {
        int count = 0;
        for (EducationalUnit unit : members) {
            count += unit.getStudentCount();
        }
        return count;
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (EducationalUnit unit : members) {
            total += unit.getBudget();
        }
        return total;
    }

    @Override
    public void displayDetails() {
        System.out.println("Department: " + name);
        System.out.println("  Students: " + getStudentCount()
                + " | Budget: PHP " + String.format("%.2f", getBudget()));
        for (EducationalUnit unit : members) {
            unit.displayDetails();
        }
    }


    public String getName() { return name; }
}