import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        boolean hasPerfectAttendance = true;

        String studentFirstName = "Reisuke";
        String studentLastName = "H";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);
        String studentName = "Reisuke H";


        System.out.println(studentAge);
        System.out.println(hasPerfectAttendance);
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);

        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);
    }
}
