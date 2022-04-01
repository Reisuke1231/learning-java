import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String question = "Which one is cat's purr?";
        String choiceOne = "Bow wow";
        String choiceTwo = "Meow";
        String choiceThree = "Oink";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println("Choose one of the following: " + choiceOne + ", " + choiceTwo + ", " + choiceThree);

        Scanner input = new Scanner(System.in);
        String userInput = input.next();
        if (userInput.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }
    }
}
