package com.spring.aop;

/**
 * 代理类
 */
public class TankProxy implements Move{
    //声明一个Move接口的对象
    private Move t;

    public TankProxy(Move t) {
        this.t = t;
    }

    @Override
    public void move() {
        System.out.println("start");
        t.move();
        System.out.println("stop");
    }
}
