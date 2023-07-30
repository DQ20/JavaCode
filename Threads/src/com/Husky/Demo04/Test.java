package com.Husky.Demo04;

public class Test {
    public static void main(String[] args) {
        T t1=new T();
        T t2=new T();
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
