import java.util.Scanner;

/**
 * class to manually test the quiz class
 */



public class Quiztime {


    public static void main(String[] args) {
//        make question
        Question q1 = new Question("what is the color of sky?", "blue", 3);
        Question q2 = new Question("which is the highest mountain in the world", "Mount Everest", 4);
        Question q3 = new Question("what color is the moon", "white", 5);
        Question q4 = new Question("what is the color of mars", "red", 7);

        Question q5 =new Question("do cats have toes?","no", 10);
        Question q6 =new Question("What is a period of ten years called?","Decade",8);
        Question q7= new Question("How many months have 31 days?","7",7);
        Question q8=new Question("How many sides does a dodecahedron have?","12",10);
        //    add to quiz

        Quiz quiz = new Quiz();
        quiz.addQuestion(q1);
        quiz.addQuestion(q2);
        quiz.addQuestion(q3);
        quiz.addQuestion(q4);
        quiz.addQuestion(q5);
        quiz.addQuestion(q6);
        quiz.addQuestion(q6);
        quiz.addQuestion(q7);
        quiz.addQuestion(q8);
        Quiz quiz1=new Quiz();
        quiz1.addQuestion(q1);
        quiz1.addQuestion(q2);
        quiz1.addQuestion(q3);
        quiz1.addQuestion(q4);
        quiz1.addQuestion(q5);
        quiz1.addQuestion(q6);
        quiz1.addQuestion(q6);
        quiz1.addQuestion(q7);
        quiz1.addQuestion(q8);
        // run the quiz
        System.out.println("you have "+Quiz.quiznumber+" to do ");
        System.out.println("-----Quiz 1 has started -----");

        quiz.giveQuiz();
        System.out.println("-----Quiz 1 has ended -----");

        System.out.println("-----Quiz 2 has started -----");
        quiz.giveQuiz(5,10);


    }
}
