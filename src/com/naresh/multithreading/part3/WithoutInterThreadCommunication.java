package com.naresh.multithreading.part3;

class Producer extends Thread{
    int i=1;
    Queue q;

    public Producer(Queue q){
        this.q=q;
    }
    @Override
    public void run() {
        while (true){
            q.producer(i++);
        }
    }
}

class Consumer extends Thread{
    Queue q;

    public Consumer(Queue q){
        this.q=q;
    }
    @Override
    public void run() {
        while (true){
            q.consumer();
        }
    }
}

class Queue {

    int data;

    public void producer(int i){
        data=i;
        System.out.println("I Have Produced Data "+data);
    }

    public void consumer(){
        System.out.println("I Have consumer Data "+data);
    }
}

public class WithoutInterThreadCommunication {
    public static void main(String[] args) {
        Queue q=new Queue();

        Producer p=new Producer(q);
        Consumer c=new Consumer(q);

        p.start();
        c.start();

    }
}
