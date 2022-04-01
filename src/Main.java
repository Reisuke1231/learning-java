import java.util.Scanner;

public class Main {

    public static double salaryCalculator(double hoursPerWeek, double moneyPerHour) {
        double weeksPerYear = 365 / 7;
        double weeksDayOff = 120 / 7;
        double weeksWorking = weeksPerYear - weeksDayOff;

        return moneyPerHour * hoursPerWeek * weeksWorking;
    }

    public static void main(String[] args) {
        double hoursPerWeek;
        double moneyPerHour;

        do {
            System.out.println("Input the number of hours you works per week");
            Scanner inputHours = new Scanner(System.in);
            hoursPerWeek = inputHours.nextDouble();
        } while (hoursPerWeek <= 0);


        do {
            System.out.println("Input the amount of money you makes per hour");
            Scanner inputMoney = new Scanner(System.in);
            moneyPerHour = inputMoney.nextDouble();
        } while (moneyPerHour <= 0);

        double yearlySalary = salaryCalculator(hoursPerWeek, moneyPerHour);

        System.out.println("Annual salary is " + yearlySalary);}
}
