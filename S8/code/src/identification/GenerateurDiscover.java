package identification;

import domaine.CarteDeCredit;
import domaine.Discover;
import java.util.Calendar;
import validation.Validateur;

public class GenerateurDiscover extends Generateur {

  public GenerateurDiscover(Validateur validateur, Generateur successeur) {
    super(validateur, successeur);
  }

  @Override
  public CarteDeCredit doCreer(String numero, Calendar dateExpiration, String nom) {
    return new Discover(numero, dateExpiration, nom);
  }
}
