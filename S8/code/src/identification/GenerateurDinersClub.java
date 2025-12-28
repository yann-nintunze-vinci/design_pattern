package identification;

import domaine.CarteDeCredit;
import domaine.DinersClub;
import java.util.Calendar;
import validation.Validateur;

public class GenerateurDinersClub extends Generateur {

  public GenerateurDinersClub(Validateur validateur, Generateur sucesseur) {
    super(validateur, sucesseur);
  }

  @Override
  public CarteDeCredit doCreer(String numero, Calendar dateExpiration, String nom) {
    return new DinersClub(numero, dateExpiration, nom);
  }
}
