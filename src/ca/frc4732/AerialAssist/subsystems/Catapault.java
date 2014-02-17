/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.frc4732.AerialAssist.subsystems;

import ca.frc4732.AerialAssist.RobotMap;
import ca.frc4732.AerialAssist.commands.WindWinch;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author qasim
 */
public class Catapault extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    Victor winchMotor;
    
    public Catapault() {
        winchMotor = new Victor(RobotMap.WINCH_MOTOR);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new WindWinch(false));
    }
    
    public void setMotor(double x) {
        winchMotor.set(-x);
    }
}
