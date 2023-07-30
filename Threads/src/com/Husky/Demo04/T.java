package com.Husky.Demo04;

public class T extends Thread{
    @Override
    public void run() {
        synchronized (Number.object){
            while(true){
                if(Number.num<=100){
                    if(Number.num%2==1){
                        System.out.println(currentThread().getName()+"输出"+Number.num);
                    }
                    Number.num++;
                }
                else return;
            }
        }

    }
}
