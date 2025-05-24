package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Test_scores {

	public static void main(String[] args) {
		String t = JOptionPane.showInputDialog("what is your test score");
		double score = Double.parseDouble(t);
		if(score>100) {
			String q = JOptionPane.showInputDialog("was there extra credit");
			if(q.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "extraordinary job");
			}
			else {
				JOptionPane.showMessageDialog(null, "liarrrrrrrr");
			}
		}
		else if(score>=90) {
			JOptionPane.showMessageDialog(null, "you worked hard, good job");
		}
		else if(score>=75) {
			JOptionPane.showMessageDialog(null, "you got this");
		}
		else if(score>=70) {
			JOptionPane.showMessageDialog(null, "ermmm.....");
		}
		else if(score==69) {
			JOptionPane.showMessageDialog(null, "hrmm, suspicious");
		}
		else if(score>=50) {
			JOptionPane.showMessageDialog(null, "you stink!! l bozo");
		}
		else {
			JOptionPane.showMessageDialog(null, "im dissapointed in you son... how could youuuuuuuu?!?!?!?!\nyou are an insult to society :(");
		}

	}

}
