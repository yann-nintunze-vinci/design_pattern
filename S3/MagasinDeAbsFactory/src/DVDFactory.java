public class DVDFactory implements Factory{

  @Override
  public DVD newProduit(String name, int anneeDeParution) {
    return new DVD(name, anneeDeParution);
  }
}
