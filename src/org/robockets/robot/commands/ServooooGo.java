package org.robockets.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * @author Jake Backer
 */
public class ServooooGo extends CommandGroup {

	public ServooooGo() {
		addSequential(new ServoGo(0.75, 0.25));
		addSequential(new ServoGo(-0.75, 0.63));
	}
}
