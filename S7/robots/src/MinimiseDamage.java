public class MinimiseDamage extends RobotDecorator {

  public MinimiseDamage(IRobot decoratedRobot) {
    super(decoratedRobot);
  }

  @Override
  public int diffLife(int i) {
    if (i < 0) {
      i /= 2;
    }

    return super.diffLife(i);
  }
}
