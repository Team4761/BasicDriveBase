package org.robockets.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 * @author jake.backer
 */
public class Shoot extends CommandGroup {

	public Shoot() {
		addParallel(new SpinUp(1, 2.75));
		addSequential(new WaitCommand(2));
		addSequential(new ServooooGo());
	}
}
