package com.naresh.multithreading.part2;
class MsWord extends Thread{
    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        if(name.equals("TYPE")){
            typing();
        }else if (name.equals("SPELL")) {
            spellCheck();
        }else{
            autoSaving();
        }
    }
    public void typing(){
        try{
            for (int i=0;i<4;i++){
                System.out.println("Typing.....");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void spellCheck(){
        try{
            for (;;){
                System.out.println("Spell checking.....");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void autoSaving(){
        try{
            for (;;){
                System.out.println("saving.....");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class DaemonThreadDemo {
    public static void main(String[] args) {
        MsWord ms1=new MsWord();
        MsWord ms2=new MsWord();
        MsWord ms3=new MsWord();

        ms1.setName("TYPE");
        ms2.setName("SPELL");
        ms3.setName("SAVE");

        ms2.setPriority(4);
        ms3.setPriority(3);

        ms2.setDaemon(true);
        ms3.setDaemon(true);

        ms1.start();
        ms2.start();
        ms3.start();
    }
}
