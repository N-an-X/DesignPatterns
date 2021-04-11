package Composite;

import java.util.List;

//安全的组合模式
public class Client {

    public static void main(String[] args) {
        Branch ceo = compositeCorpTree();

        System.out.println(ceo.getInfo());

        System.out.println(getTreeInfo(ceo));
    }

    public static Branch compositeCorpTree() {
        Branch root = new Branch("王大拿", "总经理", 100000);

        Branch developDep = new Branch("长贵", "研发部门经理", 20000);
        Branch salesDep = new Branch("谢大脚", "销售部门经理", 20000);
        Branch financeDep = new Branch("刘天来", "财务部门经理", 32000);

        Branch firstDevGroup = new Branch("刘能", "开发一组组长", 15000);
        Branch secondDevGroup = new Branch("谢广坤", "开发二组组长", 15500);

        Leaf a = new Leaf("a", "开发人员", 2000);
        Leaf b = new Leaf("b", "开发人员", 2000);
        Leaf c = new Leaf("c", "开发人员", 2000);
        Leaf d = new Leaf("d", "开发人员", 2000);
        Leaf e = new Leaf("e", "开发人员", 2000);
        Leaf f = new Leaf("f", "开发人员", 2000);
        Leaf g = new Leaf("g", "销售人员", 2000);
        Leaf h = new Leaf("h", "财务人员", 2000);
        Leaf i = new Leaf("马蓉", "CEO秘书", 2000);
        Leaf zhaoSi = new Leaf("赵四", "研发部门经理", 13000);

        root.addSubordinate(i);
        root.addSubordinate(developDep);
        root.addSubordinate(salesDep);
        root.addSubordinate(financeDep);

        developDep.addSubordinate(zhaoSi);
        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondDevGroup);

        firstDevGroup.addSubordinate(a);
        firstDevGroup.addSubordinate(b);
        firstDevGroup.addSubordinate(c);
        secondDevGroup.addSubordinate(d);
        secondDevGroup.addSubordinate(e);
        secondDevGroup.addSubordinate(f);

        salesDep.addSubordinate(g);
        financeDep.addSubordinate(h);

        return root;
    }

    public static String getTreeInfo(Branch root) {
        List<Crop> cropList = root.getCropList();
        StringBuilder info = new StringBuilder();
        for (Crop crop : cropList) {
            if (crop instanceof Leaf) {
                info.append(crop.getInfo()).append("\n");
            } else {
                info.append(crop.getInfo()).append("\n").append(getTreeInfo((Branch) crop));
            }
        }
        return info.toString();
    }
}
