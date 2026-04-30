public class Teacher implements EducationalUnit {

    private final String name;
    private final String subject;
    private final double salary;

    public Teacher(String name, String subject, double salary) {
        this.name    = name;
        this.subject = subject;
        this.salary  = salary;
    }

    @Override
    public int getStudentCount() {
        return 0; 
    }

    @Override
    public double getBudget() {
        return salary; 
    }

    @Override
    public void displayDetails() {
        System.out.println("  Teacher: " + name + " (Subject: " + subject
                + ", Salary: PHP " + String.format("%.2f", salary) + ")");
    }

    public String getName()    { return name; }
    public String getSubject() { return subject; }
    public double getSalary()  { return salary; }
}