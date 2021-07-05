package Pr1;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lotto extends JFrame {
	public Lotto() {
		JPanel pnl = new JPanel();
		ImageIcon icon = new ImageIcon("images/Logo.png"); // 로고
		JLabel lbl = new JLabel(icon);

		pnl.add(lbl);
		add(pnl);
		pnl.setBackground(Color.WHITE); // 배경 흰색
		
		showGUI();
	}

	private void showGUI() {
		setTitle("  로또번호 생성기");
		setSize(500, 1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Lotto();
	}

}
