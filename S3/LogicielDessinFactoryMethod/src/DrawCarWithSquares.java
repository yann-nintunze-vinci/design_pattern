public class DrawCarWithSquares extends DrawCar{

  @Override
  public Shape createSharpe(int i, Point point) {
    return new Square(i, point);
  }
}
