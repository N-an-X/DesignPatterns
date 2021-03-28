package Adapter;

//Object adapter
public class MyCircleObjectAdapter implements Shape {
    private MyCircle myCircle;

     public MyCircleObjectAdapter(MyCircle myCircle) {
        this.myCircle = myCircle;
    }

    @Override
    public double getWidth() {
        return 2 * myCircle.getRadius();
    }

    @Override
    public double getHeight() {
        return 2 * myCircle.getRadius();
    }  
}
