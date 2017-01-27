import java.util.Random;

class Tube {
  double xVel;
  int x_pos, y_pos;
  boolean tubeUpwards;

  final int tubeStart = 510;
  final int tubeBound = 50;

  Tube() {
    xVel = -4.0;
    x_pos = tubeStart;
  }

  public void update(Random r) {

    x_pos = x_pos - 3;
    if(x_pos < -10) {
      x_pos = tubeStart;
      tubeUpwards = r.nextBoolean();

      if(tubeUpwards)
        y_pos = r.nextInt(tubeBound);
      else
        y_pos = r.nextInt(tubeBound + 500);
    }

  }
}
