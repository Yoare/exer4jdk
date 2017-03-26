package com.hyang.jdk.aop.proxy.agency;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 中介类与委托类构成了静态代理关系，在这个关系中，中介类是代理类，委托类就是委托类；
 * 代理类（proxy）与中介类（angency）也构成了一个静态代理的关系（中介类是委托（client），代理类是代理）
 *
 * Created by hyang on 2017/3/26.
 */
public class DynamicProxy implements InvocationHandler {
    /**
     * 委托类对象的引用
     */
    private Object client;

    public DynamicProxy(Object client) {
        this.client = client;
    }

    /**
     * 调用代理类对象的方法时，调用会被转送到invoke方法中，
     *
     * @param proxy 代理类对象
     * @param method 我们具体调用的代理类的方法
     * @param args 调用的代理类方法的参数列表
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = method.invoke(client, args);
        System.out.println("after");
        return result;
    }
}
