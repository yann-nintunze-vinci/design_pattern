package dwarvens;

public abstract class DwarvenMineWorker {

  public void goToSleep() {
    System.out.println(name() + " va dormir.");
  }

  public void wakeUp() {
    System.out.println(name() + " se réveille.");
  }

  public void goHome() {
    System.out.println(name() + " rentre chez lui.");
  }

  public void goToMine() {
    System.out.println(name() + " va à la mine.");
  }

  public abstract void work();

  public abstract String name();
}
