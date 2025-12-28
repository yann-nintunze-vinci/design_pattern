package identification;

import java.util.Calendar;

import domaine.CarteDeCredit;
import validation.Validateur;

public abstract class Generateur {
	private final Generateur successeur;
	private final Validateur validateur;

	public Generateur(Validateur validateur, Generateur successeur) {
		this.successeur = successeur;
		this.validateur = validateur;
	}

	public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
		if (validateur.estValide(numero)) {
			return doCreer(numero, dateExpiration, nom);
		}
		return successeur != null ? successeur.creerCarte(numero, dateExpiration, nom) : null;
	}

	public abstract CarteDeCredit doCreer(String numero, Calendar dateExpiration, String nom);
}
