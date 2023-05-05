public class TrueFalse extends Question {
    public TrueFalse(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        String actualAnswer = this.getAnswer();
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())){
            return true;
        } else {
            return false;
        }
    }
}
