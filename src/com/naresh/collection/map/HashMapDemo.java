package com.naresh.collection.map;

import java.util.HashMap;
class TutorialChannel{
    private int channelId;
    private String channelName;

    public TutorialChannel(int channelId, String channelName) {
        this.channelId = channelId;
        this.channelName = channelName;
    }

    public TutorialChannel() {
        super();
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public String toString() {
        return "TutorialChannel{" +
                "channelId=" + channelId +
                ", channelName='" + channelName + '\'' +
                '}';
    }
}
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put(1,"java");
        hm.put(2,"spring");
        hm.put(4,"jdbc");
        hm.put(3,"Microservices");//{1=java, 2=spring, 3=Microservices, 4=jdbc}
        System.out.println(hm);
        HashMap hm1=new HashMap();
        //no duplicates in keys it should be unique
        hm1.put(1,"java");
        hm1.put(2,"spring");
        hm1.put(3,"jdbc");
        hm1.put(3,"Microservices");//it takes latest value
        System.out.println(hm1);//{1=java, 2=spring, 3=Microservices}
        HashMap hm13=new HashMap();
        //it takes all type of data
        hm13.put("java","java");
        hm13.put(2,"spring");
        hm13.put(3,"jdbc");
        hm13.put(4,"Microservices");
        System.out.println(hm13);//{2=spring, java=java, 3=Microservices}
        HashMap hm4=new HashMap();
        hm4.put("java","java");
        hm4.put(2,"spring");
        hm4.put(3,"jdbc");
        hm4.put(null,null);
        //it takes null value as a key & value
        System.out.println(hm4);//{null=null, 2=spring, java=java, 3=jdbc}
        HashMap<Integer,String> list=new HashMap<>();
        list.put(101,"Naresh");
        //list.put("id","Mahesh"); error
        list.put(102,"MAHESH");
        list.put(103,"Ramesh");
        System.out.println(list);
        HashMap list1=new HashMap<>();
        TutorialChannel tc=new TutorialChannel(1524,"subbuTECH");
        list1.put(tc, "springBoot camp");
        System.out.println(list1);
    }
}
