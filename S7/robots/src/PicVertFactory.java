public class PicVertFactory extends RobotFactory {

  @Override
  public IRobot createRobot() {
    return new Robot.Builder().name("pic-vert").canon(3).freq(50).build();
  }
}
