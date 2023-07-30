package com.Husky.Demo01;

public class Test {
    public static void main(String[] args) {
        Cook cook=new Cook();
        Foodie foodie=new Foodie();
        cook.setName("生产者");
        foodie.setName("消费者");
        cook.start();
        foodie.start();
    }
}
