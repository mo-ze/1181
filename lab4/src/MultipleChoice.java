import java.util.ArrayList;


/**
 * an multiple choice question class
 * this class extends the question class
 * @author Mohammad Zafar
 */
public class MultipleChoice extends Question {

    private ArrayList<String> choices = new ArrayList<String>();

    /**
     * this is the construction of the multiple choice
     * @param question
     * @param difficulty
     */
    public MultipleChoice(String question, int difficulty) {
        super(question, "", difficulty);
    }

    /**
     * this method display returns question with the the choices
     * @return question with the the choices
     */

    public String display() {
        String r = this.getQuestion() + " (Difficulty: " + this.getDifficulty() + ") " ;
        int i = 1;
        for (String n : choices) {
            r += "\n"+"\t"+i + "." + n ;
            i++;
        }
        r +="\n" + "Enter all correct choices if you think 1 and 2 are correct enter 12";
        return r;
    }

    /**
     * add choice to the question
     * @param s choice that you wanna put in
     * @param b whether the choice is correct
     */
    public void addchoice(String s, boolean b) {
        this.choices.add(s);
        if (b) {
            this.setAnswer(this.getAnswer() + (this.choices.indexOf(s)+1) + "");
        }
    }
}
