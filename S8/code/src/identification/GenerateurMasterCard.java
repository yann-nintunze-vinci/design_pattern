package identification;

import domaine.CarteDeCredit;
import domaine.MasterCard;
import java.util.Calendar;
import validation.Validateur;

public class GenerateurMasterCard extends Generateur {

  public GenerateurMasterCard(Validateur validateur, Generateur successeur) {
    super(validateur, successeur);
  }

  @Override
  public CarteDeCredit doCreer(String numero, Calendar dateExpiration, String nom) {
    return new MasterCard(numero, dateExpiration, nom);
  }
}
