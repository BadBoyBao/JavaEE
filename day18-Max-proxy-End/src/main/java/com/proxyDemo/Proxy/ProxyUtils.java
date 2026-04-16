package com.proxyDemo.Proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file ProxyUtils
 * @date 2026/04/16  11:56
 * @email thexpxp233@qq.com
 **/
public class ProxyUtils {
    public static <T> T createProxy(T t) {
        T proxy = (T) Proxy.newProxyInstance(ProxyUtils.class.getClassLoader()
                , t.getClass().getInterfaces()
                , new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy , Method method , Object[] args) throws Throwable {
                        long start = System.currentTimeMillis();
                        Object result = method.invoke(t , args);
                        long end = System.currentTimeMillis();
                        System.out.println("耗时:" + (end - start) / 1000.0 + "s");
                        return result;
                    }
                }
        );
        return proxy;
    }
}
