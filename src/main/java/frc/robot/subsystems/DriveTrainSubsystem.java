package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Utils.Constants;
import frc.robot.Utils.Constants.Ports;

public class DriveTrainSubsystem extends SubsystemBase {
    //All drivetrain motor controllers declared
    private TalonSRX rMaster = new TalonSRX(Ports.rMaster);
    private TalonSRX rSlaveOne = new TalonSRX(Ports.rSlaveOne);
    private TalonSRX rSlaveTwo = new TalonSRX(Ports.rSlaveTwo);
    private TalonSRX lMaster = new TalonSRX(Ports.lMaster);
    private TalonSRX lSlaveOne = new TalonSRX(Ports.lSlaveOne);
    private TalonSRX lSlaveTwo = new TalonSRX(Ports.lSlaveTwo);


    public DriveTrainSubsystem() {
        //
        rSlaveOne.follow(rMaster);
        rSlaveTwo.follow(rMaster);
        lSlaveOne.follow(lMaster);
        lSlaveTwo.follow(lMaster);
    }

}
