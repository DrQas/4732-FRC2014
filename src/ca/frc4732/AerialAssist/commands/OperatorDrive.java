/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.frc4732.AerialAssist.commands;

import ca.frc4732.AerialAssist.RobotMap;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author qasim
 */
public class OperatorDrive extends CommandBase {
    
    public OperatorDrive() {
        // Use requires() here to declare subsystem dependencies
        requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        double moveAxis = oi.getMoveAxis(), rotateAxis = oi.getRotateAxis();
        
        if(Math.abs(moveAxis) >= 0.02 || Math.abs(rotateAxis) >= 0.02) {
        
            if(!oi.isHeld(RobotMap.XBOX_CONTROLLER.LEFT_STICK_BUTTON)) {
                moveAxis *= 0.75;
            }
            
            if(!oi.isHeld(RobotMap.XBOX_CONTROLLER.RIGHT_STICK_BUTTON)) {
                rotateAxis *= 0.75;
            }
            
            if(oi.isHeld(RobotMap.XBOX_CONTROLLER.L_BUTTON)) {
                moveAxis *= -1;
                moveAxis *= 0.5;
                rotateAxis *= 0.6;
            }

            driveTrain.arcadeDrive((Math.abs(moveAxis) >= 0.02) ? moveAxis : 0, 
                    (Math.abs(rotateAxis) >= 0.02) ? rotateAxis : 0);
            
        }
        
        SmartDashboard.putNumber("Move Axis", moveAxis);
        SmartDashboard.putNumber("Rotate Axis", rotateAxis);
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
        end();
    }
}
