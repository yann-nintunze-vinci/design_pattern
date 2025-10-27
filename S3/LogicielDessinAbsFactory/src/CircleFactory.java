public class CircleFactory implements Factory {

  @Override
  public Shape createSharpe(int i, Point point) {
    return new Circle(i, point);
  }
}
