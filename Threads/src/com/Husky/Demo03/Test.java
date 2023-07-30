package com.Husky.Demo03;

public class Test {
    public static Integer nun=100;
    public static void main(String[] args) {
       TicketBuckle T1=new TicketBuckle();
       TicketBuckle T2=new TicketBuckle();
       T1.setName("窗口一");
       T2.setName("窗口二");
       T1.start();
       T2.start();
    }
}
