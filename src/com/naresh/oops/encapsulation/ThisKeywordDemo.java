package com.naresh.oops.encapsulation;
class Developer{
    private int id;
    private String name;
    private String city;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Developer l=new Developer();
        l.setId(1);
        l.setName("Naresh");
        l.setCity("Hyderabad");
        System.out.println(l.getId());
        System.out.println(l.getName());
        System.out.println(l.getCity());
    }
}
