package elseif;

import javax.swing.JOptionPane;

public class horoscope {
	public static void main(String[] args) {
		String sign = JOptionPane.showInputDialog("What is your zodiac sign? Please, no caps.");
		if (sign.equals("aries")) {
			JOptionPane.showMessageDialog(null,
					"Keeping balance isnt easy today and youll need to locate tensions to be able to give attention.\n"
							+ "\n"
							+ "Its going to be difficult for you to maintain balance in your life today, as your energy shifts between your work and your home life, "
							+ "\n"
							+ "each shift leaving the other area empty of attention. Your energy isnt the problem, its finding clarity and knowing how to keep both sides equal. Find where the tension is in each area and work on this first, youll lighten your load.");
		} else if (sign.equals("taurus")) {
			JOptionPane.showMessageDialog(null,
					"As The Sun ends its time in opposition with Jupiter today, ask questions before signing something."
							+ "\n"
							+ "The Sun in Taurus ends its time in opposition with Jupiter today, bringing something youve been working on or planning to its conclusion. "
							+ "\n"
							+ "This will mean you signing something or agreeing to something, and you need to make sure you understand it all before you put your name to it. If you are unsure, speak up and ask the question, its better to know now than later.");
		} else if (sign.equals("gemini")) {
			JOptionPane.showMessageDialog(null,
					"Direct your need for adventure into home based activities and dont risk your relationship."
							+ "Your creative energy is high today and this could lead you to want some escapism or some adventure."
							+ "\n"
							+ "Be careful where you direct this energy, especially if it could impact your relationship. It may be better to stay home today and find your escapism in books, movies or games. A risky adventure just isnt worth where it could lead, so live a quieter life right now");
		} else if (sign.equals("cancer")) {
			JOptionPane.showMessageDialog(null,
					"Start a new activity today and have fun with it, but make sure you understand it first."
							+ "Its the right day to stay something new today, especially new activities youve never tried before."
							+ "\n"
							+ "Dont just rush into this, no matter how excited you are, take your time and plan things out properly. You can still have a lot of fun doing this while covering your bases and making sure you understand everything there is to know about this activity.");
		} else if (sign.equals("leo")) {
			JOptionPane.showMessageDialog(null,
					"Dont rise to anyones bait today and dont get involved in their drama, you are better than this."
							+ "No matter how much someone goads you or pushes your buttons today, dont get involved in petty arguments as they will only waste your energy. Let the ones who prod\n you with a stick take their drama somewhere else, make it clear that you wont rise to their bait. You can laugh about the pettiness of their attempts "+"\n"+"and get on with your own day in peace");
		}else if (sign.equals("virgo")) {
			JOptionPane.showMessageDialog(null,
					"Dont put up with someone who tries to knock you down, you deserve to be lifted in your relationships.\n" + 
					"\n" + 
					"In all of your relationships in your life, but especially in your closest relationship, you\n deserve to be lifted up not trodden down. Remember this when meeting new people or looking for love, but also when considering your existing connections. A person who tries to knock you down isnt someone you want in your life, so get tough with this and move on.");
		}else {
		JOptionPane.showMessageDialog(null,"If you are seeing this message one of three things happened:\n You entered a non sign\n You entered your sign wrong\n or you are in the last 6 signs which I was to lazy to add.");
		}}
}