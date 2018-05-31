package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {
	static Robot potato = new Robot();

	public static void main(String[] args) {

		potato.penDown();
		potato.miniaturize();
String shape=JOptionPane.showInputDialog("What shape do you want the robot to draw? The options are square, circle and triangle.\n No caps please.");
String color=JOptionPane.showInputDialog("What color do you want the robot to draw in? The options are red, green and blue.\n No caps please.");

if(color.equals("red")) {
potato.setPenColor(255,0,0);
}else if(color.equals("blue")) {
potato.setPenColor(0,0,255);}
else if(color.equals("green")) {
potato.setPenColor(0,255,0);} else {
potato.setRandomPenColor();}

if(shape.equals("square")) {
drawSquare();
}else if(shape.equals("triangle")) {
drawTriangle();}
else if(shape.equals("circle")) {
drawCircle();} else {
JOptionPane.showMessageDialog(null, "Sorry, that shape is not compatible.");}
	}

	static void drawSquare() {

		for (int i = 0; i < 4; i++) {
			potato.move(200);
			potato.turn(90);
		}

	}
	static void drawTriangle() {

		for (int i = 0; i < 3; i++) {
			potato.move(250);
			potato.turn(120);
		}

	}
	static void drawCircle() {

		for (int i = 0; i < 360; i++) {
			potato.move(1);
			potato.turn(1);
		}

	}

	
}
