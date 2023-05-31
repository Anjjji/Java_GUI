import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Components extends JPanel {
	Border PAD_BORDER = BorderFactory.createEmptyBorder(10, 15, 10, 15);
	Border COM_BORDER = BorderFactory.createCompoundBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK), PAD_BORDER);

	Color primaryColor = new Color(239, 98, 108);
	Color secondaryColor = new Color(255, 255, 255);
	Color tertiaryColor = new Color(0, 0, 0);

	public JTextField InputTextField(String name) {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 1));
		panel.setBackground(Color.WHITE);
		// Label
		JLabel label = new JLabel(name);
		label.setFont(new Font("Arial", Font.BOLD, 16));

		// Text input field
		JTextField textField = new JTextField();
		textField.setText(name);
		textField.setPreferredSize(new Dimension(300, 50));
		textField.setMargin(new Insets(10, 10, 10, 10));
		textField.setFont(new Font("Arial", Font.PLAIN, 16));
		textField.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(1, 1, 1, 1, Color.LIGHT_GRAY),
				BorderFactory.createEmptyBorder(10, 15, 10, 15)));

		// add to panel
		panel.add(label);
		panel.add(textField);
		add(panel, BorderLayout.CENTER);

		textField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				textField.setBorder(COM_BORDER);

				if (textField.getText().equals(name)) {
					textField.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				textField.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(1, 1, 1, 1, Color.LIGHT_GRAY),
						BorderFactory.createEmptyBorder(10, 15, 10, 15)));
				if (textField.getText().isEmpty()) {
					textField.setText(name);
				}
				throw new UnsupportedOperationException("Unimplemented method 'focusLost'");
			}
		});

		// add getter text
		return textField;
	}


	public JPasswordField PasswordTextField(String name) {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 1));
		panel.setBackground(Color.WHITE);
		// Label
		JLabel label = new JLabel(name);
		label.setFont(new Font("Arial", Font.BOLD, 16));

		// Text input field
		JTextField passwordField = new JPasswordField();
		passwordField.setText(name);
		passwordField.setPreferredSize(new Dimension(300, 50));
		passwordField.setMargin(new Insets(10, 10, 10, 10));
		passwordField.setFont(new Font("Arial", Font.PLAIN, 16));
		passwordField.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(1, 1, 1, 1, Color.LIGHT_GRAY),
				BorderFactory.createEmptyBorder(10, 15, 10, 15)));

		// add to panel
		panel.add(label);
		panel.add(passwordField);
		add(panel, BorderLayout.CENTER);

		passwordField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				passwordField.setBorder(COM_BORDER);

				if (passwordField.getText().equals(name)) {
					passwordField.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				passwordField.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(1, 1, 1, 1, Color.LIGHT_GRAY),
						BorderFactory.createEmptyBorder(10, 15, 10, 15)));
				if (passwordField.getText().isEmpty()) {
					passwordField.setText(name);
				}
				throw new UnsupportedOperationException("Unimplemented method 'focusLost'");
			}
		});
		
		return (JPasswordField) passwordField;
	}
	

	// create a button with a name and a changeable color and bg, set size same as the input
	public JButton Button(String name, Color color, Color bg) {
		// add panel first
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(300, 50));

		JButton button = new JButton(name);
		button.setPreferredSize(new Dimension(300, 50));
		button.setBackground(bg);
		button.setForeground(color);
		button.setFont(new Font("Arial", Font.BOLD, 16));
		button.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		button.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel.add(button, BorderLayout.CENTER);
		add(panel, BorderLayout.CENTER);

		return button;
	}

	// craete a link using button
	public JButton Link(String name, Color color, Color bg) {
		JButton button = new JButton(name);
		button.setSize(new Dimension(300, 20));
		button.setBackground(bg);
		button.setForeground(color);
		button.setFont(new Font("Arial", Font.PLAIN, 14));
		button.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);
		button.setFocusPainted(false);
		button.setOpaque(false);
		button.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(button, BorderLayout.CENTER);
		return button;
	}


}
