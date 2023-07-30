package com.Husky.Demo;

public class Demo01 {
    public static void main(String[] args) {
        MyThread T1=new MyThread();
        MyThread T2=new MyThread();
        T1.setName("T1");
        T2.setName("T2");
        T1.start();
        T2.start();
    }
}
