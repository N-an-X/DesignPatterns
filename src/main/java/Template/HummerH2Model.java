package Template;

public class HummerH2Model extends HummerModel{
    @Override
    public void start() {
        System.out.println("悍马H2发动了///");
    }

    @Override
    public void stop() {
        System.out.println("悍马H2刹车了///");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛声音是这样的///");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2的引擎声音是这样的///");
    }
}
