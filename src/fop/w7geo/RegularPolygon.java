package fop.w7geo;

public class RegularPolygon extends BaseArea {
 private final int n;
 private final double length;
 public RegularPolygon (int n, double length)
 {
     this.n=n;
     this.length = length;

 }

    public double getLength() {
        return length;
    }

    public int getN() {
        return n;
    }
    @Override
    public double area() {
     return (n*length*length)/(4*Math.tan(Math.PI/n));
    }
    @Override
    public double circumference()
    {
        return n*length;
    }

    @Override
    public boolean isSquare() {
        if(n==4) return true;
        return false;
    }

    @Override
    public Square toSquare() {
        if(this.isSquare()) {
            return new Square(length);
        }
        return null;
    }
}
