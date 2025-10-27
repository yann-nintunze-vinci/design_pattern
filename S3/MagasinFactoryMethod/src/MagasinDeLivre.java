public class MagasinDeLivre extends MagasinDe {

  @Override
  public Livre newProduit(String name, int anneeDeParution) {
    return new Livre(name, anneeDeParution);
  }
}
