package org.usfirst.frc.team4761.robot.commands;

import org.robockets.lib.InvalidInputException;
import org.usfirst.frc.team4761.robot.OI;
import org.usfirst.frc.team4761.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * @author Brian Shin
 * Drive command, connects the user input with the robot.
 */
public class DriveGo extends Command {

    double translate;
	double rotate;

    public DriveGo() {
        requires(Robot.drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
        translate = OI.joystick.getRawAxis(1);
        rotate = OI.joystick.getRawAxis(4);

        try {
            Robot.drivetrain.driveArcade(translate, -rotate);
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        try {
            Robot.drivetrain.stop();
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

    protected void interrupted() {
    	end();
    }
}
