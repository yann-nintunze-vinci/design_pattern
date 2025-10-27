public class DrawCarWithCircles extends DrawCar {

  @Override
  public Shape createSharpe(int i, Point point) {
    return new Circle(i, point);
  }
}
