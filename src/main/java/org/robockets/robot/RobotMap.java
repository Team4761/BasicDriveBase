package org.robockets.robot;

import edu.wpi.first.wpilibj.*;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static Spark frontLeft = new Spark(0);
	public static Spark backLeft = new Spark(1);
	public static Spark frontRight = new Spark(2);
	public static Spark backRight = new Spark(3);
	
	public static RobotDrive robotDrive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
}
