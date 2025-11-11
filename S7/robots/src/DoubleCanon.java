public class DoubleCanon extends RobotDecorator {

  public DoubleCanon(IRobot decoratedRobot) {
    super(decoratedRobot);
  }

  @Override
  public int getCanon() {
    return super.getCanon() * 2;
  }
}
