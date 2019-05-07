

import java.awt.*;
public class Line {
   private Color color = Color.black;
   //private int x, y, x2, y2;
   
   public Line(Color color) {
	   
	   this.color = color;
	   
   }
   
   public void draw(Graphics g, int x1, int y1, int x2, int y2) {
	      g.setColor(color);
	      g.drawLine(x1, y1, x2, y2);
	      //g.fillRect(upperX, upperY, width, height);
   }
   
  
   
}
