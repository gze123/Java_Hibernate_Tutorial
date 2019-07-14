package config.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@Entity
public class Circle extends Shape {

    @Column(name = "area")
    private double area;

    @Column(name = "radius")
    private double radius;

    @Column(name = "color")
    private String color;

    public double getArea() {
        area = Math.PI * radius * radius;
        return area;
    }

    String getColor(String color) {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
