package config.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;


@Entity
public class Square extends Shape {

    @Column(name = "length")
    private double length;

    @Column(name = "area")
    private double area;

    @Column(name = "color")
    private String color;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        area = Math.pow(length,2);
        return area;
    }


    String getColor(String color) {
        return color;
    }


}
