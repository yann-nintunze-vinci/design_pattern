package client;

import domaine.CarteDeCredit;
import identification.Generateur;
import identification.GenerateurAmEx;
import identification.GenerateurDinersClub;
import identification.GenerateurDiscover;
import identification.GenerateurMasterCard;
import identification.GenerateurVisa;
import java.util.Calendar;
import validation.*;

public class Facade {

  private Generateur generateur;

  public Facade() {
    Validateur amex = new ValidateurAmEx();
    Validateur visa = new ValidateurVisa();
    Validateur mc = new ValidateurMasterCard();
    Validateur disc = new ValidateurDiscover();
    Validateur diners = new ValidateurDinersClub();

    this.generateur =
        new GenerateurVisa(visa,
            new GenerateurMasterCard(mc,
                new GenerateurDiscover(disc,
                    new GenerateurDinersClub(diners,
                        new GenerateurAmEx(amex, null)))));

  }

  public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
    return generateur.creerCarte(numero, dateExpiration, nom);
  }
}
