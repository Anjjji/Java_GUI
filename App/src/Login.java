import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login {
	public Login() {
		JFrame frame = new JFrame("Login");
		frame.setSize(400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		

		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		panel.setBackground(Color.WHITE);
		JLabel label = new JLabel("Login");
		label.setFont(new Font("Arial", Font.BOLD, 40));
		panel.add(label);

		JLabel subheading = new JLabel("<html>Enter your credentials below to login.</html>");
		subheading.setFont(new Font("Arial", Font.PLAIN, 16));
		subheading.setPreferredSize(new Dimension(300, 50));
		panel.add(subheading);

		Components components = new Components();
		components.setBackground(Color.WHITE);
		components.setLayout(new GridLayout(8, 1));

		JTextField username = components.InputTextField("Username");
		JPasswordField userpassword = components.PasswordTextField("Password");

		JButton login = components.Button("Login", Color.WHITE, Color.BLUE);
		JButton signup = components.Link("Sign up here", Color.BLUE, Color.WHITE);

		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (username.getText().equals("admin") && userpassword.getText().equals("admin")) {
					JOptionPane.showMessageDialog(frame, "Login Successfully", "Logged in",
							JOptionPane.PLAIN_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(frame, "Incorrect username or password", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		signup.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new Signup();
			}
		});

		panel.add(components);
		frame.add(panel);
		frame.setVisible(true);
	}

	

}