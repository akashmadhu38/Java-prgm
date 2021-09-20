import java.awt.*;
import java.applet.*;


public class CO4PG3 extends Applet
{

    public void paint(Graphics g)
    { 	int [] x = {150, 300, 225};
		int [] y = {150, 150, 25};
        g.setColor(Color.gray);
        g.fillRect(150, 150, 250, 200);
        g.setColor(Color.green);
        g.fillRect(200, 200, 80, 150); 
        g.setColor(Color.black);
		g.fillRect(220, 30, 180, 120); 
		g.setColor(Color.blue);
        g.fillPolygon(x, y, 3);


    }
}
