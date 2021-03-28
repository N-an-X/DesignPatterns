package Observer;

public interface Subject {

    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notifyObservers();
    public int getState();
    public void setState(int state);
    
}
