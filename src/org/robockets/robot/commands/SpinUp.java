package org.robockets.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.robockets.robot.Robot;

/**
 * @author Jake Backer
 */
public class SpinUp extends Command {

	private double speed = 0;

	public SpinUp(double speed) {
		this.speed = speed;
	}

	public SpinUp() {
		this(1);
	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.shooter.setSpeed(speed);
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.shooter.stop();
	}

	protected void interrupted() {
		end();
	}
}
