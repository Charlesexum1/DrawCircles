import javax.swing.JApplet;
import java.awt.Graphics;

public class DrawCircles extends JApplet {
	
	int moveCircles = 100;
	public void paint(Graphics canvas) {
		for (int x = 0; x < 6; x++) {
			canvas.drawOval(moveCircles, 50, 200, 200);
			moveCircles += 10;
			}
	
	}
	
	
}
