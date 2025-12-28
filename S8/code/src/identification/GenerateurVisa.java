package identification;

import domaine.CarteDeCredit;
import domaine.Visa;
import java.util.Calendar;
import validation.Validateur;

public class GenerateurVisa extends Generateur {

  public GenerateurVisa(Validateur validateur, Generateur successeur) {
    super(validateur, successeur);
  }

  @Override
  public CarteDeCredit doCreer(String numero, Calendar dateExpiration, String nom) {
    return new Visa(numero, dateExpiration, nom);
  }
}
