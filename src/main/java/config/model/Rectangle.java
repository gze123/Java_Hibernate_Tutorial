package config.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;


@Entity
public class Rectangle extends Shape {

    @Column(name = "area")
    private double area;

    @Column(name = "width")
    private double width;

    @Column(name = "height")
    private double height;

    @Column(name = "color")
    private String color;

    public double getArea() {
        area = height * width;
        return area;
    }


    String getColor(String color) {
        return color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
