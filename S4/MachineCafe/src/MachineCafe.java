public class MachineCafe {

  public enum State {
    INACTIF, COLLECTE {
      @Override
      public void selectionnerBoisson(MachineCafe mc) {
        if (mc.prix < mc.montantInsere) {
          mc.setState(COLLECTE);
        } else if (mc.prix > mc.montantInsere) {
          mc.setState(PAS_ASSEZ);
        } else if (mc.prix == mc.montantInsere) {
          mc.setState(INACTIF);
        }
      }
    }, PAS_ASSEZ {
      @Override
      public void entrerMonnaie(MachineCafe mc) {
        if (mc.prix < mc.montantInsere) {
          mc.setState(COLLECTE);
        } else if (mc.prix > mc.montantInsere) {
          mc.setState(PAS_ASSEZ);
        } else if (mc.prix == mc.montantInsere) {
          mc.setState(INACTIF);
        }
      }
    };

    public void rendreMonnaie(MachineCafe mc) {
      mc.setState(INACTIF);
    }

    public void entrerMonnaie(MachineCafe mc) {
      mc.setState(COLLECTE);
    }

    public void selectionnerBoisson(MachineCafe mc) {
      throw new RuntimeException();
    }

  }

  private State state;

  private double prix;
  private double montantInsere;

  public MachineCafe() {
    setState(State.INACTIF);
  }

  public void rendreMonnaie() {
    state.rendreMonnaie(this);
  }

  public void entrerMonnaie(double montant) {
    montantInsere += montant;
    state.entrerMonnaie(this);
  }

  public void selectionnerBoisson(double prix) {
    this.prix += prix;
    state.selectionnerBoisson(this);
  }

  public void setState(State state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "prix: " + prix + "\nmontant: " + montantInsere + "\netat: " + state;
  }

  public static void main(String[] args) {
    MachineCafe mc = new MachineCafe();
    mc.entrerMonnaie(10);
    mc.selectionnerBoisson(3);
    mc.selectionnerBoisson(4);
    mc.selectionnerBoisson(5);
    mc.entrerMonnaie(3);
    mc.rendreMonnaie();
    System.out.println(mc);
  }
}
