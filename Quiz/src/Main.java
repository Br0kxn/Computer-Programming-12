import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Quiz quiz = new Quiz(new ArrayList<Questions>());

        int check = 1;
        while (check != 0)
        {
            System.out.println("Add question: [a], Do the quiz: [b], exit: [c]");
            String str = in.nextLine();
            if(str.equals("a")) {
                System.out.println("Please enter your question: ");
                String question = in.nextLine();
                System.out.println("What is your first answer? ");
                String a = in.nextLine();
                System.out.println("What is your second answer? ");
                String b = in.nextLine();
                System.out.println("What is your third answer? ");
                String c = in.nextLine();
                System.out.println("What is your fourth answer? ");
                String d = in.nextLine();
                System.out.println("What is the real answer? ");
                String realAnswer = in.nextLine();
                quiz.addQuestion(new Questions(question, a, b, c , d, realAnswer));

            } else if(str.equals("b")) {
                int count = 0;
                for(Questions listOfQuestion : quiz.getQuiz()){
                    System.out.println(listOfQuestion.getQuestions() + " Type your answer");
                    System.out.println("(a) " + listOfQuestion.getAnswer1());
                    System.out.println("(b) " + listOfQuestion.getAnswer2());
                    System.out.println("(c) " + listOfQuestion.getAnswer3());
                    System.out.println("(d) " + listOfQuestion.getAnswer4());
                    String result = in.nextLine();

                    if(listOfQuestion.checkResponse(result)){
                        count++;
                    }
                    System.out.println(listOfQuestion.checkResponse(result));
                }
                System.out.println("Your score is: " + count + "/" + quiz.getQuiz().size());
            }else if(str.equals("c")) {
                System.out.println("Thank you for playing! ");
                check = 0;
            }else {
                System.out.println("Please try again. ");
            }
        }
    }
}