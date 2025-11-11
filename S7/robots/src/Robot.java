public class Robot implements IRobot {

  private final String name;
  private int life;
  private final int canon;
  private final int shield;
  private final int freq;

  public Robot(String name, int life, int canon, int shield, int freq) {
    this.name = name;
    this.life = life;
    this.canon = canon;
    this.shield = shield;
    this.freq = freq;
  }

  @Override
  public int getCanon() {
    return canon;
  }

  @Override
  public int getShield() {
    return shield;
  }

  @Override
  public int getFreq() {
    return freq;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int diffLife(int i) {
    if (i != 0) {
      life += i;
    }
    return life;
  }

  public static class Builder {

    private String name = "";
    private int life = 100;
    private int canon = 1;
    private int shield = 1;
    private int freq = 100;

    public Builder life(int life) {
      this.life = life;
      return this;
    }

    public Builder canon(int canon) {
      this.canon = canon;
      return this;
    }

    public Builder shield(int shield) {
      this.shield = shield;
      return this;
    }

    public Builder freq(int freq) {
      this.freq = freq;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public IRobot build() {
      return new Robot(name, life, canon, shield, freq);
    }
  }
}
