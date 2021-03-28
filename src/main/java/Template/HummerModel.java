package Template;

public abstract class HummerModel {

    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void engineBoom();

    //共有方法存放到接口中，当作模版，提供给所有子类使用，避免代码重复，提高可维护性
    public void run() {
        this.start();

        this.engineBoom();

        this.alarm();

        this.stop();
    }
}
