public class Bear {

  public enum State {
    SLEEPING {
      @Override
      public void attack(Bear bear) {
        System.out.println("Zzzzzz");
      }

      @Override
      public void sleep(Bear bear) {
        throw new RuntimeException("already sleeping");
      }

      @Override
      public void wakeup(Bear bear) {
        bear.setState(NOT_SLEEPING);
      }

    }, NOT_SLEEPING {
      @Override
      public void attack(Bear bear) {
        System.out.println("Groarrr");
      }

      @Override
      public void sleep(Bear bear) {
        bear.setState(SLEEPING);
      }

      @Override
      public void wakeup(Bear bear) {
        throw new RuntimeException("already not sleeping");
      }
    };

    abstract void attack(Bear bear);

    void sleep(Bear bear) {
      bear.setState(SLEEPING);
    }

    public void wakeup(Bear bear) {
      bear.setState(NOT_SLEEPING);
    }
  }

  private State state;

  public Bear() {
    setState(State.NOT_SLEEPING);
  }

  public void wakeup() {
    state.wakeup(this);
  }

  public void sleep() {
    state.sleep(this);
  }

  public void attack() {
    state.attack(this);
  }

  public void setState(State state) {
    this.state = state;
  }

}
