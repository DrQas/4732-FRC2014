/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.frc4732.AerialAssist.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author qasim
 */
public class SetCompressor extends CommandBase {
    
    private boolean status;
    
    public SetCompressor(boolean status) {
        this.status = status;
        // Use requires() here to declare subsystem dependencies
        requires(pneumatics);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        if(status) {
            pneumatics.startCompressor();
        } else {
            pneumatics.stopCompressor();
        }
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if(status) {
            pneumatics.startCompressor();
        } else {
            pneumatics.stopCompressor();
        }
        SmartDashboard.putBoolean("Compressor", pneumatics.getCompressorStatus());
        SmartDashboard.putBoolean("Pressure Switch", pneumatics.getPressureSwitchValue());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        //pneumatics.stopCompressor();
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        pneumatics.stopCompressor();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
