package fop.w7geo;

public class Circle extends BaseArea {
    private  double radius;
    public Circle (double radius)
    {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double circumference() {
        return 2*Math.PI*radius;
    }



}
