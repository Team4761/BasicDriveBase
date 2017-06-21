package org.robockets.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.robockets.robot.Robot;

/**
 * @author Jake Backer
 */
public class SpinUp extends Command {

	private double speed = 0;
	private double timeout = 0;

	private boolean isTimed = false;

	public SpinUp(double speed, double timeout) {
		this.speed = speed;
		this.timeout = timeout;
		isTimed = true;
	}

	public SpinUp(double speed) {
		this.speed = speed;
	}

	protected void initialize() {
		if (isTimed) {
			setTimeout(timeout);
		}
	}

	protected void execute() {
		Robot.shooter.setSpeed(-speed);
	}

	protected boolean isFinished() {
		return isTimed && isTimedOut();
	}

	protected void end() {
		Robot.shooter.stop();
	}

	protected void interrupted() {
		end();
	}
}
