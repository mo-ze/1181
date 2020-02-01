package one23;

public class Image implements Resizeable{
    private int width, height;
    private String fileName;
    public Image(String fileName, int width, int height) {
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }
    public String getFileName() {
        return fileName;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public String toString() {
        return this.fileName + " " + this.width + " " + this.height;
    }

    @Override
    public void Scale(int sf) {
    this.height*= sf;
    this.width*=sf;
    }
}