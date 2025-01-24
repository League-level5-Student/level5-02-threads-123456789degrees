package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	
	public static void main(String[] args) {
		Robot r1 = new Robot(500, 500);
		Robot r2 = new Robot(800, 500);
		Robot r3 = new Robot(1100, 500);
		Robot r4 = new Robot(650, 700);
		Robot r5 = new Robot(950, 700);
		r1.penDown();
		r2.penDown();
		r3.penDown();
		r4.penDown();
		r5.penDown();
		r1.setSpeed(10);
		r2.setSpeed(10);
		r3.setSpeed(10);
		r4.setSpeed(10);
		r5.setSpeed(10);
		Thread m1 = new Thread(()-> {
			for (int i = 0; i < 360; i++) {
				r1.move(3);
				r1.turn(1);
			}
			
		});
		Thread m2 = new Thread(()-> {
			for (int i = 0; i < 360; i++) {
				r2.move(3);
				r2.turn(1);
			}
		});
		Thread m3 = new Thread(()-> {
			for (int i = 0; i < 360; i++) {
				r3.move(3);
				r3.turn(1);
			}
		});
		Thread m4 = new Thread(()-> {
			for (int i = 0; i < 360; i++) {
				r4.move(3);
				r4.turn(1);
			}
		});
		Thread m5 = new Thread(()-> {
			for (int i = 0; i < 360; i++) {
				r5.move(3);
				r5.turn(1);
			}
		});
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
	}
	
}

