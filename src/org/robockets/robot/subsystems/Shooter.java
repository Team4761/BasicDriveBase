package org.robockets.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.robockets.robot.RobotMap;

/**
 * @author jake.backer
 */
public class Shooter extends Subsystem {

	public Shooter() {

	}

	public void initDefaultCommand() {

	}

	public void setServo(double speed) {
		RobotMap.flapperServo.set(speed); // This may change depending on the servo
	}

	public void setSpeed(double speed) {
		RobotMap.shooterTop.set(speed);
		RobotMap.shooterBottom.set(speed);
	}

	public void stop() {
		RobotMap.shooterTop.stopMotor();
		RobotMap.shooterBottom.stopMotor();
	}
}

