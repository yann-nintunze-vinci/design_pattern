public class Mot implements Observer {

  private int nbrMots = 0;
  @Override
  public void traiterLigne(String ligne) {
    nbrMots += ligne.trim().split(" ").length;
  }

  @Override
  public void imprimerRes() {
    System.out.println("mots=" + nbrMots);;
  }
}
