package Template;

public class HummerH1Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马H1发动。。。");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1刹车了。。。");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛。。。");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1的引擎声音是这样的。。。");
    }
}
