/*Name:Tommy Lee Truong
Last Edit:Apr 7 2018
Program Name: Off The Grid
 */
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Timer ST = new Timer();
		Points p = new Points();
		Scanner key = new Scanner(System.in);
		int in = key.nextInt();
		if (in ==0) {
			ST.start();
		}
		in = key.nextInt();
		if (in == 1) {
			ST.stop();
			ST.reportstudylength();
			p.gains(ST);
		}
		in = key.nextInt();
		if(in==3) {
			p.celebrate();
		}
		key.close();
	}
}
