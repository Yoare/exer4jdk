package com.hyang.jdk.aop.proxy.run;

import com.hyang.jdk.aop.proxy.agency.DynamicProxy;
import com.hyang.jdk.aop.proxy.client.Vendor;
import com.hyang.jdk.aop.proxy.iface.Sell;

import java.lang.reflect.Proxy;

/**
 * Created by hyang on 2017/3/26.
 */
public class DynamicGenerator {


    /**
     * 动态代理运行程序
     * @param args
     */
    public static void main(String[] args) {
        //创建中介类实例
        DynamicProxy dynamicProxy = new DynamicProxy(new Vendor());
        //会产生一个$Proxy0.class文件，这个文件就是动态生成的代理类文件。
        System.getProperties().put("sun.misc.ProxyGeneratory.saveGeneratedFiles", "true");
        //获取代理类实例sell
        /*
        static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) throws IllegalArgumentException

        方法的三个参数含义分别如下：
        loader：定义了代理类的ClassLoder；
        interfaces：代理类实现的接口列表
        h：调用处理器，也就是我们上面定义的实现了InvocationHandler接口的类实例
         */
        Sell sell = (Sell) (Proxy.newProxyInstance(Sell.class.getClassLoader(), new Class[] {Sell.class}, dynamicProxy));
        //通过代理类对象调用代理类方法，实际上会转到invoke方法里调用
        sell.doSell();
        sell.doAd();

    }
}
