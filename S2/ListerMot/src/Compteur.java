public class Compteur implements Strategy{

  private Strategy strategy;
  private int nbMots;

  public Compteur(Strategy strategy) {
    this.strategy = strategy;
    this.nbMots = 0;
  }

  public int getNbMots() {
    return nbMots;
  }

  @Override
  public boolean estValide(String mot) {
    boolean valide = strategy.estValide(mot);
    if (valide) nbMots++;
    return valide;
  }
}
