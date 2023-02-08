import java.util.ArrayList;

public class Quiz {
    ArrayList<Questions> quiz;
    public Quiz(ArrayList<Questions> quiz) {
        this.quiz = new ArrayList<Questions>();
    }

    public ArrayList<Questions> getQuiz() {
        return quiz;
    }

    public void setQuiz(ArrayList<Questions> quiz) {
        this.quiz = quiz;
    }

    public void addQuestion(Questions questions){
        quiz.add(questions);
    }
    public Boolean checkQuestionAnswer(String answer, Questions questions){
        if(answer.equals(questions.getRealAnswer())){
            return true;
        } else {
            return false;
        }

    }

}
