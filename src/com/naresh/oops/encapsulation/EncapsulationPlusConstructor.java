package com.naresh.oops.encapsulation;
class Horse{
    private int cost;
    private String horseName;
    private String horseColor;
    public Horse(int cost, String horseName,String horseColor){
        this.cost=cost;
        this.horseName=horseName;
        this.horseColor=horseColor;
    }
    public Horse(){
        super();
    }
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    public String getHorseColor() {
        return horseColor;
    }

    public void setHorseColor(String horseColor) {
        this.horseColor = horseColor;
    }
}
public class EncapsulationPlusConstructor {
    public static void main(String[] args) {
        Horse horse2=new Horse(200000,"jockey", "white");
        System.out.println(horse2.getCost());
        System.out.println(horse2.getHorseName());
        System.out.println(horse2.getHorseColor());
        System.out.println("##############################################");
        Horse horse1=new Horse();
        horse1.setCost(150000);
        horse1.setHorseColor("Brown");
        horse1.setHorseName("Rocky");
        System.out.println(horse1.getCost());
        System.out.println(horse1.getHorseName());
        System.out.println(horse1.getHorseColor());
    }
}
