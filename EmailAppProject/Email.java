
public class Email {
    private final String firstName;
    private final String lastName;
    private final String department;
    private final String email;
    private String password;
    private String alternateEmail;
    private int mailboxCapacity = 500;

    // Constructor to receive first name and last name
    public Email(String firstName, String lastName, int depChoice) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment(depChoice);
        this.password = generatePassword(8);
        this.email = generateEmail();

        System.out.println("\nDISPLAY NAME: " + this.firstName + " " + this.lastName);
        System.out.println("COMPANY EMAIL: " + this.email);
        System.out.println("PASSWORD: " + this.password);
        System.out.println("MAILBOX CAPACITY: " + this.mailboxCapacity + "MB");
        System.out.println("ALTERNATE EMAIL: " + (this.alternateEmail != null ? this.alternateEmail : "None"));
    }

    private String setDepartment(int depChoice) {
        return switch (depChoice) {
            case 1 -> "sales";
            case 2 -> "dev";
            case 3 -> "acct";
            default -> "";
        };
    }

    private String generateEmail() {
        String dept = department.isEmpty() ? "" : department + ".";
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + dept + "company.com";
    }

    private String generatePassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    // Setters
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    // Show info
    public void showInfo() {
        System.out.println("\nUpdated Info:\n");
        System.out.println("DISPLAY NAME: " + firstName + " " + lastName);
        System.out.println("COMPANY EMAIL: " + email);
        System.out.println("PASSWORD: " + password);
        System.out.println("MAILBOX CAPACITY: " + mailboxCapacity + "MB");
        System.out.println("ALTERNATE EMAIL: " + (alternateEmail != null ? alternateEmail : "None"));
    }
}
