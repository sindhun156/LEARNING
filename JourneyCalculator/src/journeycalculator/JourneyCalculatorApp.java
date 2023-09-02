package journeycalculator;

import java.util.Scanner;

public class JourneyCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter speed and time");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculator jc=new JourneyCalculator();
		double distance=jc.calculateDistance(speed,time);
		System.out.println(distance);
	}

}
