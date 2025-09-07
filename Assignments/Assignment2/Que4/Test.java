import java.util.*;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Employee name " + (i + 1) + ":");
            String name = sc.nextLine();

            System.out.println("Salary " + (i + 1) + ":");
			long salryconversiontodeci = sc.nextInt();      //implicit type conversion
            double salary = salryconversiontodeci;

            System.out.println("Year of Service " + (i + 1) + ":");
            int yearOfService = sc.nextInt();

            sc.nextLine();  // Consume the leftover newline

            emp[i] = new Employee(name, salary, yearOfService);
        }

        // Assuming calculateBonus() is an instance method of Employee
        for (int i = 0; i < 3; i++) {
            System.out.println("Employee " + emp[i].getName() + " Bonus: " + emp[i].calculateBonus());
            System.out.println("Employee details: " + emp[i]);
        }
    }
}
