package com.Husky.Demo06;

import java.util.ArrayList;
import java.util.Collections;

public class pac extends Thread{
    ArrayList<Integer> list;
    ArrayList<Integer> li=new ArrayList<>();
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
                li.add(money);
            }
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
        if (li.size()>0) {
            System.out.println(currentThread().getName()+"共产生"+li.size()+"个奖项，分别是"+li+"其中最大值是"+Max(li));
        }

}
    public int Max(ArrayList<Integer> list){
        int max=list.get(0);
        for(int i=1;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        return max;
    }
}