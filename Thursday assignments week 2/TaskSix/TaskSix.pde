int saved_time;
int duration_seconds = 3;

void setup() {
  size(800, 800);
  saved_time = millis();
}

void draw() {
  light();
  timer();
}

void light() {
  rectMode(CENTER);
  fill(0);
  strokeWeight(35);
  line(width/2, height/2, width/2, height);
  strokeWeight(1);
  rect(width/2, height/2, width/4, height/2, 50);
}


void light_function(color top, color middle, color bottom) {
  //Red
  fill(top);
  circle(width/2, height/2.85, width/7.5);
  //Yellow
  fill(middle);
  circle(width/2, height/2, width/7.5);
  //Green
  fill(bottom);
  circle(width/2, height-height/2.85, width/7.5);
}

void timer() {
  
  light_function(color(255, 0, 0), color(127, 127, 127), color(127, 127, 127));
  
  int passed_time = millis() - saved_time;

  if (passed_time > (duration_seconds * 1000)) {
    light_function(color(127, 127, 127), color(255, 255, 0), color(127, 127, 127));
    saved_time = millis();
  }
  
}
