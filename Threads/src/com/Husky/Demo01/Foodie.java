package com.Husky.Demo01;

public class Foodie extends Thread{
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if(Desk.count==0){
                    break;
                }
                else {
                    if (Desk.foodFlag==1){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    else {
                        System.out.println(currentThread().getName()+"生产了一个");
                        Desk.foodFlag=1;
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
