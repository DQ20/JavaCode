package com.Husky.Demo03;

public class TicketBuckle extends Thread{
    @Override
    public void run() {
        while(true){
            try {
                synchronized (Ticket.object){
                if(Ticket.num>0){
                    System.out.println(currentThread().getName()+"售出第"+(101-Ticket.num)+"张票");
                    Ticket.num--;
                }

            }
                currentThread().sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
