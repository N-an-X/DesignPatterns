package Adapter;

public class MainDriver {
    
    public static void main(String[] args) {
        Client[] clients = new Client[] {
            new Client(new MyCircleObjectAdapter(new MyCircle(20))),
            new Client(new MyCircleClassAdapter(50))
        };

        for (Client client: clients) {
            client.displayShapeProperties();
        }
    }
}
