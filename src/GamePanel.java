import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.util.Random;

import javax.swing.JPanel;

// Class GamePanel - This class extends JPanel (a Java Swing Library class which provides space)
// Implements ActionListener which listens for actions on the panel like button presses
public class GamePanel extends JPanel implements ActionListener {

	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	static final int UNIT_SIZE = 25; // This is how big the objects in the game will be
	static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE; // How many objects will fit on the screen
	static final int DELAY = 75;

	// Arrays hold all the cordinates for the body parts of the snake
	final int x[] = new int[GAME_UNITS];
	final int y[] = new int[GAME_UNITS];
	int bodyParts = 6;
	int appleX;
	int appleY;
	char direction = 'R'; // The snake will begin by going right
	boolean running = false;
	Timer timer;
	Random random;

// Constructor for the GamePanel class
	GamePanel() {
		random = new Random();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		startGame();

	}

//Method to start the game. This need to be filled with game starting logic

	public void startGame() {
		newApple();
		running = true;
		timer = new Timer(DELAY, this); // Pass in delay value to dictate how fast the game is running
										// We pass in this because we are using action listener interface

	}

	// Overriding paintComponent from JPanel. This method is called every time the
	// JPanel needs to be redrawn.
	// The Graphics object g is the context on which we can draw shapes, lines,
	// images, text etc.

	public void paintComponent(Graphics g) {

		// grids on both x and y axis to make it easier for us to visualize how big
		// objects will be

		for (int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) {
			g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
			g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
		}

		g.setColor(Color.red);
		g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

	}

	// Method for drawing game objects
	// This should be called from gameCompinent method
	public void draw(Graphics g) {

	}

	// This method creates a new apple on the screen every time its called
	public void newApple() {
		appleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
		appleY = random.nextInt((int) (SCREEN_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;

	}

	// Method to handle movement of game objects
	// This should be filled with logic for game objects movements
	public void move() {

	}

	// Method to check if the snake has reached the apple
	// This need to be filled with logic for detecting such event
	public void checkApple() {

	}

//Method to check if the snake has collided with itself or the wall.
	public void checkCollisions() {

	}

	// Method to handle game over events
	// This should be called when the game is over
	public void gameOver(Graphics g) {

	}

	// Inner class: MyKeyAdapter - This class extends KeyAdapter( a class from the
	// Java Swing library that responds to keyboard input)
	public class MyKeyAdapter extends KeyAdapter {
		// This method is triggered when a key is pressed on the keyboard
		// The event e object contains information about the key pressed
		// This method need to be filled with logic to handlekey pressed events

		public void keypressed(KeyEvent e) {

		}

	}

	public void actionPerformed(ActionEvent e) {
		// This method is triggered when an action event occurs
		// It can be triggered by various types of events such as button clicks, timer,
		// etc
		// The action event e object contains information about the action event
		// This method needs to be filled with logic to handle action events
	}

}
