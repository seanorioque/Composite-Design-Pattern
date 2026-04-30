
public class Student implements EducationalUnit {

    private final String name;
    private final String studentId;
    private final double tuitionFee;

    public Student(String name, String studentId, double tuitionFee) {
        this.name       = name;
        this.studentId  = studentId;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public int getStudentCount() {
        return 1;
    }

    @Override
    public double getBudget() {
        return -tuitionFee; 
    }

    @Override
    public void displayDetails() {
        System.out.println("  Student: " + name + " (ID: " + studentId
                + ", Tuition: PHP " + String.format("%.2f", tuitionFee) + ")");
    }

    public String getName()       { return name; }
    public String getStudentId()  { return studentId; }
    public double getTuitionFee() { return tuitionFee; }
}