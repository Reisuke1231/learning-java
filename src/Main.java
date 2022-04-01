import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input the number of hours you works per week");
        Scanner inputHours = new Scanner(System.in);
        double hoursPerWeek = inputHours.nextDouble();

        System.out.println("Input the amount of money you makes per hour");
        Scanner inputMoney = new Scanner(System.in);
        double moneyPerHour = inputMoney.nextDouble();

        double weeksPerYear = 365 / 7;
        double weeksDayOff = 120 / 7;
        double weeksWorking = weeksPerYear - weeksDayOff;
        double yearlySalary = moneyPerHour * hoursPerWeek * weeksWorking;

        System.out.println("Annual salary is " + yearlySalary);}

}
