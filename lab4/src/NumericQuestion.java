/**
 * a question that involves numbers
 * @author mohammad zafar
 */

public class NumericQuestion extends Question {
    private double tolerance;

    /**
     * makes question
     * @param question
     * @param answer
     * @param difficulty
     * @param tolerance
     */
    public NumericQuestion(String question, String answer, int difficulty, double tolerance) {
        super(question, answer, difficulty);
        this.tolerance = tolerance;

    }

    /**
     * is the answer correct
     * @param attanswer answer from the user
     * @return true if correct or is in the range of tolerence, false otherwise.
     */
    public boolean isCorrect(String attanswer) {
   try {
         double attemptedans = Double.parseDouble(attanswer);
         double ans = Double.parseDouble(this.getAnswer());
         double difference = ans - attemptedans;
         double tolerateddif = Math.abs( difference);
         System.out.println(difference);
//
         return tolerateddif <= this.tolerance && tolerateddif >= 0;
         

     } catch (Exception e) {
         return false;
     }


    }


}
