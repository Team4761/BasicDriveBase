package org.robockets.robot.subsystems;

import org.robockets.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * A Subsystem for controlling the drivetrain
 * @author Jake Backer and Brian Shin
 */
public class Drivetrain extends Subsystem {

	public static final double DEFAULT_SPEED = 0.75;

    public void initDefaultCommand() {
    	
    }
    
    public void driveArcade(double leftValue, double rightValue) {
    	RobotMap.robotDrive.arcadeDrive(-leftValue, rightValue);
    }

    @Deprecated
    public void driveMeccanum(double x, double y, double angle) {
		//RobotMap.robotDrive.mecanumDrive_Cartesian(x, y, angle, 0);
		RobotMap.robotDrive.mecanumDrive_Polar(x, y, angle);
	}
    
    public void stop() {
    	driveArcade(0, 0);
    }
}

