/**
 * a class to make fill in the blanks
 * @author mohammad
 */

public class Fillintheblank extends Question {

    /**
     * create fill in the blank question
     * @param question
     * @param difficulty
     */
    public Fillintheblank(String question, int difficulty) {
        super(manipulateQuestion(question), mainpulateAns(question), difficulty);
    }

    /**
     * cuts the answer from the question and return answer
     * @param m question with the answer
     * @return  answer
     */
    public static String mainpulateAns(String m) {
        int first = m.indexOf("_");
        int last = m.lastIndexOf("_");
        char[] x = m.toCharArray();
        String s = "";
        for (int i = first; i < last; i++) {
            s += x[i];

        }
        s = s.replaceAll("_", "");

        return s;
    }

    /**
     * cuts the answer from the question and return question
     * @param question
     * @return question but without the answer.
     */
    public static String manipulateQuestion(String question) {
        String q = question.replaceAll(mainpulateAns(question), "____");
        return q;
    }

}
