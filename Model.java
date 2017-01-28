import java.util.Random;

class Model {
  int tube_y;
  Cloud cloud;
  Bird bird;
  Tube tube;
  Random random;

  Model() {
    bird = new Bird();
    random = new Random();
    tube = new Tube(random);
    cloud = new Cloud(random);
  }

  private boolean collisionDetected() {
    // Bird: 64 x 57
    // Tube: 55 x 400

    if(bird.x_pos + 64 < tube.x_pos) // right -> left collision
      return false;
    if(bird.x_pos > tube.x_pos + 55) // left -> right collision
      return false;
    if(bird.y_pos + 57 < tube.y_pos) // bottom -> top collision
      return false;
    if(bird.y_pos > tube.y_pos + 400) // top -> bottom collision
      return false;

    System.out.println("Ouch!");
    return true;
  }

  public void update() {
    bird.update();
    tube.update();
    cloud.update();
    collisionDetected();

    if(bird.y_pos > 500) {
      System.out.println("AAAAAAAAHHH!");
      bird.y_pos = 250;
      bird.gravity = -1.5;
    }
  }

  public void onClick() {
    bird.flap();
  }

}
