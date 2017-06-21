package org.robockets.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.robockets.robot.Robot;

/**
 * @author jake.backer
 */
public class ServoGo extends Command {

	double speed = 0;
	double time = 0;

	public ServoGo(double speed, double time) {
		this.speed = speed;
		this.time = time;
	}

	public ServoGo() {
		this(0.75, 0.5);
	}

	protected void initialize() {
		setTimeout(time);
	}

	protected void execute() {
		Robot.shooter.setServo(speed);
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
