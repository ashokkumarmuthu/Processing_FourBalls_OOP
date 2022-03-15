
import processing.core.PApplet;

import java.util.ArrayList;

public class FourBalls extends PApplet {

    private static final int HEIGHT = 720;
    private static final int WIDTH = 1280;

    public static void main(String[] args) {
        PApplet.main(new String[]{"FourBalls"});
    }


    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ArrayOfObjectCreation();
    }
    int x=1,i;
    int height = HEIGHT/5;
    int speed=1;
    ArrayList<FourBall> arr = new ArrayList<FourBall>();
    private void ArrayOfObjectCreation() {
        for(i=0;i<4;i++){
            arr.add(new FourBall(x,speed*height,speed));
            speed++;
        }
    }

    @Override
    public void draw() {
        for(FourBall ele : arr){
            ele.draw();
        }
    }
    public class FourBall{
        int x,y,speed;
        public FourBall(int x,int y,int speed){
            this.x=x;
            this.y=y;
            this.speed=speed;
        }
        void draw(){
            ellipse(x*speed, y,50,50);
            this.x=x+1;
        }
    }
}