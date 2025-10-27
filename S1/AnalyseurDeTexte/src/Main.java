public class Main {

  public static void main(String[] args) {
    AnalyseurDeTexte analyseurDeTexte = new AnalyseurDeTexte();

    Observer mot = new Mot();
    Observer palindrome = new Palindrome();
    Observer belgique = new Belgique();
    Observer ligne = new Ligne();

    analyseurDeTexte.registerObservers(mot, palindrome, belgique, ligne);

    analyseurDeTexte.lireFichier("montexte.txt");

    mot.imprimerRes();
    palindrome.imprimerRes();
    belgique.imprimerRes();
    ligne.imprimerRes();

  }
}
