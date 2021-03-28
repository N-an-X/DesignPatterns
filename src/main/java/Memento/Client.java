package Memento;

public class Client {

    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        for (double i = 0; i < 100; i ++) {
            originator.setWidth(i);
            originator.setHeight(i + 1);

             if (i == 40) {
                caretaker.addMemento(originator.saveMemento());
            }

            if (i == 80) {
                caretaker.addMemento(originator.saveMemento());
            }
        }

        originator.loadMemento(caretaker.getMemento(0));

        System.out.println("Height:" + originator.getRectangle().getHeight());
        System.out.println("Width:" + originator.getRectangle().getWidth());

        System.out.println();

        originator.loadMemento(caretaker.getMemento(1));

        System.out.println("Height:" + originator.getRectangle().getHeight());
        System.out.println("Width:" + originator.getRectangle().getWidth());
    }
}
