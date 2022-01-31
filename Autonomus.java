package org.firstinspires.ftc.teamcode;

import android.graphics.Color;
import android.os.Debug;
import android.util.Log;
import com.qualcomm.hardware.rev.RevColorSensorV3;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.SwitchableLight;


import org.firstinspires.ftc.robotcore.internal.android.dex.Code;

import java.io.PrintStream;

@Autonomous(name = "Autonomus", group = "Autonomous")
@Disabled
public class Autonomus extends LinearOpMode
{
    private DcMotor FLMotor;
    private DcMotor FRMotor;
    private DcMotor BLMotor;
    private DcMotor BRMotor;
    private DcMotor DuckMotor;

    @Override
    public void runOpMode() throws InterruptedException
    {
        DuckMotor = hardwareMap.dcMotor.get("DuckMotor"); //motor of duck operation
        FLMotor = hardwareMap.dcMotor.get("FLMotor"); //front left motor
        FRMotor = hardwareMap.dcMotor.get("FRMotor"); //front right motor
        BLMotor = hardwareMap.dcMotor.get("BLMotor"); //back left motor
        BRMotor = hardwareMap.dcMotor.get("BRMotor"); //back right motor

        FLMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        BLMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        FRMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        BRMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        FLMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        FRMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        BLMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        BRMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        FLMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        FRMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        BLMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        BRMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        DriveClass driveClass = new DriveClass(FLMotor, FRMotor, BLMotor, BRMotor);
        int DuckNum = 0;

        waitForStart();
        while (opModeIsActive())
        {
            driveClass.Diagonal(1, 0);
            sleep(1000);
            driveClass.Stop();
            sleep(500);
            driveClass.Diagonal(-1, 0);
            sleep(700);
            driveClass.Stop();
            sleep(500);
            driveClass.DriveOnXAxis(0.5);
            sleep(1350);
            driveClass.Stop();
            driveClass.Turn(-0.5);
            sleep(870);
            driveClass.Stop();

            while (DuckNum < 6){
                DuckMotor.setPower(0.4);
                sleep(2100);
                DuckMotor.setPower(0);
                sleep(1000);
                DuckNum++;
            }

            driveClass.DriveOnXAxis(-0.75);
            sleep(700);
            driveClass.Stop();
            driveClass.DriveForward(-1);
            sleep(185);
            driveClass.Stop();
            driveClass.Turn(-1);
            sleep(75);
            driveClass.Stop();
            break;
        }
    }
}
