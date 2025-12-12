import java.util.Scanner;

public class NAME{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your roll number: ");
        int roll = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter your branch: ");
        String branch = sc.nextLine();

        System.out.println("enter your section");
        String section= sc.nextLine();

        // Output
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Branch: " + branch);
        System.out.println("section:" +section);

        sc.close();
    }
}
