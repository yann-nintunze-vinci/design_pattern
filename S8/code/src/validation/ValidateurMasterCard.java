package validation;

public class ValidateurMasterCard implements Validateur {

  @Override
  public boolean estValide(String numero) {
    return numero.matches("^5[1-5]\\d{14}$");
  }

}
