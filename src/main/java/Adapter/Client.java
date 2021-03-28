package Adapter;

public class Client {
    private Shape shape;

    public Client(Shape shape) {
        this.shape = shape;
    }

    public void displayShapeProperties() {
        System.out.printf(
            "width: %.2f\nheight: %.2f\n",
            shape.getWidth(),
            shape.getHeight()
        );
    }   
}
