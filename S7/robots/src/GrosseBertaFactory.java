public class GrosseBertaFactory extends RobotFactory {

  @Override
  public IRobot createRobot() {
    return new Robot.Builder().name("grosse berta").canon(12).shield(2).freq(120).build();
  }
}
