import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int passwordLength;
    private String passwordSet;
    private String department;
    private String email;
    private int mailboxCapacity;
    private String alternateEmail;
    private String companySuffix = "company.com";

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // Call a method that returns a random password
        this.passwordLength = 10;
        this.passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890&^%$#";
        this.password = randomPassword(this.passwordLength);
        System.out.println("password: " + this.password);

        // Combine elements to generate email -
        // firstname.lastname@department.company.com
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Email created!!");
        System.out.println("Your email: " + this.email);

    }

    private String setDepartment() {
        System.out.println(
                "Enter the department: \n1 for Sales\n2 for Development\n3 for Accounting\nEnter Department Code: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        in.close();
        switch (input) {
            case 1:
                return "Sales";
            case 2:
                return "Development";
            case 3:
                return "Accounting";
            default:
                return "None";
        }
    }

    private String randomPassword(int length) {
        int len = passwordSet.length();
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int randomNumber = (int) ((len) * Math.random());
            password[i] = passwordSet.charAt(randomNumber);
        }
        return new String(password);
    }

    // set the mail capacity
    public void setMailCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // change the password
    public void changePassword(String password) {
        this.password = password;
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPasswordSet() {
        return passwordSet;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getCompanySuffix() {
        return companySuffix;
    }

    // show Information
    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName + " \n" +
                "COMPANY EMAIL: " + email + " \n" +
                "MAILBOX CAPACITY: " + mailboxCapacity;
    }
}