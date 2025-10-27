public class Not implements Strategy {

  private final Strategy s;

  public Not(Strategy s) {
    this.s = s;
  }

  @Override
  public boolean estValide(String mot) {
    return !s.estValide(mot);
  }
}
