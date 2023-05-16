package Student_Database_Application;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        // Ask how many users we want to add
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of new students to enroll");
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].showInfo());
        }
        in.close();
    }
}