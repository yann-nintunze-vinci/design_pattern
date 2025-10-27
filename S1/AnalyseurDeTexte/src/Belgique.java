public class Belgique implements Observer {

  private int nbrBelgique = 0;

  @Override
  public void traiterLigne(String ligne) {
    if (ligne.toLowerCase().contains("belgique")) {
      nbrBelgique++;
    }
  }

  public void imprimerRes() {
    System.out.println("belgique=" + nbrBelgique);
    ;
  }
}
