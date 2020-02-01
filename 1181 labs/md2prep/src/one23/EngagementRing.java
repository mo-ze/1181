package one23;

public class EngagementRing implements Resizeable {
    public final static int MAX_RING_SIZE = 25, MIN_RING_SIZE = 0;
    private int size;
    private String stone, metal;

    public EngagementRing(int size, String stone, String metal) {
        this.size = size;
        this.stone = stone;
        this.metal = metal;
    }

    public int getSize() {
        return size;
    }

    public String getStone() {
        return stone;
    }

    public String getMetal() {
        return metal;
    }

    public String toString() {
        return this.size + " " + this.stone + " " + this.metal;
    }

    @Override
    public void Scale(int sf) {
        int ssize=this.size*sf;
        System.out.println(ssize);
        if(ssize>MAX_RING_SIZE){
            System.out.println("size greater than max");
        }else if(ssize<MIN_RING_SIZE){
            System.out.println("size less than min ");
        }else {
            this.size=ssize;
        }


    }
}