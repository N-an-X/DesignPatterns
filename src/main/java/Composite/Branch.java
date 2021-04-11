package Composite;

import java.util.ArrayList;
import java.util.List;

//根结点或者分支节点
public class Branch extends Crop{

    List<Crop> cropList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addSubordinate(Crop crop) {
        this.cropList.add(crop);
    }

    public List<Crop> getCropList() {
        return this.cropList;
    }

}
