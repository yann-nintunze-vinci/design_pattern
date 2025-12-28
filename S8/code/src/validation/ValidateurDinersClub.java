package validation;

public class ValidateurDinersClub implements Validateur {

  @Override
  public boolean estValide(String numero) {
    return numero.matches("^36\\d{12}$");
  }
}
