class Bird {
  int x_pos, y_pos, flapCounter;
  boolean flapped;

  final int flapWings = 75;

  Bird() {

  }

  public void flap() {
    y_pos = -5;
    flapCounter = flapWings;
  }

  public void update() {
    y_pos = y_pos + y_pos + (0.6);
    --flapCounter;
  }

}
