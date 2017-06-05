package org.robockets.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 * @author jake.backer
 */
public class Shoot extends CommandGroup {

	public Shoot() {
		addParallel(new SpinUp(0.5));
		addSequential(new WaitCommand(2));
		addSequential(new ServoGo());
	}
}
