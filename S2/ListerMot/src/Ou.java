public class Ou implements Strategy{

  private final Strategy[] strategies;

  public Ou(Strategy... strategies) {
    this.strategies = strategies;
  }

  @Override
  public boolean estValide(String mot) {
    boolean res = false;
    for (Strategy strategy : strategies) {
      res = res || strategy.estValide(mot);
    }

    return res;
  }
}
