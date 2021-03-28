package AbstractFactory;

import java.sql.SQLOutput;

public class NvWa {

    public static void main(String[] args) {
        HumanFactory maleFactory = new MaleFactory();

        HumanFactory femaleFactory = new FemaleFactory();

        Human maleYellow = maleFactory.createYellowHuman();

        Human femaleYellow = femaleFactory.createYellowHuman();

        System.out.println("---生产一个黄人女性---");

        femaleYellow.getColor();
        femaleYellow.talk();
        femaleYellow.getSex();

        System.out.println("---生产一个黄人男性---");

        maleYellow.getColor();
        maleYellow.talk();
        maleYellow.getSex();
    }
}
