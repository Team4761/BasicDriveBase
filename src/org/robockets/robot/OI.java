package org.robockets.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.robockets.robot.commands.ServoGo;
import org.robockets.robot.commands.Shoot;
import org.robockets.robot.commands.SpinUp;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Joystick joystick = new Joystick(0);

	private static JoystickButton rightBumper = new JoystickButton(joystick, 5);
	private static JoystickButton leftBumper = new JoystickButton(joystick, 4);
	private static JoystickButton aButton = new JoystickButton(joystick, 0);

	public OI() {
		leftBumper.whileHeld(new SpinUp(0.5));
		rightBumper.whenPressed(new ServoGo());
		aButton.whenPressed(new Shoot());
	}
}
