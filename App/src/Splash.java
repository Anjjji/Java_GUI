import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash {
	public Splash() {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);

		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		panel.setBackground(Color.WHITE);
		
		ImageIcon image = new ImageIcon("src\\assets\\splash_image.png");
		// set size of image
		Image img = image.getImage();
		Image newImg = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon newImage = new ImageIcon(newImg);
		JLabel imgLabel = new JLabel(newImage);
		
		panel.add(imgLabel, BorderLayout.CENTER);
		
		Timer timer = new Timer(3000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new Login();
			}
		});
		timer.setRepeats(false);
		timer.start();

		frame.add(panel, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}