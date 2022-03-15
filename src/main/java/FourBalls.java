import processing.core.PApplet;

public class FourBalls extends PApplet{

    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;
    int x=0;
    int height=HEIGHT/5;
    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }
    @Override
    public void setup() {
    }

    @Override
    public void draw() {

        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
        x++;
    }

    private void drawCircle4() {
        ellipse(4*x,4*height,50,50);
    }

    private void drawCircle3() {
        ellipse(3*x,3*height,50,50);
    }

    private void drawCircle2() {
        ellipse(2*x,2*height,50,50);
    }

    private void drawCircle1() {
        ellipse(x,height,50,50);
    }
}
