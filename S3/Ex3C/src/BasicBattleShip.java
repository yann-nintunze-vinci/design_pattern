public class BasicBattleShip implements BattleShip {

  @Override
  public void fire() {
    System.out.println("firing...");
  }

  @Override
  public void move(Distance distance) {
    System.out.println("The Boat is moving "+distance.getDistance());
  }
}
