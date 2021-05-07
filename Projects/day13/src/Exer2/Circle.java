package Exer2;

import java.util.Objects;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(){
        super();
        radius = 1.0;
//        color = "white";
//        weight = 1.0;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius,String color,double weight){
        super(color, weight);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double findArea(){
        return 3.14 * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if(o instanceof Circle){
            Circle c = (Circle)o;
            return this.radius == c.radius;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle[" + "radius=" + radius + ']';
    }
}
