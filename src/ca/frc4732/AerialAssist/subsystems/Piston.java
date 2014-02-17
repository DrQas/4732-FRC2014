/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.frc4732.AerialAssist.subsystems;

import ca.frc4732.AerialAssist.commands.SetSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author qasim
 */

public class Piston extends Subsystem {
    
    Solenoid s1;
    Solenoid s2;
    
    public Piston() {
        s1 = new Solenoid(1);
        s2 = new Solenoid(2);
    }

    public void setSolenoid(boolean state) {
        s1.set(state);
        s2.set(!state);
    }
    
    public boolean getSolenoidState() {
        return s1.get();
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new SetSolenoid(false));
    }
}
