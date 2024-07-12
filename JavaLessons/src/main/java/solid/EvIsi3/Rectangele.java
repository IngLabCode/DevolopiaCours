package solid.EvIsi3;

public class Rectangele {
    protected  int width;
    protected  int height;
    public Rectangele(int width,int height){
        this.width=width;
        this.height=height;

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getArea(){
        return width*height;
    }
}
