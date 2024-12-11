package frc.robot.Subsystems;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class MotorSubsystem extends SubsystemBase {
    MotorSubsystem s_Subsystem;
    SparkMax m_motor;
    
    public MotorSubsystem() {
        m_motor = new SparkMax(Constants.MotorConstants.k_MotorID, MotorType.kBrushless);

        s_Subsystem = this;
    }

    @Override
    public void periodic() {
        m_motor.set(0.5);

        super.periodic();
    }

    public MotorSubsystem getMotorSubsystem() {
        return s_Subsystem;
    }
}
