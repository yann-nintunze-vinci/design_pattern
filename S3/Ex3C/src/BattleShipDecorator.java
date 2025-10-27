public abstract class BattleShipDecorator implements BattleShip {

  private BattleShip decoratedShip;

  public BattleShipDecorator(BattleShip decoratedShip) {
    this.decoratedShip = decoratedShip;
  }

  @Override
  public void fire() {
    System.out.print("BattleShipDecorator's order : ");
    decoratedShip.fire();
  }

  @Override
  public void move(Distance distance) {
    System.out.print("BattleShipDecorator's order : ");
    decoratedShip.move(distance);
  }

}
