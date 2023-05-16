package Student_Database_Application;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private ArrayList<String> courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        // in.close(); Don't close the scanner multiple times

        setStudentID();

        courses = new ArrayList<>();
        this.tuitionBalance = 0;
    }

    // generate an id
    private void setStudentID() {
        id++;
        // Grade level + id
        this.studentID = this.gradeYear + "" + id;
    }

    // enroll in courses
    public void enroll() {
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses.add(course);
                this.tuitionBalance += costOfCourse;
            } else {
                break;
            }
        } while (true);

        System.out.println("Enrolled in: " + courses.toString());
    }

    // View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + this.tuitionBalance);
    }

    // pay tuition
    public void payTuition() {
        Scanner in = new Scanner(System.in);
        viewBalance();
        System.out.print("Enter your payment: $");
        int payment = in.nextInt();
        this.tuitionBalance = this.tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // show status
    public String showInfo() {
        return "Name: " + this.firstName + " " + this.lastName + "\nGrade level: " + this.gradeYear + "\nStudentID: "
                + this.studentID + "\nCourses enclosed: " + courses.toString()
                + "\nBalance: $" + this.tuitionBalance;
    }
}
