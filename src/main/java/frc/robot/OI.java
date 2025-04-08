package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class OI {


    public XboxController driveController, manipController;
    private JoystickButton driveLeftTrigger;

    public OI() {
        initControllers();

    }

    /**
     * Initialize JoystickButtons and Controllers
     */
    private void initControllers() {
        driveController = new XboxController(0);
        manipController = new XboxController(1);

        driveLeftTrigger = new JoystickButton(driveController, 0);
    }

    private void configureBindings() {
        //PUT YOUR COMMANDS in here! Default commands go first.  
    }

    // public Command getAutonomousCommand() {
    //     // AUTOS not PATHS in path planner should be called here
    //     return new PathPlannerAuto("AutoName");
    // }

    private double getDriveLeftX() {
        return driveController.getRawAxis(0);
    }
    private double getDriveLeftY() {
        return driveController.getRawAxis(1);
    }
    private double getManipLeftY() {
        return manipController.getRawAxis(1);
    }
}