package org.robockets.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static CANSparkMax frontLeftMotorController = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
	public static CANSparkMax backLeftMotorController = new CANSparkMax(2, CANSparkMaxLowLevel.MotorType.kBrushless);
	public static CANSparkMax frontRightMotorController = new CANSparkMax(3, CANSparkMaxLowLevel.MotorType.kBrushless);
	public static CANSparkMax backRightMotorController = new CANSparkMax(4, CANSparkMaxLowLevel.MotorType.kBrushless);

	public static SpeedControllerGroup leftGroup = new SpeedControllerGroup(frontLeftMotorController, backLeftMotorController);
	public static SpeedControllerGroup rightGroup = new SpeedControllerGroup(frontRightMotorController, backRightMotorController);
	//public static PowerDistributionPanel pdp = new PowerDistributionPanel(0);

	public static DifferentialDrive robotDrive = new DifferentialDrive(leftGroup, rightGroup);
}
