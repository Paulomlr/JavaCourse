package entities;

public class Rectangle implements Shape{
    private Double widht;
    private Double height;

    public Rectangle(Double widht, Double height) {
        this.widht = widht;
        this.height = height;
    }

    public Double getWidht() {
        return widht;
    }

    public void setWidht(Double widht) {
        this.widht = widht;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return widht * height;
    }
}
