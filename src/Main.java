
public class Main {

    public static void main(String[] args) {

        // ── Leaf nodes: Teachers ──────────────────────────────────────────
        Teacher msReyes   = new Teacher("Ms. Reyes",   "CS Fundamentals", 85_000);
        Teacher mrSantos  = new Teacher("Mr. Santos",  "Algorithms",      90_000);
        Teacher msLim     = new Teacher("Ms. Lim",     "Networking",      80_000);
        Teacher drFlores  = new Teacher("Dr. Flores",  "Dean's Office",  120_000);
        Teacher mrGarcia  = new Teacher("Mr. Garcia",  "Economics",       75_000);

        // ── Leaf nodes: Students ──────────────────────────────────────────
        Student anaCruz  = new Student("Ana Cruz",  "2024-0001", 55_000);
        Student benTan   = new Student("Ben Tan",   "2024-0002", 55_000);
        Student caraDy   = new Student("Cara Dy",   "2024-0003", 52_000);
        Student davidGo  = new Student("David Go",  "2024-0004", 48_000);
        Student eveYu    = new Student("Eve Yu",    "2024-0005", 48_000);

        // ── Composite: Departments ────────────────────────────────────────
        Department cs = new Department("Department of Computer Science");
        cs.add(msReyes);
        cs.add(mrSantos);
        cs.add(anaCruz);
        cs.add(benTan);

        Department it = new Department("Department of Information Technology");
        it.add(msLim);
        it.add(caraDy);

        Department management = new Department("Department of Management");
        management.add(mrGarcia);
        management.add(davidGo);

        // ── Composite: Colleges ───────────────────────────────────────────
        College engineering = new College("College of Engineering");
        engineering.add(cs);
        engineering.add(it);
        engineering.add(drFlores);   // teacher attached directly to the college

        College business = new College("College of Business");
        business.add(management);
        business.add(eveYu);         // student enrolled directly in the college

        // ── Root composite: University ────────────────────────────────────
        College university = new College("New Era University");
        university.add(engineering);
        university.add(business);

        // ═════════════════════════════════════════════════════════════════
        // REQUIREMENT 3 – Display full hierarchy details
        // ═════════════════════════════════════════════════════════════════
        System.out.println("=".repeat(55));
        System.out.println("  NEW ERA UNIVERSITY - ORGANIZATIONAL STRUCTURE");
        System.out.println("=".repeat(55));
        university.displayDetails();
        System.out.println();

        // ═════════════════════════════════════════════════════════════════
        // REQUIREMENT 2 – Student counts
        // ═════════════════════════════════════════════════════════════════
        System.out.println("─".repeat(55));
        System.out.println("STUDENT COUNT SUMMARY");
        System.out.println("─".repeat(55));
        System.out.printf("  University total  : %d students%n",    university.getStudentCount());
        System.out.printf("  College of Eng.   : %d students%n",    engineering.getStudentCount());
        System.out.printf("    Dept. CS         : %d students%n",   cs.getStudentCount());
        System.out.printf("    Dept. IT         : %d students%n",   it.getStudentCount());
        System.out.printf("  College of Bus.   : %d students%n",    business.getStudentCount());
        System.out.printf("    Dept. Mgmt       : %d students%n",   management.getStudentCount());
        System.out.println();

        // ═════════════════════════════════════════════════════════════════
        // REQUIREMENT 4 – Budget calculations
        // ═════════════════════════════════════════════════════════════════
        System.out.println("─".repeat(55));
        System.out.println("BUDGET SUMMARY  (PHP)");
        System.out.println("─".repeat(55));
        System.out.printf("  Ms. Reyes (Teacher)           : %+12.2f%n", msReyes.getBudget());
        System.out.printf("  Ana Cruz (Student)             : %+12.2f%n", anaCruz.getBudget());
        System.out.printf("  Dept. of Computer Science      : %+12.2f%n", cs.getBudget());
        System.out.printf("  Dept. of IT                    : %+12.2f%n", it.getBudget());
        System.out.printf("  College of Engineering         : %+12.2f%n", engineering.getBudget());
        System.out.printf("  College of Business            : %+12.2f%n", business.getBudget());
        System.out.printf("  %-30s : %+12.2f%n", "UNIVERSITY TOTAL BUDGET", university.getBudget());
        System.out.println("─".repeat(55));
        System.out.println("  Positive = cost to university (salaries)");
        System.out.println("  Negative = revenue for university (tuition)");
        System.out.println("=".repeat(55));
    }
}