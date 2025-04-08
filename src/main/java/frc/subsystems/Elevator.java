package frc.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Elevator extends SubsystemBase{
    private final TalonSRX rightElevator;
    private final TalonSRX leftElevator;

    public Elevator() {
        rightElevator = new TalonSRX(0);
        leftElevator = new TalonSRX(0);
    }

    public void elevatorMove(double speed) {
        leftElevator.set(ControlMode.PercentOutput, speed);
        rightElevator.set(ControlMode.PercentOutput, speed);
    }
}