package Iterator;

public class Client {
    public static void main(String[] args) {
        IProject project = new Project();

        project.add("星球大战", 10, 1000000000);

        project.add("超级马里奥", 30, 100001000);

        project.add("英雄联盟", 70, 323340000);

        for (int i = 4; i < 104; i ++) {
            project.add("第" + i + "个项目", i * 5, i * 10000);
        }

        IProjectIterator iProjectIterator = project.iterator();
        while (iProjectIterator.hasNext()) {
            IProject p = (IProject) iProjectIterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
