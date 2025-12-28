package validation;

public class ValidateurDiscover implements Validateur{

  @Override
  public boolean estValide(String numero) {
    return numero.matches("^(6011\\d{12}|65\\d{14})$");
  }
}
