public class Main {

  public static void main(String[] args) {

    MagasinDe magasinDeDVD = new MagasinDe(new DVDFactory());

    magasinDeDVD.ajouter("musique1", 2003);
    magasinDeDVD.ajouter("musique2", 2008);

    System.out.println(magasinDeDVD.retourne("musique1"));

    MagasinDe magasinDeLivre = new MagasinDe(new LivreFactory());

    magasinDeLivre.ajouter("livre1", 1997);
    magasinDeLivre.ajouter("livre2", 1992);

    System.out.println(magasinDeLivre.retourne("livre2"));
  }
}
