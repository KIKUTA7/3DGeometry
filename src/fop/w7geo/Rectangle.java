package fop.w7geo;

public class Rectangle extends BaseArea {
private  double width;
private  double  height;
public Rectangle (double width, double height)
{
    this.width = width;
    this.height = height;
}

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return width*height;
    }

    public double circumference() {
        return 2*width+2*height;
    }

    @Override
    public boolean isSquare() {
        return width == height;
    }

    @Override
    public Square toSquare() {
        if(this.isSquare()) {
            return new Square(width);
        }
        return null;
    }
}
