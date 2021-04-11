package Composite;

public abstract class Crop {

    private String name;
    private String position;
    private int salary;

    public Crop(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        String info = "";
        info = "姓名: " + this.name;
        info += "\t职位: " + this.position;
        info += "\t薪水: " + this.salary;
        return info;
    }
}
