void light_function(color top, color middle, color bottom) {
  rectMode(CENTER);
  fill(0);
  strokeWeight(35);
  line(width/2, height/2, width/2, height);
  strokeWeight(1);
  rect(width/2, height/2, width/4, height/2, 50);
  
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
