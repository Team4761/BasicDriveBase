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

    public void driveMeccanum(double x, double y, double angle) {
		RobotMap.robotDrive.mecanumDrive_Cartesian(x, y, angle, 0);
	}
    
    public void stop() {
    	driveArcade(0, 0);
    }
}

