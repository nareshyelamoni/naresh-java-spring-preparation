package com.naresh.oops.encapsulation;
class Employee{
    private int empId;
    private String empName;
    //setter methods
    public void setEmpId(int eId){
        empId=eId;
    }

    public void setEmpName(String eName){
        empName=eName;
    }
    //getter methods
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
}
public class EncapsulationDemo2 {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setEmpId(1);
        employee.setEmpName("Ashok");
        System.out.println(employee.getEmpId());
        System.out.println(employee.getEmpName());
    }
}
