/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.frc4732.AerialAssist.commands;

/**
 *
 * @author Developer
 */
public class SetSolenoid extends CommandBase {
    
    private boolean state;
    
    public SetSolenoid(boolean state) {
        // Use requires() here to declare subsystem dependencies
        this.state = state;
        requires(pneumatics);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        pneumatics.setSolenoid(state);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if(pneumatics.getSolenoidState() != this.state) {
            pneumatics.setSolenoid(state);
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        pneumatics.setSolenoid(false);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
