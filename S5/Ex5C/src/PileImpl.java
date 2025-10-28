public class PileImpl implements Pile {
	private NoeudPile tete;
	private int taille;

	public PileImpl() {
		this.tete = null;
	}

	public void push(Object �l�ment) {
		this.tete = new NoeudPile(�l�ment, this.tete);
		this.taille++;
	}

	public Object pop() {
		Object r�sultat = sommet();
		this.tete = this.tete.getSuivant();
		this.taille--;
		return r�sultat;
	}

	public Object sommet() {
		return this.tete.getElement();
	}

	public boolean estVide() {
		return this.tete == null;
	}

	public int taille() {
		return this.taille;
	}

	public String toString() {
		NoeudPile courant = this.tete;
		String r�sultat = "";
		while (courant != null) {
			r�sultat += courant.getElement();
			r�sultat += " ";
			courant = courant.getSuivant();
		}
		return r�sultat;
	}

	class NoeudPile {
		private Object element;
		private NoeudPile suivant;

		public NoeudPile(Object element) {
			this(element, null);
		}

		public NoeudPile(Object element, NoeudPile suivant) {
			setEl�ment(element);
			setSuivant(suivant);
		}

		public void setEl�ment(Object elem) {
			this.element = elem;
		}

		public void setSuivant(NoeudPile suiv) {
			this.suivant = suiv;
		}

		public Object getElement() {
			return this.element;
		}

		public NoeudPile getSuivant() {
			return this.suivant;
		}
	}
}
