package fi.tamk.tiko;

import javax.persistence.Entity;

@Entity
public class Console extends ShoppingItem {

    public String name;
    public double price;
    public double weight;
    public int memory;
    public String picture;

    public Console() {

    }

    public Console(String name, double price, double weight, int memory, String picture, int quantity) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.memory = memory;
        this.picture = picture;
        setQuantity(quantity);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Audio{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", memory=" + memory +
                ", picture='" + picture + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}