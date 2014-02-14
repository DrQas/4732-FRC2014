/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.frc4732.AerialAssist.commands;

/**
 *
 * @author qasim
 */

public class AutoDrive extends CommandBase {
    
    int direction;
    double motorSpeed;
    int duration;
    
    public AutoDrive(int direction, int duration, double motorSpeed) {
        //Set local variables
        this.direction = direction;
        this.motorSpeed = motorSpeed;
        this.duration = duration;
        
        // Use requires() here to declare subsystem dependencies
        requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
