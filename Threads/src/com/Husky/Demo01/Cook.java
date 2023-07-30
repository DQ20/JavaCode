package com.Husky.Demo01;

public class Cook extends Thread{
    @Override
    public void run() {
        while(true){
            synchronized (Desk.lock){
                if(Desk.count==0){
                    break;
                }
                else {
                    if (Desk.foodFlag==0){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    else {
                        Desk.count--;
                        System.out.println(currentThread().getName()+"消费一个，还可以消费"+Desk.count+"个");
                        Desk.lock.notifyAll();
                        Desk.foodFlag=0;
                    }
                }
            }
        }
    }
}
