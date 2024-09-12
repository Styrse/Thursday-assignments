int saved_time;
int duration_seconds = 2;

void setup() {
  size(800, 800);
  saved_time = millis();
}

void draw() {
  timer();
}
