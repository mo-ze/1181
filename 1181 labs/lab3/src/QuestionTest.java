import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A class for testing the methods of the question class behave
 * as expected.
 * See: http://junit.sourceforge.net/javadoc/org/junit/Assert.html
 * For more JUnit Assertion Statements
 *
 * @author Mohammad Zafar
 */
class QuestionTest {

    @Test
    void TestConstructor_Getter_setters() {
        Question q1=new Question("what color is the sky?","blue");
        Question q2=new Question("Do cat have toes?","no",5);

        assertEquals( "what color is the sky?",q1.getQuestion());
        assertEquals("blue",q1.getAnswer());
        assertEquals(1,q1.getDifficulty());

        assertEquals( "Do cat have toes?",q2.getQuestion());
        assertEquals("no",q2.getAnswer());
        assertEquals(5,q2.getDifficulty());

        q1.setQuestion("what color is the moon?");
        q1.setAnswer("white");
        q1.setDifficulty(3);
        assertEquals( "what color is the moon?",q1.getQuestion());
        assertEquals("white",q1.getAnswer());
        assertEquals(3,q1.getDifficulty());

    }



    @Test
    void TestIsCorrect() {
        Question q1=new Question("what color is the sky?","blue");
        Question q2=new Question("Do cat have toes?","no",5);
        assertEquals( false,q1.isCorrect("red"));
        assertEquals( true,q2.isCorrect("no"));

    }
}