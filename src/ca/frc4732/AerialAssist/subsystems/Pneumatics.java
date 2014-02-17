/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.frc4732.AerialAssist.subsystems;

import ca.frc4732.AerialAssist.RobotMap;
import ca.frc4732.AerialAssist.commands.SetCompressor;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author qasim
 */
public class Pneumatics extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    Compressor compressor;
    Solenoid s1;
    Solenoid s2;
    
    public Pneumatics() {
        compressor = new Compressor(
                RobotMap.COMPRESSOR.DIGITAL_IO, RobotMap.COMPRESSOR.RELAY);
        s1 = new Solenoid(1);
        s2 = new Solenoid(2);
        
        this.setSolenoid(true);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new SetCompressor(false));
    }
    
    public void setSolenoid(boolean state) {
        s1.set(state);
        s2.set(!state);
    }
    
    public boolean getSolenoidState() {
        return s1.get();
    }
    
    public void startCompressor() {
        compressor.start();
    }
    
    public void stopCompressor() {
        compressor.stop();
    }
    
    public boolean getCompressorStatus() {
        return compressor.enabled();
    }
    
    public boolean getPressureSwitchValue() {
        return compressor.getPressureSwitchValue();
    }
}
