package com.Husky.Demo02;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer extends Thread{
    ArrayBlockingQueue<String> queue;

    public Producer(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try {
                queue.put("产品");
                System.out.println("生产一个产品");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
