import java.util.Random;

class Model {
  //int bird_x, bird_y; // May not need bird_x
  Bird bird;
  Tube tube;
  int tube_y;
  Random tubeHeight;

  Model() {
    bird = new Bird(); //bird_x, bird_y);
    tube = new Tube();
    tubeHeight = new Random();
  }

  public void update() {
    bird.update();
    tube.update(tubeHeight);
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
