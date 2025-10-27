public class Main {

  public static void main(String[] args) {

    MagasinDe magasinDeDVD = new MagasinDeDVD();

    magasinDeDVD.ajouter("musique1", 2003);
    magasinDeDVD.ajouter("musique2", 2008);

    System.out.println(magasinDeDVD.retourne("musique1"));
  }
}
