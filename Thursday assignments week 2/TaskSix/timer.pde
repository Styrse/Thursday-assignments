void timer() {
  int passed_time = millis() - saved_time;
  println(passed_time);

  if (passed_time > (duration_seconds * 3500)) {
    light_function(color(255, 0, 0), color(127, 127, 127), color(127, 127, 127));
    saved_time = millis();
  } else if (passed_time > (duration_seconds * 3000)) {
    light_function(color(127, 127, 127), color(255, 255, 0), color(127, 127, 127));
  } else if (passed_time > (duration_seconds * 1500)) {
    light_function(color(127, 127, 127), color(127, 127, 127), color(0, 255, 0));
  } else if (passed_time > (duration_seconds * 1000)) {
    light_function(color(255, 0, 0), color(255, 255, 0), color(127, 127, 127));
  } else {
    light_function(color(255, 0, 0), color(127, 127, 127), color(127, 127, 127));
  }
}
