import javax.swing.JFrame;

//Class GameFrame - This class extends JFrame (a class from the Java Swing library that creates a window).
public class GameFrame extends JFrame {

	// Constructor for the GameFrame class
	GameFrame() {

		// Create an instance of the GamePanel class which will be the main panel of the
		// game.
		GamePanel panel = new GamePanel();

		// Add the GamePanel instance to the JFrame
		this.add(panel);

		// Set the title of the window to "Snake"
		this.setTitle("Snake");

		// Ensure the application exits when this window is closed
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Makes the window non-resisable
		this.setResizable(false);

		// Assemble all the parts of the JFrame
		// This is needed because the actual components have been added after setting
		// the size
		this.pack();

		// Makes the window visible
		this.setVisible(true);

		// Position the window in the centre of the screen
		this.setLocationRelativeTo(null);

	}

}
