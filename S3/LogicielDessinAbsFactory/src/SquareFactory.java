public class SquareFactory implements Factory {

  @Override
  public Shape createSharpe(int i, Point point) {
    return new Square(i, point);
  }
}
