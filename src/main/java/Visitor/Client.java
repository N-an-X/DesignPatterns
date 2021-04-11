package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        for (Employee employee : mockEmployee()) {
            employee.accept(new Visitor());
        }
    }

    public static List<Employee> mockEmployee() {
        List<Employee> employees = new ArrayList<>();

        CommonEmployee liuNeng = new CommonEmployee();
        liuNeng.setJob("编写Java程序，绝对的蓝领，苦逼的搬运工");
        liuNeng.setName("刘能");
        liuNeng.setSalary(68000);
        liuNeng.setSex(Employee.male);
        employees.add(liuNeng);

        CommonEmployee zhaoSi = new CommonEmployee();
        zhaoSi.setJob("页面美工，提高审美素质才是硬道理");
        zhaoSi.setName("赵四");
        zhaoSi.setSalary(60000);
        zhaoSi.setSex(Employee.female);
        employees.add(zhaoSi);

        Manager wangDaNa = new Manager();
        wangDaNa.setName("王大拿");
        wangDaNa.setPerformance("啥都不行，拍马屁一绝");
        wangDaNa.setSalary(30000);
        wangDaNa.setSex(Employee.male);
        employees.add(wangDaNa);
        return employees;
    }
}
