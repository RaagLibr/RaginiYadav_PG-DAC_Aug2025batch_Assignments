public class TestQue29 {

    // Abstract Employee class
    static abstract class Employee {
        String name;

        Employee(String name) {
            this.name = name;
        }

        // Abstract method (must be implemented by subclasses)
        abstract double calculateSalary();
    }

    // Interface for bonus
    interface BonusEligible {
        double calculateBonus();
    }

    // Permanent Employee
    static class PermanentEmployee extends Employee implements BonusEligible {
        double basicSalary;
        double hra;

        PermanentEmployee(String name, double basicSalary, double hra) {
            super(name);
            this.basicSalary = basicSalary;
            this.hra = hra;
        }

        @Override
        double calculateSalary() {
            return basicSalary + hra;
        }

        @Override
        public double calculateBonus() {
            return calculateSalary() * 0.10; // 10% bonus
        }
    }

    // Contract Employee
    static class ContractEmployee extends Employee {
        double hourlyRate;
        int hoursWorked;

        ContractEmployee(String name, double hourlyRate, int hoursWorked) {
            super(name);
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }

        @Override
        double calculateSalary() {
            return hourlyRate * hoursWorked;
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create employees
        PermanentEmployee emp1 = new PermanentEmployee("Amit", 50000, 5000);
        PermanentEmployee emp2 = new PermanentEmployee("Ravi", 40000, 4000);

        ContractEmployee emp3 = new ContractEmployee("Neha", 300, 100);
        ContractEmployee emp4 = new ContractEmployee("Sonal", 250, 120);

        // Print details directly (no array, no loop)
        System.out.println(emp1.name + " Salary = " + emp1.calculateSalary() + ", Bonus = " + emp1.calculateBonus());
        System.out.println(emp2.name + " Salary = " + emp2.calculateSalary() + ", Bonus = " + emp2.calculateBonus());
        System.out.println(emp3.name + " Salary = " + emp3.calculateSalary());
        System.out.println(emp4.name + " Salary = " + emp4.calculateSalary());
    }
}
