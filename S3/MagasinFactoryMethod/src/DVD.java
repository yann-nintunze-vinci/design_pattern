public class DVD extends Produit {

  public static final double PRIX = 19.99;

  public DVD(String name, int anneeDeParution) {
    super(name, anneeDeParution, PRIX);
  }

  @Override
  public String toString() {
    return "Dvd" + super.toString();
  }
}
