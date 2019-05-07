

import java.util.HashMap;
import java.awt.Color;

public class LineFactory {

	//private static int c =0;
	private static final HashMap <Color, Line> linesByColor = new HashMap <Color, Line> ();
	   
	public static Line getLine(Color color) {
		Line line = (Line) linesByColor.get(color);
					
		if(line == null) {
			line = new Line(color);				
			linesByColor.put(color, line);
		
	         
		}
		
		return line;
	}
}

