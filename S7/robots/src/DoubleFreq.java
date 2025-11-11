public class DoubleFreq extends RobotDecorator {

  public DoubleFreq(IRobot decoratedRobot) {
    super(decoratedRobot);
  }

  @Override
  public int getFreq() {
    return super.getFreq() / 2;
  }
}
