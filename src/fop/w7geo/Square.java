package fop.w7geo;

public class Square extends BaseArea {
  private  double length;
  public Square (double length)
  {
      this.length = length;
  }

    public double getLength() {
        return length;
    }
    @Override
    public double area()
    {
        return length*length;
    }

    @Override
    public double circumference() {
        return 4*length;
    }

    @Override
    public boolean isSquare() {
        return true;
    }

    @Override
    public Square toSquare() {
        if(this.isSquare()) {
            return new Square(length);
        }
        return null;
    }
}
