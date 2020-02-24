/**
 * marquee class that is text inside a shape
 * @author mohammad
 */

public class Marquee implements ASCIIDrawable {
    private String text;

    /**
     * Create a Marquee
     * @param text
     */

    public Marquee(String text) {
        this.text = text;

    }

    /**
     * gets text
     * @return text
     */

    public String getText() {
        return text;
    }

    /**
     * marquee set text
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Marquee toString
     * @return
     */
    @Override
    public String toString() {
        return "marquee { text: "+ this.text+"}";
    }

    /**
     * draws marquee by converting it to a string and returning it.
     * @return Marquee
     */
    @Override
    public String drawAsACII() {

        double W = this.text.length() + 4;
        double H = 5;
        String rect = "";
        for (int Hash = 0; Hash < W; Hash++) {
            rect += "#";
        }
        rect += "\n";

        for (int line = 0; line < H - 2; line++) {
            rect += "#";
            if (line == 1) {
                rect += " " + this.text + " ";
            } else {
                for (int space = 0; space < W - 2; space++) {
                    rect += " "; //
                }
            }

            rect += "#\n";
        }

        for (int star = 0; star < W; star++) {
            rect += "#"; //lastline
        }
        rect += "\n";
        return rect;

    }


}
