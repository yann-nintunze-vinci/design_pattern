public class Palindrome implements Strategy {

  @Override
  public boolean estValide(String mot) {
    return mot != null && mot.contentEquals(new StringBuffer(mot).reverse());
  }
}
