import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// grid

    fill(0, 0, 0);
    for (int lineX = 20; lineX <= 200; lineX += 20) {
    line(lineX, 0, lineX, height/2);
      }
    for (int lineY = 20; lineY <= 200; lineY += 20) {
    line(0, lineY, width/2, lineY);
      }

  // circles

    fill(128, 0, 128);
    
    for (int circleX = 230; circleX <= 400; circleX += 35) {
    ellipse(circleX, 30, 20, 20);
      }
  
    for (int circleX = 230; circleX <= 400; circleX += 35) {
    ellipse(circleX, 65, 20, 20);
      }
  
    for (int circleX = 230; circleX <= 400; circleX += 35) {
    ellipse(circleX, 100, 20, 20);
      }

    for (int circleX = 230; circleX <= 400; circleX += 35) {
    ellipse(circleX, 135, 20, 20);
      }

    for (int circleX = 230; circleX <= 400; circleX += 35) {
    ellipse(circleX, 170, 20, 20);
      }

  // gradient

    for(int y = 200; y <= height; y++){
      for(int x = 0; x <= width/2; x++){
        stroke(x + 25, x + 25, x + 25);
        point(x, y);
      }
    }



  // flower
    fill(255, 255, 0);
    ellipse (300, 300, 40, 40);
    
    /*
    for (int lineX = 230; lineX <= 400; lineX += 70) { 
      for (int lineY = 230; lineY <= 400; lineY += 70){
        line(lineX, lineY, 300, 300);
      }
    }
    */ 

    fill(0, 255, 0);
    translate(295, 287);
    for (int i=0; i < 8; i++) {
      translate(10, 0);
      ellipse(0, -45, 20, 70);
      rotate (TWO_PI/8);
    }
  
  
  // define other methods down here.
}
}