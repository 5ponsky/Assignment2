import java.util.Random;

class Model {
  int bird_x, bird_y; // May not need bird_x
  Bird bird;

  Model() {
    bird_y = 250;
    bird = new Bird(bird_x, bird_y);
  }

  public void update() {
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


  }

/*
  public void setDestination(int x, int y) {
    this.dest_x = x;
    this.dest_y = y;
  }
  */

  public void onClick() {
    bird.flap();
  }
}
