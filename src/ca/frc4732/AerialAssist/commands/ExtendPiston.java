/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.frc4732.AerialAssist.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Developer
 */
public class ExtendPiston extends CommandBase {
    
    private boolean state;
    
    public ExtendPiston(boolean state) {
        // Use requires() here to declare subsystem dependencies
        this.state = state;
        requires(piston);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        piston.setSolenoid(state);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if(piston.getSolenoidState() != this.state) {
            piston.setSolenoid(state);
            SmartDashboard.putBoolean("Piston State", state);
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        piston.setSolenoid(false);
        SmartDashboard.putBoolean("Piston State", false);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
