public class TankFactory extends RobotFactory {

  @Override
  public IRobot createRobot() {
    return new Robot.Builder().name("tank").canon(4).shield(8).freq(120).life(120).build();
  }
}
