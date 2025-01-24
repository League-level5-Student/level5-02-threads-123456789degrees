package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	static int min = 500;
	public static void main (String[] args) {
		new AdvancedRobotRace().run();
	}
	
	Robot[] robots = new Robot[5];
	public  void run() {
		
		for (int i = 0; i < 5; i++) {
			robots[i] = new Robot();
			robots[i].setX(200 + i * 100);
			robots[i].setY(500);
		}
		
		Thread m1 = new Thread(()-> {
			this.moveRandom(robots[0]);
		});
		Thread m2 = new Thread(()-> {
			this.moveRandom(robots[1]);
		});
		Thread m3 = new Thread(()-> {
			this.moveRandom(robots[2]);
		});
		Thread m4 = new Thread(()-> {
			this.moveRandom(robots[3]);
		});
		Thread m5 = new Thread(()-> {
			this.moveRandom(robots[4]);
		});
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
	}
	public void moveRandom(Robot robot) {
		Random random = new Random();
		while (robot.getY() > 50) {
			robot.setSpeed(new Random().nextInt(1, 10));
			int rand = random.nextInt(24);
			robot.move(rand);
		}
		System.out.println(robot + " crossed the finish line!");
	}
}
