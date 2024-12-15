import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Data data = new Data();

        List <Map<String, String>> questionData = data.getQuestionData();

        Question[] questionBank = new Question[questionData.size()];

        int index = 0;
        for (Map<String, String> questionMap : questionData) {
           questionBank[index] = new Question(questionMap.get("text"), questionMap.get("answer"));
           index++;
        }

        QuizBrain quiz = new QuizBrain(questionBank, scanner);

        while (quiz.stillHasQuestion()) {
            quiz.nextQuestion();
        }

        System.out.println("Congratulations! You've completed the quiz!");
        System.out.println("Your final score is: " + quiz.getScore() + " out of " + questionBank.length + ".");

        scanner.close();
    }
}