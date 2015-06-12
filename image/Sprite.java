package image;

import jave.awt.*;
import java.util.LinkedList;

public abstract class Sprite {
  
  // frame stuff
  public LinkedList<bufferedImage> frames = new LinkedList<>(20);
  public int x, y;
  public int dx, dy;
  private int currentIndex = 0;
  private int cycles = 0;
  
  // graphics
  Graphics2D g;
  
  public void move() {
    
   g.drawImage(frames(currentIndex), x, y, null);
   
   x += dx;
   y += dy;
   
   cycles++;
   currentIndex++;
    
  }
  
}
