package elseif;

import javax.swing.JOptionPane;

public class areyouhappy {
	public static void main(String[] args) {

		String first = JOptionPane.showInputDialog("Are you happy? Answer yes or no, no caps.");
		if (first.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			System.exit(0);
		} else {
			String second = JOptionPane
					.showInputDialog("Do you want to be happy? Again, answer yes or no with no caps.");
			if (second.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
				System.exit(0);
			} else {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
				System.exit(0);
			}
		}
	}

}
