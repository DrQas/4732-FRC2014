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
public class UnwindWinch extends CommandBase {
    
    private boolean status;
    
    public UnwindWinch(boolean status) {
        this.status = status;
        // Use requires() here to declare subsystem dependencies
        requires(catapault);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        if(status) {
            catapault.setMotor(-1.0);
            SmartDashboard.putNumber("Winch Motor", 1.0);
        } else {
            catapault.setMotor(0.0);
            SmartDashboard.putNumber("Winch Motor", 0.0);
        }
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if(status) {
            catapault.setMotor(-1.0);
            SmartDashboard.putNumber("Winch Motor", 1.0);
        } else {
            catapault.setMotor(0.0);
            SmartDashboard.putNumber("Winch Motor", 0.0);
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        catapault.setMotor(0.0);
        SmartDashboard.putNumber("Winch motor", 0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
