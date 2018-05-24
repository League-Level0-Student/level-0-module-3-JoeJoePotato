package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {
	static Robot potato = new Robot();

	public static void main(String[] args) {

		potato.penDown();
		potato.miniaturize();
String shape=JOptionPane.showInputDialog("What shape do you want the robot to draw?/n The options are square, circle and triangle.\n No caps please.");
String color=JOptionPane.showInputDialog("What color do you want the robot to draw in?/n The options are red, green and blue.\n No caps please.");
drawCircle();



	}

	static void drawSquare() {

		for (int i = 0; i < 4; i++) {
			potato.move(200);
			potato.turn(90);
		}

	}
	static void drawTriangle() {

		for (int i = 0; i < 3; i++) {
			potato.move(450);
			potato.turn(60);
		}

	}
	static void drawCircle() {

		for (int i = 0; i < 360; i++) {
			potato.move(1);
			potato.turn(1);
		}

	}

	
}
