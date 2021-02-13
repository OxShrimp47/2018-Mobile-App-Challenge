/*Name:Tommy Lee Truong
Last Edit:Apr 7 2018
Program Name: Off The Grid
 */
public class Points {
	public int score = 0;
	public  void gains(Timer x) {
		score = score + (int)x.getmin(x.duration);
	}
	public void celebrate() {
		if (score >= 10) {
			score= score-10;
			System.out.println("GLHF");
		}
		else {
			System.out.println("Insufficient Funds");
		}
	}
	
}
