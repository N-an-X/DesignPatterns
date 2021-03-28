package Facade;

public class Facade {

    private Shape rectangle;
    private Shape circle;
    private Shape square;

    public Facade() {
        rectangle = new Rectangle();
        circle = new Circle();
        square = new Square();
    }

    public void draw() {
        this.rectangle.draw();
        this.circle.draw();
        this.square.draw();
    }
}
