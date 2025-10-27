public class LivreFactory implements Factory{

  @Override
  public Produit newProduit(String name, int anneeDeParution) {
    return new Livre(name, anneeDeParution);
  }
}
