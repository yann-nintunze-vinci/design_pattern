public class Et implements Strategy {

  private final Strategy[] strategies;

  public Et(Strategy... strategies) {
    this.strategies = strategies;
  }

  @Override
  public boolean estValide(String mot) {
    boolean res = true;
    for (Strategy strategy : strategies) {
      res = res && strategy.estValide(mot);
    }

    return res;
  }
}
