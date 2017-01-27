import java.util.Random;

class Tube {
  int xVel = -4.0;
  int x_pos, y_pos;
  boolean tubeUpwards;

  final int startTube = 510;
  final int endTube = -10;
  final int tubeBound = 50;

  Tube() {
    x_pos = startTube;
  }

  public void update(Random r) {
    x_pos = x_pos - 3;
    if(x_pos < -10) {
      x_pos = startTube;
      tubeUpwards = r.nextBoolean();

      if(tubeUpwards)
        y_pos = r.nextInt(tubeBound);
      else
        y_pos = r.nextInt(tubeBound + 500);
    }
  }

}
