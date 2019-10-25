package cgi.stem.maze;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/*
 *  Reference -: https://www.birdbraintechnologies.com/finch/curriculum/java/
 *  Challenge is to solve the maze
 *  We will keep two version of same maze. 
 *  1st maze without any complexity and 2nd same maze with some level of complexity.
 * 
 */

public class CGI_STEM_MAZE {

	public static void main(String[] args) {
		
		  // Instantiating the Finch object
	      Finch myFinch = new Finch();

	      myFinch.setWheelVelocities(100,100);
	      myFinch.setLED(0, 0, 255, 1400);

	      myFinch.sleep(1000);


	      myFinch.setWheelVelocities(-60,60);
	      myFinch.setLED(0,255,0, 1425);

	      myFinch.sleep(1000);

		myFinch.setWheelVelocities(100,100);
		myFinch.setLED(0,0,255,3800);

		myFinch.sleep(1000);

		myFinch.setWheelVelocities(60,-60);
		myFinch.setLED(255,0,0, 1425);

		myFinch.sleep(1000);

		myFinch.setWheelVelocities(100,100);
		myFinch.setLED(0,0,255,1600);

		myFinch.sleep(1000);

		myFinch.setWheelVelocities(60,-60);
		myFinch.setLED(255,0,0, 1425);

		myFinch.sleep(1000);

		myFinch.setWheelVelocities(100,100);
		myFinch.setLED(0,0,255,3600);

		myFinch.sleep(1000);

		myFinch.setWheelVelocities(-60,60);
		myFinch.setLED(0,255,0, 1425);

		myFinch.sleep(1000);

		myFinch.setWheelVelocities(100,100);
		myFinch.setLED(0,0,255,3600);

		myFinch.sleep(1000);

		myFinch.setWheelVelocities(-60,60);
		myFinch.setLED(0,255,0, 1425);

		myFinch.sleep(1000);

		myFinch.setWheelVelocities(100,100);
		myFinch.setLED(0,0,255,3600);

		myFinch.sleep(1000);

		myFinch.setWheelVelocities(60,-60);
		myFinch.setLED(255,0,0, 1425);

		myFinch.sleep(1000);

		myFinch.setWheelVelocities(100,100);
		myFinch.setLED(0,0,255,1600);

		myFinch.sleep(1000);

		myFinch.setWheelVelocities(60,-60);
		myFinch.setLED(255,0,0, 1425);

		myFinch.sleep(1000);

		myFinch.setWheelVelocities(100,100);
		myFinch.setLED(0,0,255,5200);

		myFinch.sleep(1000);

		myFinch.setWheelVelocities(-60,60);
		myFinch.setLED(0,255,0, 1425);

		myFinch.sleep(1000);

		myFinch.setWheelVelocities(100,100);
		myFinch.setLED(0,0,255,5200);

		myFinch.sleep(1000);

		myFinch.setWheelVelocities(-60,60, 5000);

		myFinch.buzz(5000, 5000);

		myFinch.saySomething("I made it!");

	      myFinch.quit();
	      System.exit(0);
	}

}
