import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.Graphics;
import java.io.File;
import javax.swing.JButton;
import java.awt.Color;

class View extends JPanel
{
	JButton b1;
	Image bird_image;
	Model model;
	Controller controller;

	View(Controller c, Model m)
	{
		model = m;
		controller = c;
		c.setView(this);
		b1 = new JButton("Never push me");
		b1.addActionListener(c);
		this.add(b1);

		try {
			this.bird_image = ImageIO.read(new File("REPLACEME"));
		} catch(Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}

	}

	public void paintComponent(Graphics g) {
		g.setColor(new Color(128, 255, 255));
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.drawImage(this.bird_image, model.bird_x, model.bird_y, null);
	}

	void removeButton() {
		this.remove(b1);
		this.repaint();
	}

}
