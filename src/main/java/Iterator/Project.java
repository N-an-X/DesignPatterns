package Iterator;

import java.util.ArrayList;
import java.util.List;

public class Project implements IProject{

    private List<IProject> projectList = new ArrayList<>();

    private String name;

    private int num;

    private int cost;

    public Project() {}

    private Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        String info = "";

        info += "项目名称是: " + this.name;

        info += "\t项目人数是: " + this.num;

        info += "\t项目费用是: " + this.cost;

        return info;
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }
}
