package org.robockets.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.robockets.robot.Robot;

/**
 * @author Jake Backer
 */
public class GoForward extends Command {

	public GoForward() {

	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.drivetrain.driveTank(0.25, 0.25);
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.drivetrain.stop();
	}

	protected void interrupted() {
		end();
	}
}
