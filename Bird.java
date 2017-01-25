class Bird {
  double yVel = 0;
  double x_pos, y_pos;

  Bird() {

  }

  Bird(int x, int y) {
    x_pos = x;
    y_pos = y;
    
  }

  public void flap() {
    yVel = 1.0;
  }

  public void update() {
    yVel = yVel - 0.3;
  }


}
