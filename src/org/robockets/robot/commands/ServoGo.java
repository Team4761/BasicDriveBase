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
		setTimeout(0.1);
	}

	protected void execute() {
		Robot.shooter.setServo(0.6);
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
