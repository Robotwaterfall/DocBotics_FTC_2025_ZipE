package org.firstinspires.ftc.teamcode.Subsystem;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class transferSubsystem extends SubsystemBase {

    DcMotor transferMotor;

    public transferSubsystem(DcMotor transferMotor){
        this.transferMotor = transferMotor;

        transferMotor.setDirection(DcMotorSimple.Direction.REVERSE);

    }

    public DcMotor getTransferMotor(){


        return transferMotor;
    }
}