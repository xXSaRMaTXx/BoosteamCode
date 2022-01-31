package org.firstinspires.ftc.teamcode;

import android.graphics.Color;
import android.util.Log;
import com.qualcomm.hardware.rev.RevColorSensorV3;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.SwitchableLight;

import org.firstinspires.ftc.robotcore.external.Telemetry;

import java.io.PrintStream;
import java.sql.Time;

public class DriveClass
{
    private final DcMotor FLMotor;
    private final DcMotor FRMotor;
    private final DcMotor BLMotor;
    private final DcMotor BRMotor;

    //Drive Class
    public DriveClass(DcMotor FL, DcMotor FR, DcMotor BL, DcMotor BR)
    {
        FLMotor = FL;
        FRMotor = FR;
        BLMotor = BL;
        BRMotor = BR;
    }

    //drive forward of backward based on the power given
    public void DriveForward(double power)
    {
        //left is reversed so the value is -x
        FLMotor.setPower(-power);
        FRMotor.setPower(power);
        BLMotor.setPower(-power);
        BRMotor.setPower(power);
    }

    //drive on X Axis like hover left or right based on power given
    public void DriveOnXAxis(double power)
    {
        FLMotor.setPower(-power);
        FRMotor.setPower(-power);
        BLMotor.setPower(power);
        BRMotor.setPower(power);
    }

    public void Diagonal(double Power, double ZeroPower)
    {
        FLMotor.setPower(Power);
        FRMotor.setPower(ZeroPower);
        BLMotor.setPower(ZeroPower);
        BRMotor.setPower(Power);
    }

    //turn to left or right based on power given
    public void Turn(double power)
    {
        FLMotor.setPower(-power);
        FRMotor.setPower(-power);
        BLMotor.setPower(-power);
        BRMotor.setPower(-power);
    }

    //stop all motors, reset all speeds
    public void Stop()
    {
        FLMotor.setPower(0);
        FRMotor.setPower(0);
        BLMotor.setPower(0);
        BRMotor.setPower(0);
    }
}
