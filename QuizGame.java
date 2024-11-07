import java.util.ArrayList;
import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Question> questions = new ArrayList<>();

        // Sample Questions
        questions.add(new Question("What is the capital of France?", new String[]{"Berlin", "Madrid", "Paris", "Lisbon"}, 2));
        questions.add(new Question("Which planet is known as the Red Planet?", new String[]{"Earth", "Mars", "Jupiter", "Saturn"}, 1));
        questions.add(new Question("What is 2 + 2?", new String[]{"3", "4", "5", "6"}, 1));
        question.add(new Question("who is the founder of tesla ?",new String[]{"Elon Musk","martin Eberhard","JB Straubel","Mark zuckerberg"},0));
        question.add(new Question("what's the duration of Shivaji empire",new String[]{"1675 to 1818","1674 to 1818","1600 to 1800","1650 to 1902","1676 to 1819"},1));

        int score = 0;

        // Quiz Logic
        for (Question q : questions) {
            System.out.println(q.getQuestion());
            String[] options = q.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ": " + options[i]);
            }
            System.out.print("Choose your answer (1-" + options.length + "): ");
            int answer = scanner.nextInt() - 1;

            if (q.isCorrect(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " + options[q.correctAnswerIndex]);
            }
            System.out.println(); // Add a line break for readability
        }

        System.out.println("Your final score: " + score + "/" + questions.size());
        scanner.close();
    }
}