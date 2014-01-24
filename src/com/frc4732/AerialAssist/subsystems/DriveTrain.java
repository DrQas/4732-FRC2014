/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frc4732.AerialAssist.subsystems;

import com.frc4732.AerialAssist.RobotMap;
import com.frc4732.AerialAssist.commands.OperatorDrive;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author qasim
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    Victor leftMotor, rightMotor;
    RobotDrive drive;
    
    public DriveTrain() {
        leftMotor = new Victor(RobotMap.LEFT_MOTOR);
        rightMotor = new Victor(RobotMap.RIGHT_MOTOR);
        drive = new RobotDrive(leftMotor, rightMotor);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new OperatorDrive());
    }
    
    public void arcadeDrive(double moveAxis, double rotateAxis) {
        drive.arcadeDrive(moveAxis, rotateAxis);
    }
   
}
