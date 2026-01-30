package org.firstinspires.ftc.teamcode.Command;

import com.arcrobotics.ftclib.command.CommandBase;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Constants;
import org.firstinspires.ftc.teamcode.Subsystem.transferSubsystem;

public class teleOpTransferCommand extends CommandBase {

    transferSubsystem transferSubsystem;
    DcMotor transferMotor;

    public teleOpTransferCommand(transferSubsystem transferSubsystem){
        this.transferSubsystem = transferSubsystem;
        this.transferMotor = transferSubsystem.getTransferMotor();
        addRequirements(transferSubsystem);

    }

    @Override
    public void initialize() {
        transferMotor.setPower(0);

    }

    @Override
    public void execute() {

        transferMotor.setPower(Constants.transferConstants.transferMotorPower);

    }

    @Override
    public void end(boolean interrupted) {
        transferMotor.setPower(0);

    }

}