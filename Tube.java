import java.util.Random;

class Tube {
  final int TUBEBOUND = 115;
  int x_pos, y_pos;
  boolean tubeUpwards;
  Random random;

  Tube(Random r) {
    random = r;
  }

  public void update() {
    x_pos = x_pos - 6;

    if(x_pos < -56) {
      x_pos = 556;
      tubeUpwards = random.nextBoolean();

      if(tubeUpwards)
        y_pos = random.nextInt(TUBEBOUND) + 250;
      else
        y_pos = random.nextInt(TUBEBOUND) - 250;
    }

  }

}
