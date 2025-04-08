package frc.command;

import edu.wpi.first.wpilibj2.command.Command;
import frc.subsystems.TankDrive;

public class Drive extends Command {
    private TankDrive tankDrive;

    public Drive(TankDrive tank) {
        this.tankDrive = tank;
    }
}
