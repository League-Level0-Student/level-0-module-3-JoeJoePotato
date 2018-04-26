//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot r2d2= new Robot();
		r2d2.penDown();
		r2d2.setSpeed(16);
		for(int i=0;i<6;i++) {
		//3. Ask the user what color they would like the robot to draw
		String answer=JOptionPane.showInputDialog("What color would you like the robot to draw?"+"\n"+"The options are red, blue, and green. No caps.");
		//5. Use an if/else statement to set the pen color that the user requested
if(answer.equals("red")) {
r2d2.setPenColor(255,0,0);
}else if(answer.equals("green")) {
	r2d2.setPenColor(0,255,0);
}else if(answer.equals("blue")) {
	r2d2.setPenColor(0,0,255);
}else {
	Random gen = new Random();
	int number = gen.nextInt(3);
	if(number==0) {
		r2d2.setPenColor(255,0,0);
		}else if(number==1) {
			r2d2.setPenColor(0,255,0);
		}else if(number==2) {
			r2d2.setPenColor(0,0,255);
		}
}
for(int j=0;j<6;j++) {
r2d2.setPenWidth(10);
r2d2.move(60);
r2d2.turn(60);}
r2d2.turn(160);
        //6. If the user doesn’t enter anything, choose a random color
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
	r2d2.sparkle();	
		//4. Set the pen width to 10
		JOptionPane.showMessageDialog(null, "Ta Da!");
	    //2. Make the robot draw a shape (this will take more than one line of code)


		}
}
