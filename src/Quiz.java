import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<Question>();
    private int numberOfCorrectAnswers = 0;

    private Scanner scanner = new Scanner(System.in);

    public Quiz(){

    }

    public void addQuestion(Question question){
        this.questions.add(question);
    }

    public void runQuiz(){
        for (Question question: questions){
            System.out.println(question.getQuestion());
            String usersAnswer = this.getUserAnswer();
            boolean userGotCorrectAnswer = question.checkAnswer(usersAnswer);
            if (userGotCorrectAnswer){
                this.numberOfCorrectAnswers++;
            }
        }
        double percentCorrect = ((double) this.numberOfCorrectAnswers/(double)this.questions.size())*100;
        System.out.println("Your Grade: "+ percentCorrect + "%");
    }

    private String getUserAnswer() {
       String userAnswer = scanner.nextLine();
       return userAnswer;
    }
}
