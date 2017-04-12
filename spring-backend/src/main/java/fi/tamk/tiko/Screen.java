package fi.tamk.tiko;

import java.text.DecimalFormat;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Screen extends ShoppingItem {
    public double screenSize;
    public String packageSize;
    public String name;
    public double price;
    public String resolution;
    public int refreshRate;
    public double wasteTime;
    public double viewingAngle;
    public String type;
    public String aspectRatio;
    public String connections;
    public double weight;
    public String picture;

    public Screen(){

    }

    public Screen(double screenSize, String packageSize, String name, double price, String resolution, int refreshRate, double wasteTime, double viewingAngle, String type, String aspectRatio, String connections, double weight, String picture) {
        this.screenSize = screenSize;
        this.packageSize = packageSize;
        this.name = name;
        this.price = price;
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        this.wasteTime = wasteTime;
        this.viewingAngle = viewingAngle;
        this.type = type;
        this.aspectRatio = aspectRatio;
        this.connections = connections;
        this.weight = weight;
        this.picture = picture;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Screen{" +
                "screenSize=" + screenSize +
                ", packageSize='" + packageSize + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", resolution='" + resolution + '\'' +
                ", refreshRate=" + refreshRate +
                ", wasteTime=" + wasteTime +
                ", viewingAngle=" + viewingAngle +
                ", type='" + type + '\'' +
                ", aspectRatio='" + aspectRatio + '\'' +
                ", connections='" + connections + '\'' +
                ", weight=" + weight +
                ", picture='" + picture + '\'' +
                '}';
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(String packageSize) {
        this.packageSize = packageSize;
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

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public double getWasteTime() {
        return wasteTime;
    }

    public void setWasteTime(double wasteTime) {
        this.wasteTime = wasteTime;
    }

    public double getViewingAngle() {
        return viewingAngle;
    }

    public void setViewingAngle(double viewingAngle) {
        this.viewingAngle = viewingAngle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public String getConnections() {
        return connections;
    }

    public void setConnections(String connections) {
        this.connections = connections;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
