

import java.util.ArrayList;
import java.util.List;

public class College implements EducationalUnit {

    private final String name;
    private final List<EducationalUnit> children = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void add(EducationalUnit unit) {
        children.add(unit);
    }

    public void remove(EducationalUnit unit) {
        children.remove(unit);
    }

    public List<EducationalUnit> getChildren() {
        return List.copyOf(children);
    }


    @Override
    public int getStudentCount() {
        int count = 0;
        for (EducationalUnit unit : children) {
            count += unit.getStudentCount();
        }
        return count;
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (EducationalUnit unit : children) {
            total += unit.getBudget();
        }
        return total;
    }

    @Override
    public void displayDetails() {
        System.out.println("College: " + name);
        System.out.println("  Total Students: " + getStudentCount()
                + " | Net Budget: PHP " + String.format("%.2f", getBudget()));
        for (EducationalUnit unit : children) {
            unit.displayDetails();
        }
    }

    public String getName() { return name; }
}