package com.cheekin;

public class Main {

    public static void main(String[] args) {
        Phone a = new Phone();
        a.setType();
        a.setColor();
        a.setDistance();
        a.setCost();
        a.setFunction();
        a.setAmountOfPhone();
        a.setWeight();
        a.setPrice();

        System.out.println("Type: " + a.getType() + "\n" + "Color: " + a.getColor() + "\n" + "Communication Distance: " + a.getDistance() + "\n" + "Cost: " + a.getCost() + "\n" + "Function: " + a.getFunction());
        System.out.printf("Weight: %.2fg %n",a.getWeight());
        System.out.printf("Price: RM%.2f each %n",a.getPrice());
        System.out.println("Amount Of Phone: " + a.getAmountOfPhone());
        System.out.printf("Total Weight: %.2fkg %n",a.getTotalWeight());
        System.out.printf("Total Price: RM%.2f %n",a.getTotalPrice());
        System.out.println();


        Phone b = new Phone();
        b.setType();
        b.setColor();
        b.setDistance();
        b.setCost();
        b.setFunction();
        b.setAmountOfPhone();
        b.setWeight();
        b.setPrice();

        System.out.println("Type: " + b.getType() + "\n" + "Color: " + b.getColor() + "\n" + "Communication Distance: " + b.getDistance() + "\n" + "Cost: " + b.getCost() + "\n" + "Function: " + b.getFunction());
        System.out.printf("Weight: %.2fg %n",b.getWeight());
        System.out.printf("Price: RM%.2f each %n",b.getPrice());
        System.out.println("Amount Of Phone: " + b.getAmountOfPhone());
        System.out.printf("Total Weight: %.2fkg %n",b.getTotalWeight());
        System.out.printf("Total Price: RM%.2f %n",b.getTotalPrice());
    }
}