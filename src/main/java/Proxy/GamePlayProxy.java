package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//动态代理模式，该代理类可代理任何类的对象，AOP面向切面编程
public class GamePlayProxy implements InvocationHandler {

    //被代理的对象
    Object obj;

    public GamePlayProxy(Object obj) {
        //找到被代理的对象
        this.obj = obj;
    }
    //通过反射，获取被代理者的方法
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        return method.invoke(this.obj, objects);
    }
}
