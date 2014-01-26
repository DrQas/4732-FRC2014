package com.frc4732.AerialAssist;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static final int LEFT_MOTOR = 1;
    public static final int RIGHT_MOTOR = 2;
    
    public static final int DRIVE_CONTROLLER = 1;
    public static final int ALT_CONTROLLER = 2;
    
    class XBOX_CONTROLLER {
        public static final int LEFT_STICK_X = 1;
        public static final int LEFT_STICK_Y = 2;
        public static final int LEFT_STICK_BUTTON = 9;
         
       public static final int D_PAD_X = 6;
        
        public static final int SELECT = 7;
        public static final int START = 8;
        
        public static final int RIGHT_STICK_X = 4;
        public static final int RIGHT_STICK_Y = 5;
        public static final int RIGHT_STICK_BUTTON = 10;
        
        public static final int X = 3;
        public static final int Y = 4;
        public static final int B = 2;
        public static final int A = 1;
        
        public static final int L_BUTTON = 5;
        public static final int R_BUTTON = 6;
        
        public static final int TRIGGER_AXIS = 3;
    }
}
