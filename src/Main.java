import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String favoriteFood = "pizza";

        System.out.println("Pick a number between 1 and 100");
        Scanner scanner = new Scanner(System.in);
        int inputtedNum = scanner.nextInt();

        System.out.println(favoriteFood);
        if (inputtedNum < 100) {
            favoriteFood = "chicken tacos";
            System.out.println(favoriteFood);
        } else {
            favoriteFood = "steak";
            System.out.println(favoriteFood);
        }
    }
}
