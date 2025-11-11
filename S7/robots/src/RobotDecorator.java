public abstract class RobotDecorator implements IRobot {

  private final IRobot decoratedRobot;

  public RobotDecorator(IRobot decoratedRobot) {
    this.decoratedRobot = decoratedRobot;
  }

  @Override
  public int getCanon() {
    return decoratedRobot.getCanon();
  }

  @Override
  public int getShield() {
    return decoratedRobot.getShield();
  }

  @Override
  public int getFreq() {
    return decoratedRobot.getFreq();
  }

  @Override
  public String getName() {
    return decoratedRobot.getName();
  }

  @Override
  public int diffLife(int i) {
    return decoratedRobot.diffLife(i);
  }
}
