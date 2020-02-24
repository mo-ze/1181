/**
 * Questions class:A Simple class that makes question, answer and difficulty
 * @author Mohammad Zafar

 */

public class Question {
    private String question;
    private String answer;
    private int difficulty;

    /**
     * contructs the questions with  difficulty if its in the range of 0 -10; if not in range set it to 0;
     * @param question
     * @param answer
     * @param difficulty
     */
    public Question(String question, String answer, int difficulty){
        this.question=question;
        this.answer=answer;
        if(difficulty<=10&&difficulty>=0){
        this.difficulty=difficulty;}
        else {this.difficulty=0;}

    }

    /**
     * cuntructs the question with difficulty 1
     * @param question
     * @param answer
     */
    public Question(String question, String answer){
        this.question=question;
        this.answer=answer;
        this.difficulty=1;

    }

    /**
     * gets you the questions
     * @return question
     */

    public String getQuestion() {
        return question;
    }

    /**
     * cHANGES the question
     * @param question
     */

    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * gets the answer for you
     * @return
     */

    public String getAnswer() {
        return answer;
    }

    /**
     * changes the answer for you
     * @param answer
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * returns the diffuculty
     * @return
     */
    public int getDifficulty() {
        return this.difficulty;
    }

    /**
     * set the difficulty if its in the range of 0 -10
     * @param difficulty
     */

    public void setDifficulty(int difficulty) {
        if(difficulty<=10&&difficulty>=0){
        this.difficulty = difficulty;}
    }

    /**
     * to string
     * @return convert the question object to string
     */

    public String toString() {
        String r="question:\t"+ getQuestion()+"\n"+"Answer:\t"+getAnswer()+"\n"+"difficulty:\t"+getDifficulty();
        return r;
    }

    /**
     * check whether the answer is correct;
     * @param attemptedAns
     * @return
     */

    public boolean isCorrect(String attemptedAns){
        return attemptedAns.equalsIgnoreCase(this.answer);



    }
}
