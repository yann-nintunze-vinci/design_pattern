public class Palindrome implements Observer {

  private int nbrPalindromes = 0;

  @Override
  public void traiterLigne(String ligne) {
    for (String mot : ligne.trim().split(" ")) {
      StringBuilder temp = new StringBuilder(mot);
      if (mot.contentEquals(temp.reverse())) {
        nbrPalindromes++;
      }
    }
  }

  @Override
  public void imprimerRes() {
    System.out.println("palindromes=" + nbrPalindromes);;
  }

}
