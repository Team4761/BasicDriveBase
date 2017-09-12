package org.robockets.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.robockets.robot.Robot;

/**
 * @author Jake Backer
 */
public class GoBack extends Command {

	public GoBack() {

	}

	protected void initialize() {
		setTimeout(0.75);
	}

	protected void execute() {
		Robot.drivetrain.driveTank(-.25, -0.5);
	}

	protected boolean isFinished() {
		return isTimedOut();
	}

	protected void end() {
		Robot.drivetrain.stop();
	}

	protected void interrupted() {
		end();
	}
}
