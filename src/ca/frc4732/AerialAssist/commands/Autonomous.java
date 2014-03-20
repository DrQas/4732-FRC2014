/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.frc4732.AerialAssist.commands;

import ca.frc4732.AerialAssist.RobotMap;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author qasim
 */
public class Autonomous extends CommandGroup {
    
    public Autonomous() {
        this.addParallel(new WindWinch(true));
        this.addSequential(new AutoDrive(RobotMap.DIRECTION.LEFT, 0.25), 3);
        this.addSequential(new AutoDrive(RobotMap.DIRECTION.LEFT, 0.25), 2);
    }
}
