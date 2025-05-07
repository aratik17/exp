package exp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class Person {
    String name;
    Date dob;

    public Person(String name, String dobStr) {
        try {
            this.name = name;
            if (dobStr.charAt(2) == '-') {
                this.dob = new SimpleDateFormat("dd-MM-yyyy").parse(dobStr);
            } else {
                this.dob = new SimpleDateFormat("yyyy-MM-dd").parse(dobStr);
            }
        } catch (Exception e) {
            System.out.println("Invalid date format");
        }
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge() {
        Calendar birthCal = Calendar.getInstance();
        birthCal.setTime(dob);
        int birthYear = birthCal.get(Calendar.YEAR);

        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);

        int age = currentYear - birthYear;
        System.out.println("Age: " + age + " years");
    }
}