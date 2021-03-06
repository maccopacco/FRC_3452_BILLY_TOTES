package org.usfirst.frc.team3452.robot.commands.drive;

import edu.wpi.first.wpilibj.command.InstantCommand;
import org.usfirst.frc.team3452.robot.Robot;

public class SetModify extends InstantCommand {
	private double m_modify;

	public SetModify(double value) {
		super();
		m_modify = value;
	}

	protected void initialize() {
		if (m_modify == -1) {
			if (Robot.drive.m_modify == 1) {
				Robot.drive.m_modify = .6;
			} else {
				Robot.drive.m_modify = 1;
			}
		} else {
			Robot.drive.m_modify = m_modify;
		}
	}

}
