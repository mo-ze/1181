/**
 * class to manually test the quiz class
 * @author mohammad zafar
 */


public class Quiztime {
    public static void main(String[] args) {

        Question q2 = new Question("what is the color of mars", "red", 7);
        NumericQuestion n1 = new NumericQuestion("100-25", "75", 1, 1);
        Fillintheblank f1 = new Fillintheblank("String in java are _immutable_  ", 10);
        MultipleChoice mc1 = new MultipleChoice("Which of the following are loops statemnets in java", 5);

            mc1.addchoice("until", false);
            mc1.addchoice("blue", false);
            mc1.addchoice("for", true);
            mc1.addchoice("while", true);
            mc1.addchoice("none of the above", false );

        //    add to quiz
        Quiz quiz = new Quiz();
            quiz.addQuestion(n1);
            quiz.addQuestion(n1);
            quiz.addQuestion(n1);
            quiz.addQuestion(n1);


        System.out.println("you have " + Quiz.quiznumber + " to do ");
        System.out.println("-----Quiz 1 has started -----");

        quiz.giveQuiz();



    }
}
