package exp;

import java.util.Scanner;

class course {
    String courseName;
    int marks;

    public void getCourseDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter course name: ");
        courseName = sc.nextLine();
        System.out.print("Enter marks: ");
        marks = sc.nextInt();
        sc.close();
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        course c = new course();
        c.getCourseDetails();
        c.displayCourseDetails();
    }
}

