public class Album {

  private String titre, artiste;

  private boolean estRemasterise;
  private int annee, anneeOriginale, debitStandard, debitPremium;
  private String genre, label, producteur, pays, version;

  private Album(Builder builder) {
    this.titre = builder.titre;
    this.artiste = builder.artiste;
    this.estRemasterise = builder.estRemasterise;
    this.annee = builder.annee;
    this.anneeOriginale = builder.anneeOriginale;
    this.debitStandard = builder.debitStandard;
    this.debitPremium = builder.debitPremium;
    this.genre = builder.genre;
    this.label = builder.label;
    this.producteur = builder.producteur;
    this.pays = builder.pays;
    this.version = builder.version;
  }

  @Override
  public String toString() {
    return "Album{" +
        "titre='" + titre + '\'' +
        ", artiste='" + artiste + '\'' +
        ", estRemasterise=" + estRemasterise +
        ", annee=" + annee +
        ", anneeOriginale=" + anneeOriginale +
        ", debitStandard=" + debitStandard +
        ", debitPremium=" + debitPremium +
        ", genre='" + genre + '\'' +
        ", label='" + label + '\'' +
        ", producteur='" + producteur + '\'' +
        ", pays='" + pays + '\'' +
        ", version='" + version + '\'' +
        '}';
  }

  public static class Builder {

    private String titre, artiste;

    private boolean estRemasterise;
    private int annee, anneeOriginale, debitStandard, debitPremium;
    private String genre, label, producteur, pays, version;

    public Builder(String titre, String artiste) {
      this.titre = titre;
      this.artiste = artiste;
    }

    public Album build() {
      return new Album(this);
    }

    public Builder annee(int annee) {
      this.annee = annee;
      return this;
    }

    public Builder anneeOriginale(int anneeOriginale) {
      this.anneeOriginale = anneeOriginale;
      this.estRemasterise = true;
      return this;
    }

    public Builder debitStandard(int debitStandard) {
      this.debitStandard = debitStandard;
      return this;
    }

    public Builder debitPremium(int debitPremium) {
      this.debitPremium = debitPremium;
      return this;
    }

    public Builder genre(String genre) {
      this.genre = genre;
      return this;
    }

    public Builder label(String label) {
      this.label = label;
      return this;
    }

    public Builder producteur(String producteur) {
      this.producteur = producteur;
      return this;
    }

    public Builder pays(String pays) {
      this.pays = pays;
      return this;
    }

    public Builder version(String version) {
      this.version = version;
      return this;
    }
  }
}
