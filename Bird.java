class Bird {
  boolean flapped;
  double gravity;
  int x_pos, y_pos, flapCounter;

  Bird() {
    x_pos = 10;
    y_pos = 250;
  }

  public void flap() {
    gravity = gravity - 2.5;
    y_pos = y_pos - (int) gravity;
    flapCounter = 3;
  }

  public void update() {
    gravity = gravity + 0.3;
    y_pos = y_pos + (int) gravity;
    --flapCounter;
  }

}
