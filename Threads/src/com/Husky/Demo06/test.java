package com.Husky.Demo06;

import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        Collections.addAll(list,100,50,8,99,120,200,888,68,128,300);
        pac p1=new pac(list);
        pac p2=new pac(list);
        p1.setName("抽奖箱1号");
        p2.setName("抽奖箱2号");
        p1.start();
        p2.start();
    }
}
