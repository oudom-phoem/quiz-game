import java.util.Scanner;

public class QuizBrain {
    private int questionNumber = 0;
    private int score = 0;
    private final Question[] questionList;
    private final Scanner scanner;

    public QuizBrain(Question[] questionList, Scanner scanner) {
        this.questionList = questionList;
        this.scanner = scanner;
    }

    public int getScore() {
        return score;
    }

    public boolean stillHasQuestion() {
        return questionNumber < questionList.length;
    }

    public void nextQuestion() {
        Question currentQuestion = this.questionList[this.questionNumber];
        this.questionNumber++;
        System.out.print("Q." + questionNumber + " " + currentQuestion.getText() + " (true/false)?: ");
        String userAnswer = scanner.nextLine();
        while (!userAnswer.equalsIgnoreCase("true") && !userAnswer.equalsIgnoreCase("false")) {
            System.out.print("Invalid input. Please enter 'true' or 'false': ");
            userAnswer = scanner.nextLine();
        }
        checkAnswer(userAnswer, currentQuestion.getAnswer());
    }

    public void checkAnswer(String userAnswer, String correctAnswer) {
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            this.score++;
            System.out.println("You got it right!");
        } else {
            System.out.println("That's wrong.");
        }
        System.out.println("The correct answer was: " + correctAnswer);
        System.out.println("Your current score is: " + this.score + "/" + this.questionNumber);
        System.out.println();
    }

}
