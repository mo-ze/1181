package one23;

public class ResizeableThings {
    public static void main(String[] args) {
        Resizeable[] items = new Resizeable[2];
        items[0] = new EngagementRing(12, "Ruby", "Titanium");
        items[1] = new Image("inky.png", 100, 100);
        for(Resizeable item: items) {
            System.out.println(item);
            item.Scale(10);
            System.out.println(item);
        }
    } }