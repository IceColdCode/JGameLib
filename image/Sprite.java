package image;

import jave.awt.*;
import java.util.LinkedList;

public abstract class Sprite {
  
  // frame stuff
  public LinkedList<bufferedImage> Frames = new LinkedList<>(20);
  public int x, y;
  public int dx, dy;
  private int currentIndex
  private int cycles = 0;
  
  // graphics
  Graphics2D g;
  
  public void move() {
    
   g.drawImage( 
    
  }
  
}
