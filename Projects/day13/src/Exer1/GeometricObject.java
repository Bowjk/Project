package Exer1;

public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject(String color,double weight){
        super();
        this.color = color;
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    public double findArea(){
        return 0.0;
    }
}
