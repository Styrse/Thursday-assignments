color red_light = color(255, 0, 0);
color yellow_light = color(255, 255, 0);
color green_light = color(0, 255, 0);
color grey = color(127);

void setup() {
  size(800, 800);
}

void draw(){
  rectMode(CENTER);
  fill(0);
  strokeWeight(35);
  line(width/2, height/2, width/2, height);
  strokeWeight(1);
  rect(width/2, height/2, width/4, height/2, 50);
  
  
  //Red
  fill(red_light);
  circle(width/2, height/2.85, width/7.5);
  //Yellow
  fill(yellow_light);
  circle(width/2, height/2, width/7.5);
  //Green
  fill(grey);
  circle(width/2, height-height/2.85, width/7.5);
  
}

//Try modulus to set time 
