import java.util.HashMap;
import java.util.Map;


public abstract class MagasinDe {

  private final Map<String, Produit> bac = new HashMap<>();

  public void ajouter(String name, int anneeDeParution) {
    bac.put(name, this.newProduit(name, anneeDeParution));
  }

	public Produit retourne(String name) {
    return bac.get(name);
  }

	public abstract Produit newProduit(String name, int anneeDeParution);
}
