package com.naresh.multithreading.part2;
class Library1 implements Runnable{
    String res1=new String("JAVA Book");
    String res2=new String("DSA Book");
    String res3=new String("SPRING Book");
    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        if(name.equals("student1")){
            try{
                System.out.println("Student1 entered into library");
                Thread.sleep(3000);
                synchronized (res1){
                    System.out.println("student1 has acquired "+res1);
                    Thread.sleep(3000);
                    synchronized (res2){
                        System.out.println("student1 has acquired "+res2);
                        Thread.sleep(3000);
                        synchronized (res3){
                            System.out.println("student1 has acquired "+res3);
                            Thread.sleep(3000);
                        }
                    }
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            try{
                System.out.println("Student2 entered into library");
                Thread.sleep(3000);
                synchronized (res3){
                    System.out.println("student2 has acquired "+res3);
                    Thread.sleep(3000);
                    synchronized (res2){
                        System.out.println("student2 has acquired "+res2);
                        Thread.sleep(3000);
                        synchronized (res1){
                            System.out.println("student2 has acquired "+res1);
                            Thread.sleep(3000);
                        }
                    }
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class DeadLockDemo {
    public static void main(String[] args) {
        Library1 l=new Library1();
        Thread thread1=new Thread(l,"student1");
        Thread thread2=new Thread(l,"student2");
        thread1.start();
        thread2.start();
    }
}
