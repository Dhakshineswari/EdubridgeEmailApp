import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("New Worker: John. Department Codes:");
            System.out.println("1 for Sales");
            System.out.println("2 for Development");
            System.out.println("3 for Accounting");
            System.out.println("0 for None");
            System.out.print("Enter Department Code: ");
            int depChoice = in.nextInt();
            in.nextLine(); // consume newline
            Email em1 = new Email("John", "Doe", depChoice);
            // Example usage
            em1.setMailboxCapacity(1000);
            em1.setAlternateEmail("john.alt@example.com");
            em1.changePassword("NewPassword123");
            em1.showInfo();
            // Close the Scanner to avoid warning
        }
    }
}
