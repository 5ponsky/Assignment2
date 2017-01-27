class Bird {
  double yVel;
  int x_pos, y_pos, flapCounter;
  boolean flapped;

  final int flapWings = 75;

  int test;

  Bird() {
    //yVel = yVel + 0.3;
  }

  Bird(int x, int y) {
    flapCounter = flapWings;
    x_pos = x;
    y_pos = y;

  }

  public void flap() {
    y_pos = -5;
    flapCounter = flapWings;
    //yVel = -4.0;
  }

  public void update() {
    y_pos = y_pos + 1;
    --flapCounter;
    //yVel = yVel + 0.3;


    // Testing purposes;
    test++;
    if(test > 350)
      y_pos = y_pos - 5;
      test = 0;
  }


}

/*
if(this.bird_x < this.dest_x)
  this.bird_x += Math.min(4, dest_x - bird_x);
else if(this.bird_x > this.dest_x)
  this.bird_x -= Math.min(4, dest_x + bird_x);

if(this.bird_y < this.dest_y)
  this.bird_y += Math.min(4, bird_y); //dest_y - bird_y);
else if(this.bird_y > this.dest_y)
  this.bird_y -= Math.min(4, bird_y); //dest_y + bird_y);
*/
