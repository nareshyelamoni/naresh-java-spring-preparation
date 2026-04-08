package com.naresh.arrays;
class RsAcademy{
    int id;
    String name;
    String department;

    public RsAcademy() {
    }

    public RsAcademy(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        //return super.toString();
        return "RsAcademy";
    }
}
public class OverrideObjectClassMethod {
    public static void main(String[] args) {
        RsAcademy rsAcademy=new RsAcademy(1,"Naresh","IT");
        System.out.println(rsAcademy);
        System.out.println(rsAcademy.getId());
        System.out.println(rsAcademy.getName());
        System.out.println(rsAcademy.getDepartment());
    }
}
