class Bird {
  double yVel = 0;

  Bird() {

  }

  Bird(int x, int y) {

  }

  public void flap() {
    yVel = 1.0;
  }

  public void update() {
    yVel = yVel - 0.3;
  }


}
