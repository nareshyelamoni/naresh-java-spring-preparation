package com.naresh.multithreading.part3;

class Producer1 extends Thread{
    int i=1;
    Queue1 q;

    public Producer1(Queue1 q)
    {
        this.q=q;
    }
    @Override
    public void run() {
        while (true){
            q.producer(i++);
        }
    }
}

class Consumer1 extends Thread{
    Queue1 q;

    public Consumer1(Queue1 q)
    {
        this.q=q;
    }
    @Override
    public void run() {
        while (true){
            q.consumer();
        }
    }
}

class Queue1 {

    int data;
    boolean flag=false;

    synchronized public void producer(int i){
        try{
            if(flag==true){
                System.out.println("producer is waiting...........");
                wait();
            }else{
                data=i;
                System.out.println("I Have Produced Data "+data);
                flag=true;
                notify();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void consumer(){
        try{
            if(flag==false){
                System.out.println("consumer is waiting...........");
                wait();
            }else{
                System.out.println("I Have consumer Data "+data);
                flag=false;
                notify();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        Queue1 q=new Queue1();

        Producer1 p=new Producer1(q);
        Consumer1 c=new Consumer1(q);

        p.start();
        c.start();

    }
}
