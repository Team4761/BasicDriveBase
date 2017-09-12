package org.robockets.robot.subsystems;

import org.robockets.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * A Subsystem for controlling the drivetrain
 * @author Jake Backer and Brian Shin
 */
public class Drivetrain extends Subsystem {


    public void initDefaultCommand() {
    	
    }
    
    public void driveArcade(double leftValue, double rightValue) {
    	RobotMap.robotDrive.arcadeDrive(-leftValue, rightValue);
    }

    public void driveTank(double leftValue, double rightValue) {
    	RobotMap.robotDrive.tankDrive(leftValue, rightValue);
	}

	/**
	 * Get the distance the distance sensor returns
	 * @return The distance in centimeters
	 */
	public double getDistance() {
    	return RobotMap.distanceSensor.getVoltage(); // Need some math here
	}
    
    public void stop() {
    	driveArcade(0, 0);
    }
}

