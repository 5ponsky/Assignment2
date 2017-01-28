import java.util.Random;

class Cloud {
  int x_pos, y_pos;
  Random random;

  Cloud(Random r) {
    random = r;
    x_pos = 575;
  }

  public void update() {
    x_pos = x_pos - 2;

    if(x_pos < -501) {
      x_pos = 501;
      y_pos = random.nextInt(250) + 50;
    }
  }

}
