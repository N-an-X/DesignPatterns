package Command;
//需求小组
public class RequirementGroup extends Group{
    @Override
    void find() {
        System.out.println("找到需求小组。。。");
    }

    @Override
    void add() {
        System.out.println("要求增加一个需求。。。");
    }

    @Override
    void delete() {
        System.out.println("修改一个需求。。。");
    }

    @Override
    void change() {
        System.out.println("删除一个需求。。。");
    }

    @Override
    void plan() {
        System.out.println("要求变更计划。。。");
    }
}
