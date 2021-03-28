package Memento;

public class Memento {

    private Rectangle rectangle;

    public Memento(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Rectangle getRectangle() {
        return this.rectangle;
    }
}
