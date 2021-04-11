package Flyweight;

//带有对象池的报考信息
public class SignInfo4Poll extends SignInfo{
    private String key;

    public SignInfo4Poll(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
