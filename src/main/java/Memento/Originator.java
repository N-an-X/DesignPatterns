package Memento;

public class Originator {

    private Rectangle rectangle;

    public Originator() {
        rectangle = new Rectangle(10, 20);
    }

    public void setWidth(double width) {
        this.rectangle.setWidth(width);
    }

    public void setHeight(double height) {
        this.rectangle.setHeight(height);
    }

    public Rectangle getRectangle() {
        return this.rectangle;
    }

    public Memento saveMemento() {
        return new Memento(this.rectangle.copy());
    }

    public void loadMemento(Memento memento) {
        this.setWidth(memento.getRectangle().copy().getWidth());
        this.setHeight(memento.getRectangle().copy().getHeight());
    }
}
