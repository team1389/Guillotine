package frc.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TankDrive extends SubsystemBase {
    private final TalonSRX rightLead;
    private final TalonSRX rightFollow;
    private final TalonSRX leftLead;
    private final TalonSRX leftFollow;

    public TankDrive() {
        rightLead = new TalonSRX(0);
        rightFollow = new TalonSRX(0);
        leftLead = new TalonSRX(0);
        leftFollow = new TalonSRX(0);
        leftFollow.follow(leftLead);
        rightFollow.follow(rightLead);
    }

    public void drive(double leftSpeed, double rightSpeed) {
        leftLead.set(ControlMode.PercentOutput, leftSpeed);
        rightLead.set(ControlMode.PercentOutput, rightSpeed);
    }
}
