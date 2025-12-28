package validation;

public class ValidateurAmEx implements Validateur{

  @Override
  public boolean estValide(String numero) {
    return numero.matches("^(34|37)\\d{13}$");
  }
}
