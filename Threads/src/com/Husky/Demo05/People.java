package com.Husky.Demo05;

import java.util.Random;

public class People extends Thread {
    @Override
    public void run() {
        while(true){
            synchronized (RedPacket.lock){
                if(RedPacket.money!=0&&RedPacket.num>0){
                    if (RedPacket.num == 1) {
                        System.out.println(currentThread().getName()+"抢到了"+RedPacket.money+"元");
                        RedPacket.num--;
                        break;
                    }
                    Random random=new Random();
                    double d=random.nextDouble()*(RedPacket.money-0.01)+0.01;
                    double money=change(d);
                    RedPacket.num--;
                    System.out.println(currentThread().getName()+"抢到了"+money+"元");
                    RedPacket.money=change(RedPacket.money-money);
                    break;
                }
                else
                {
                    System.out.println(currentThread().getName()+"未抢到");
                    break;
                }
            }
        }

    }
    public double change(double num){
        String str=String.format("%.2f",num);
        double d=Double.parseDouble(str);
        return d;
    }
}
