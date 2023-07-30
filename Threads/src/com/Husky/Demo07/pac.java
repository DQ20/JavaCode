package com.Husky.Demo07;

import java.util.ArrayList;
import java.util.Collections;

public class pac extends Thread{
    ArrayList<Integer> list;
    public pac(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true){
            synchronized (pac.class){
                if(list.size()<=0){
                    break;
                }
                Collections.shuffle(list);
                int money=list.remove(0);
                System.out.println(currentThread().getName()+"抽中了"+money+"元");
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
}
}