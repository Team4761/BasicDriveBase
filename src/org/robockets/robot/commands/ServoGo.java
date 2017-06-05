package org.robockets.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.robockets.robot.Robot;

/**
 * @author jake.backer
 */
public class ServoGo extends Command {

	public ServoGo() {

	}

	protected void initialize() {
		Robot.shooter.setServo(45);
		setTimeout(0.5);
	}

	protected void execute() {
	}

	protected boolean isFinished() {
		return isTimedOut();
	}

	protected void end() {
		Robot.shooter.setServo(0);
	}

	protected void interrupted() {
		end();
	}
}
