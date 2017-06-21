package org.robockets.robot.commands;

import org.robockets.robot.OI;
import org.robockets.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import org.robockets.robot.RobotMap;

/**
 * @author Brian Shin
 * Drive command, connects the user input with the robot.
 */
public class DriveGo extends Command {


    public DriveGo() {
        requires(Robot.drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
        /*double x = OI.joystick.getRawAxis(1);
        double y = -OI.joystick.getRawAxis(0);
        double rotate = OI.joystick.getRawAxis(4);*/
        double translate = OI.joystick.getRawAxis(1);
        double rotate = OI.joystick.getRawAxis(4);

        //Robot.drivetrain.driveMeccanum(x, y, rotate);

        Robot.drivetrain.driveArcade(translate, -rotate);
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
