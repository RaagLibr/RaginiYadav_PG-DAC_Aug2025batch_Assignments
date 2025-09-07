import java.util.Scanner;

class TeaCup {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cup1: teaType = ");
        CounterDemo cup1 = new CounterDemo(sc.nextLine());

        System.out.print("Cup2: teaType = ");
        CounterDemo cup2 = new CounterDemo(sc.nextLine());

        System.out.print("Cup3: teaType = ");
        CounterDemo cup3 = new CounterDemo(sc.nextLine());

        // Print tea types
        System.out.println("Cup1 type: " + cup1.getTeaType());
        System.out.println("Cup2 type: " + cup2.getTeaType());
        System.out.println("Cup3 type: " + cup3.getTeaType());

        // Show total cups
        CounterDemo.showTotalCups();
    }
}

class CounterDemo {
    private String teaType;          // instance variable
    private static int countCup = 0; // static counter

    // Constructor
    CounterDemo(String teaType) {
        this.teaType = teaType;
        countCup++;
    }

    // Getter (no parameter needed)
    public String getTeaType() {
        return teaType;
    }

    // Static method to show total cups
    public static void showTotalCups() {
        System.out.println("Total cups made: " + countCup);
    }
}
