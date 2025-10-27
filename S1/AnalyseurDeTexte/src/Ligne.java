public class Ligne implements Observer {

  private int nbrLignes = 0;

  @Override
  public void traiterLigne(String ligne) {
    nbrLignes++;
  }

  public void imprimerRes() {
    System.out.println("lignes=" + nbrLignes);;
  }

}
