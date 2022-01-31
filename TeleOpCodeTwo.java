package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "TeleOpCodeTwo", group = "TeleOp")
public class TeleOpCodeTwo extends LinearOpMode {
    private DcMotor SukMotor;

    @Override
    public void runOpMode() {
        SukMotor = hardwareMap.dcMotor.get("SukMotor");
        SukMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        waitForStart();
        while (opModeIsActive())
        {
            if (gamepad1.x)
            {
                SukMotor.setPower(1);
            }

            else
            {
                SukMotor.setPower(0);
            }
        }
    }
}
