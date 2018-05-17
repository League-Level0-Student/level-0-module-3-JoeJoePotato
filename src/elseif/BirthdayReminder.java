
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "October 2nd";
		String dadsBirthday = "June 4";
		String myBirthday = "May 19th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String request= JOptionPane.showInputDialog("Whose bithday do you want to know? The option are: graham, mom, and dad.");
		// 3. Print out what the user typed
		System.out.println(request);
		// 4. if user asked for "mom"
			if(request.equals("mom")) {//print mom's birthday
			JOptionPane.showMessageDialog(null, momsBirthday);
			}else if(request.equals("dad")) {// 5. if user asked for "dad"
				JOptionPane.showMessageDialog(null, dadsBirthday);
			}else if(request.equals("graham")) {// print dad's birthday
				JOptionPane.showMessageDialog(null, myBirthday);
			}else{// 6. if user asked for your name
				JOptionPane.showMessageDialog(null, "Sorry, either you typed something wrong \nor you requested a birthday that is not included.");
			}			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
