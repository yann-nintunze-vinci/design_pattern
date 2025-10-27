import java.util.HashMap;
import java.util.Map;


public class MagasinDe {

  private final Map<String, Produit> bac = new HashMap<>();
  private final Factory factory;

  public MagasinDe(Factory factory) {
    this.factory = factory;
  }

  public void ajouter(String name, int anneeDeParution) {
    bac.put(name, factory.newProduit(name, anneeDeParution));
  }

	public Produit retourne(String name) {
    return bac.get(name);
  }
}
