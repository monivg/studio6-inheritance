public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz1 = new Quiz();

        MultipleChoice multipleChoice1 = new MultipleChoice("How many legs do horses have? \n A. one \n B. two\n C. three\n D.four", "D");
        quiz1.addQuestion(multipleChoice1);

        Checkbox checkbox1 = new Checkbox("Select all that apply.Which animals are mammals?\n A. dog \n B. cows \n C. horses \n D. snakes","A,B,C" );
        quiz1.addQuestion(checkbox1);

        TrueFalse trueFalse1 = new TrueFalse("Dogs are cats\n A. true \n B. false ","B" );
        quiz1.addQuestion(trueFalse1);

        quiz1.runQuiz();
    }
}