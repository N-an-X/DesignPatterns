package Adapter;

//class adapter
public class MyCircleClassAdapter extends MyCircle implements Shape {

    public MyCircleClassAdapter(double radius) {
        super(radius);
    }

    @Override
    public double getWidth() {
        return super.getRadius() * 2;
    }

    @Override
    public double getHeight() {
        return super.getRadius() * 2;
    }
}
