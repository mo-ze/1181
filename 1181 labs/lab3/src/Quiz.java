import java.util.ArrayList;
import java.util.Scanner;

/**
 * quiz class: Creates a quiz
 * @author Mohammad Zafar
 */
public class Quiz {
    static int quiznumber = 0;
    private ArrayList<Question> quiz;

    /**
     * this creates an quiz : constructor method
     *
     */
    public Quiz() {

        this.quiz = new ArrayList<Question>(25);
        quiznumber++;
    }

    /**
     * add question: a quiz can only have max 25 questions
     * @param q
     */
    public void addQuestion(Question q) {
        if (this.quiz.size()<25){
        this.quiz.add(q);}

    }

    /**
     * to string prints all the questions in the quiz with the answers and difficulty
     * @return the string  of the object question in this quiz
     */
    public String toString() {
        String t = "";
        for (Question q : this.quiz) {
            t += q.toString();
            t += "\n";
        }
        return t;
    }

    /**
     * giveQuiz : ask the user question 1 by 1 then check whether its correct. at the end ; display the number of correct question
     */
    public void giveQuiz(){
        Scanner s1 = new Scanner(System.in);
        int corectness=0;
        for (Question q:this.quiz) {

           System.out.println( q.getQuestion()+" (Difficulty: "+q.getDifficulty()+") ");
            String a=s1.nextLine();
            if (q.isCorrect(a)){
                System.out.println("correct");
                corectness++;

            }
            else {
                System.out.println("Incorrect");
            }

        }
        System.out.println("your score is:"+corectness);

//        s1.close();
    }

    /**
     * giveQuiz : ask the user question 1 by 1 if they match the criteria then check whether its correct. at the end ; display the number of correct question
     */
    public void giveQuiz(int min, int max ){
        Scanner s = new Scanner(System.in);
        int corectness=0;
        for (Question q:this.quiz) {

            int h = q.getDifficulty();
            if (h>=min&&h<=max) {
                System.out.println(q.getQuestion() + " (Difficulty: " + q.getDifficulty() + ") ");
                String a = s.nextLine();
                if (q.isCorrect(a)) {
                    System.out.println("correct");
                    corectness++;

                } else {
                    System.out.println("Incorrect");
                }



        }}
        System.out.println("your score is:" + corectness);
//        s.close();
    }
}
