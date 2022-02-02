import javax.swing.JFrame;

public class GameFrame extends JFrame {

	GameFrame() {

		GamePanel panel = new GamePanel();

		this.add(panel);
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		this.pack();

	}

}
