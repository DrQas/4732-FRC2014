package ca.frc4732.AerialAssist.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import ca.frc4732.AerialAssist.OI;
import ca.frc4732.AerialAssist.subsystems.Catapault;
import ca.frc4732.AerialAssist.subsystems.DriveTrain;
import ca.frc4732.AerialAssist.subsystems.Pneumatics;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    public static DriveTrain driveTrain = new DriveTrain();
    public static Pneumatics pneumatics = new Pneumatics();
    public static Catapault catapault = new Catapault();

    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();
        
        oi.driveControllerX.toggleWhenPressed(new SetSolenoid(true));
        
        oi.driveControllerSelect.toggleWhenPressed(new SetCompressor(true));
        
        oi.driveControllerStart.toggleWhenPressed(new WindWinch(true));

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(driveTrain);
        SmartDashboard.putData(pneumatics);
        SmartDashboard.putData(catapault);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
