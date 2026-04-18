package com.naresh.oops.encapsulation;
class Learner{
    private int id;
    private String name;
    private String city;
    //id (parameter) is assigning to itself, not to the instance variable.
    //So your class variable this.id is never updated
    public void setId(int id) {
        id = id;//it acts as local variable
    }

    public void setName(String name) {
        name = name;
    }

    public void setCity(String city) {
        city = city;
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

public class WithoutThisKeywordDemo {
    public static void main(String[] args) {
        Learner learner=new Learner();
        learner.setId(1);
        learner.setName("Naresh");
        learner.setCity("Hyderabad");
        System.out.println(learner.getId());
        System.out.println(learner.getName());
        System.out.println(learner.getCity());
    }
}
