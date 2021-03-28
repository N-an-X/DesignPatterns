package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Client {
    public static void main(String[] args) {

        IGamePlayer player = new GamePlayer("赵四");

        InvocationHandler handler = new GamePlayProxy(player);

        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");

        System.out.println("游戏开始的时间是" + dateFormat.format(date));

        ClassLoader cl = player.getClass().getClassLoader();

        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);

        proxy.login("尼古拉斯", "刘能在哪呢");

        proxy.killBoss();

        proxy.upgrade();

        System.out.println("不玩了，刘能不陪我。");
    }
}
