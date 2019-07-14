package config.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@Entity
public class Triangle extends Shape {

    @Column(name = "base")
    private double base;

    @Column(name = "height")
    private double height;

    @Column(name = "area")
    private double area;

    @Column(name = "color")
    private String color;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        area = base * height / 2;
        return area;
    }

    String getColor(String color) {
        return color;
    }

}
