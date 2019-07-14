package config.model;

//import org.hibernate.annotations.Table;

import javax.persistence.*;

@Entity
@Table(name = "Shape")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "Shape_Type") //one more column for children class
public abstract class Shape {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "color")
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
