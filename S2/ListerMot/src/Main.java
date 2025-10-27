public class Main {

  public static void main(String[] args) {

    Strategy commencePar = new CommencePar('r');
    Strategy deLongueur = new DeLongueur(9);
    Strategy palindrome = new Palindrome();

    ListerMot listerMot = new ListerMot("montexte.txt");

    Strategy and = new And(commencePar, palindrome);
    Strategy or = new Or(commencePar, palindrome);
    listerMot.imprimerSi(and);
    System.out.println();

    listerMot.imprimerSi(or);
    System.out.println();

    Strategy et = new Et(commencePar, palindrome, deLongueur);
    listerMot.imprimerSi(et);
    System.out.println();

    Strategy ou = new Ou(commencePar, palindrome, deLongueur);
    listerMot.imprimerSi(ou);
    System.out.println();
  }

}
