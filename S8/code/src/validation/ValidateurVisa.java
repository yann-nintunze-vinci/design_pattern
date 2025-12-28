package validation;

public class ValidateurVisa implements Validateur {

  @Override
  public boolean estValide(String numero) {
    return numero.matches("^4\\d{15}$");
  }

}
