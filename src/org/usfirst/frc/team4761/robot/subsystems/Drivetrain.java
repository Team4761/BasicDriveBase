package org.usfirst.frc.team4761.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.robockets.lib.AdaGyro;
import org.robockets.lib.InvalidInputException;
import org.usfirst.frc.team4761.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * A Subsystem for controlling the drivetrain
 * @author Jake Backer and Brian Shin
 */
public class Drivetrain extends Subsystem {

    // How is this going to work with the gyro? Code copied from 2016 robot code will not work
    // private PIDController controller = new PIDController(0,0,0,);

    private AdaGyro gyro;

    public Drivetrain() {
        // Setup gyro
        gyro = new AdaGyro(0x6B);
        gyro.autoSetup();

    }

    public void initDefaultCommand() {

    }
    
    public void driveArcade(double leftValue, double rightValue) throws InvalidInputException{
        //System.out.print("X: " + gyro.readX());
        //System.out.print("   Y: " + gyro.readY());
        //System.out.println("   Z: " + gyro.readZ());

        //System.out.println(gyro.customRead(0x0F)[0] & 0xFF);

        int x = ((int) gyro.readX()) & 0xFF;
        int y = (int) gyro.readY();
        int z = (int) gyro.readZ();

        System.out.println("X: " + x + " Y: " + y + " Z: " + z);

        SmartDashboard.putNumber("GyroX", x);
        SmartDashboard.putNumber("GyroY", y);
        SmartDashboard.putNumber("GyroZ", z);

    	//RobotMap.robotDrive.arcadeDrive(-leftValue, rightValue);
    }

    // This needs PID
    public void driveStraight(double leftValue, double rightValue) {
        boolean isStraight;

    }
    
    public void stop() throws InvalidInputException{
    	driveArcade(0, 0);
    }
}

