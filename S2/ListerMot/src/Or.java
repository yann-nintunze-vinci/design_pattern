public class Or implements Strategy {

  private final Strategy s1;
  private final Strategy s2;

  public Or(Strategy s1, Strategy s2) {
    this.s1 = s1;
    this.s2 = s2;
  }

  @Override
  public boolean estValide(String mot) {
    return s1.estValide(mot) || s2.estValide(mot);
  }
}
