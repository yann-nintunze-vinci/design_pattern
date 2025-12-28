package identification;

import domaine.AmEx;
import domaine.CarteDeCredit;
import java.util.Calendar;
import validation.Validateur;

public class GenerateurAmEx extends Generateur {

  public GenerateurAmEx(Validateur validateur, Generateur successeur) {
    super(validateur, successeur);
  }

  @Override
  public CarteDeCredit doCreer(String numero, Calendar dateExpiration, String nom) {
    return new AmEx(numero, dateExpiration, nom);
  }
}
