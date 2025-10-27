public class Captain extends BattleShipDecorator {

  public Captain(BattleShip battleship) {
    super(battleship);
  }

  @Override
  public void fire() {
	System.out.print("Captain's order : ");
    super.fire();
  }

  @Override
  public void move(Distance distance) {
    System.out.print("Captain's order : ");
    super.move(distance);
  }

}
