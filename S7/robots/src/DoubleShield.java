public class DoubleShield extends RobotDecorator{

  public DoubleShield(IRobot decoratedRobot) {
    super(decoratedRobot);
  }

  @Override
  public int getShield() {
    return super.getShield() * 2;
  }
}
