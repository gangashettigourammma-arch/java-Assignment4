import java.util.Scanner;

public class InternshipEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name:");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Graduation Percentage: ");
        double percentage = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Contact Number: ");
        String contact = sc.nextLine();

        System.out.println("\n--- Applicant Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("percentage"  + percentage);
        System.out.println("Email: " + email);
        System.out.println("Contact: " + contact);

        if (contact.length() != 10) {
        System.out.println("\ncontact must be 10");
        } else if (age < 18) {
        System.out.println("\nNot Eligible: Age must be 18 or above");
        } else if (percentage < 60) {
        System.out.println("\nNot Eligible: Percentage must be 60 or above");
        } else {
        System.out.println("\nEligible for Internship");
        }

        sc.close();
    }
}