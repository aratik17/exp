package exp;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;

class student {
    String name;
    Date dob;

    public void getDetails() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter student name: ");
            name = sc.nextLine();

            System.out.print("Enter date of birth (DD-MM-YYYY or YYYY-MM-DD): ");
            String dobStr = sc.nextLine();

            if (dobStr.contains("-") && dobStr.charAt(2) == '-') {
                dob = new SimpleDateFormat("dd-MM-yyyy").parse(dobStr);
            } else {
                dob = new SimpleDateFormat("yyyy-MM-dd").parse(dobStr);
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Invalid date format.");
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        Calendar birthCal = Calendar.getInstance();
        birthCal.setTime(dob);
        int birthYear = birthCal.get(Calendar.YEAR);

        Calendar currentCal = Calendar.getInstance();
        int currentYear = currentCal.get(Calendar.YEAR);

        int age = currentYear - birthYear;
        System.out.println("Age: " + age + " years");
    }

    public static void main(String[] args) {
        student s = new student();
        s.getDetails();
        s.displayDetails();
    }
}
