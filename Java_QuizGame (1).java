import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is 5 + 7?"
        };

        String[][] options = {
            {"A. London", "B. Paris", "C. Rome", "D. Madrid"},
            {"A. Earth", "B. Mars", "C. Jupiter", "D. Venus"},
            {"A. 10", "B. 11", "C. 12", "D. 13"}
        };

        char[] answers = {'B', 'B', 'C'};
        char guess;
        int score = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (A, B, C, D): ");
            guess = scanner.next().charAt(0);

            if (Character.toUpperCase(guess) == answers[i]) {
                score++;
            }
        }

        System.out.println("Your score is: " + score + "/" + questions.length);
        scanner.close();
    }
}
