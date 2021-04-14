package com.cheekin;
import java.util.Scanner;

public class Phone {
    Scanner scan =  new Scanner(System.in);
    String type, color, distance, cost, function;
    double weight, price,totalweight, totalprice;
    int AmountOfPhone;

    void setType() {
        System.out.print("Please enter type of phone: ");
        this.type = scan.nextLine();
    }

    void setColor() {
        System.out.print("Please enter color of phone: ");
        this.color = scan.nextLine();
    }

    void setDistance() {
        System.out.print("Please enter communication distance of phone: ");
        this.distance = scan.nextLine();
    }

    void setCost () {
        System.out.print("Please enter cost of phone: ");
        this.cost = scan.nextLine();
    }

    void setFunction () {
        System.out.print("Please enter function of phone: ");
        this.function = scan.nextLine();
    }

    void setWeight() {
        System.out.print("Please enter weight of phone: ");
        this.weight = scan.nextDouble();
    }

    void setPrice() {
        System.out.print("Please enter price of phone: ");
        this.price = scan.nextDouble();
    }

    void setAmountOfPhone() {
        System.out.print("Please enter amount of phone: ");
        this.AmountOfPhone = scan.nextInt();
    }

    String getType() {
        return this.type;
    }

    String getColor() {
        return this.color;
    }

    String getDistance() {
        return this.distance;
    }

    String getCost() {
        return this.cost;
    }

    String getFunction() {
        return this.function;
    }

    double getWeight() {
        return this.weight;
    }

    double getPrice() {
        return this.price;
    }

    int getAmountOfPhone() {
        return this.AmountOfPhone;
    }

    double getTotalWeight() {
        this.totalweight = this.AmountOfPhone * this.weight;
        return this.totalweight;
    }

    double getTotalPrice() {
        this.totalprice = this.AmountOfPhone * this.price;
        return this.totalprice;
    }
}
