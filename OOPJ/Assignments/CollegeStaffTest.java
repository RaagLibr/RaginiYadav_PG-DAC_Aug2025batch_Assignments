public class CollegeStaffTest {
    public static void main(String[] args) {
        Professor prof = new Professor("Dr. Sharma", 80000, "Math", "Algebra");
        Lecturer lec = new Lecturer("Ms. Mehta", 50000, "Physics", "Science");

        prof.displaySalary();
        lec.displaySalary();
    }
}

// Base class
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displaySalary() {
        System.out.println(name + " → Salary=" + salary);
    }
}

// Teaching staff (inherits Employee)
class TeachingStaff extends Employee {
    String subject;

    TeachingStaff(String name, double salary, String subject) {
        super(name, salary);
        this.subject = subject;
    }

    @Override
    public void displaySalary() {
        System.out.println(name + " → Subject=" + subject + ", Salary=" + salary);
    }
}

// Professor (inherits TeachingStaff)
class Professor extends TeachingStaff {
    String specialization;

    Professor(String name, double salary, String subject, String specialization) {
        super(name, salary, subject);
        this.specialization = specialization;
    }

    @Override
    public void displaySalary() {
        System.out.println(name + " → Subject=" + subject +
                ", Specialization=" + specialization +
                ", Salary=" + salary);
    }
}

// Lecturer (inherits TeachingStaff)
class Lecturer extends TeachingStaff {
    String department;

    Lecturer(String name, double salary, String subject, String department) {
        super(name, salary, subject);
        this.department = department;
    }

    @Override
    public void displaySalary() {
        System.out.println(name + " → Subject=" + subject +
                ", Department=" + department +
                ", Salary=" + salary);
    }
}
