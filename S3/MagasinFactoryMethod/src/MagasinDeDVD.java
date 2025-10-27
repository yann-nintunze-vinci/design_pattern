public class MagasinDeDVD extends MagasinDe {

  @Override
  public DVD newProduit(String name, int anneeDeParution) {
    return new DVD(name, anneeDeParution);
  }
}
