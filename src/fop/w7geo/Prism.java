package fop.w7geo;

public class Prism {
  private double height;
  private BaseArea base;
  public Prism (BaseArea base, double height)
  {
    this.height = height;
    this.base = base;
  }
  public double getHeight() {
    return height;
  }

  public BaseArea getBase() {
    return base;
  }

  public double surface()
  {
      return 2* base.area()+height*base.circumference();
  }
  public double volume()
  {
    return base.area()*height;
  }
  public boolean isCube()
  {
     return (base.isSquare() && base.toSquare().getLength() == height);
  }
}
