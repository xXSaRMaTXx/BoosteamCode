package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "TeleOpCode", group = "TeleOp")
public class TeleOpCode extends LinearOpMode {
//    private DcMotor FLMotor;
//    private DcMotor FRMotor;
//    private DcMotor BLMotor;
//    private DcMotor BRMotor;
//    private DcMotor SukMotor;
//    private DcMotor UpMotor;
    private DcMotor DuckMotor;

    @Override
    public void runOpMode() {
//        FLMotor = hardwareMap.dcMotor.get("FLMotor"); //front left motor
//        FRMotor = hardwareMap.dcMotor.get("FRMotor"); //front right motor
//        BLMotor = hardwareMap.dcMotor.get("BLMotor"); //back left motor
//        BRMotor = hardwareMap.dcMotor.get("BRMotor"); //back right motor
//        SukMotor = hardwareMap.dcMotor.get("SukMotor");
//        UpMotor = hardwareMap.dcMotor.get("UpMotor");
        DuckMotor = hardwareMap.dcMotor.get("DuckMotor");
//
//        FLMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        BLMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        FRMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        BRMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        UpMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        DuckMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        FLMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        FRMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        BLMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        BRMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//        FLMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        FRMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        BLMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        BRMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//
//        DriveClass driveClass = new DriveClass(FLMotor, FRMotor, BLMotor, BRMotor);
//        int DuckTimes = 0;

        waitForStart();
//        int count = 0;
        while (opModeIsActive()) {
//            if (gamepad1.right_trigger > 0)
//            {
//                driveClass.DriveForward(gamepad1.right_trigger);
//            }
//
//            else if (gamepad1.left_trigger > 0)
//            {
//                driveClass.DriveForward(-gamepad1.left_trigger);
//            }
//
//            else if (gamepad1.left_stick_x != 0)
//            {
//                driveClass.Turn(-gamepad1.left_stick_x);
//            }
//
//            else if (gamepad1.right_stick_x != 0)
//            {
//                driveClass.DriveOnXAxis(-gamepad1.right_stick_x);
//            }
//
//            else if (gamepad1.a)
//            {
//                SukMotor.setPower(-0.5);
//            }
//
//            else if (gamepad1.b)
//            {
//                SukMotor.setPower(0.5);
//            }
//
//            else if (gamepad1.right_bumper)
//            {
//                UpMotor.setPower(0.5);
//            }
//
//            else if (gamepad1.left_bumper)
//            {
//                UpMotor.setPower(-0.5);
//            }
//
//            else if (gamepad1.x)
//            {
//                UpMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//                count++;
//                UpMotor.setPower(-0.25);
//                sleep(250);
//
//                if (count == 4)
//                {
//                    UpMotor.setPower(0.25);
//                    sleep(1000);
//                    count = 0;
//                }
//            }

            if (gamepad1.y)
            {
                DuckMotor.setPower(1);
//                while (DuckTimes < 6)
//                {
//                    DuckMotor.setPower(0.4);
//                    sleep(2200);
//                    DuckMotor.setPower(0);
//                    sleep(1000);
//                    DuckTimes++;
//                }
            }

            else
            {
//                driveClass.Stop();
//                UpMotor.setPower(0);
//                SukMotor.setPower(0);
                DuckMotor.setPower(0);
            }
        }
    }
}
