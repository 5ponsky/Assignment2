import java.util.Random;

class Model {
  Bird bird;
  Tube tube;
  int tube_y;
  Random tubeHeight;

  Model() {
    bird = new Bird(); //bird_x, bird_y);
    tube = new Tube();
    tubeHeight = new Random();
  }

  private bool collisionDetection() {
    // Bird: 64 x 57
    // Tube: 55 x 400

    if(bird.x_pos + 64 < tube.x_pos) // right -> left collision
      return false;
    if(bird.x_pos > tube.x + 55) // left -> right collision
      return false;
    if(bird.y_pos + 57 < tube.y) // bottom -> top collision
      return false;
    if(bird.y_pos > tube.y + 400) // top -> bottom collision
      return false;

    System.out.println.("Ouch");
    return true;
  }

  public void update() {
    bird.update();
    tube.update(tubeHeight);

  }

  public void onClick() {
    bird.flap();
  }
}
