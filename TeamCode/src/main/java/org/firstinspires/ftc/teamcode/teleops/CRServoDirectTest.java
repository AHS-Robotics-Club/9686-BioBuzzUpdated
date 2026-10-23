package org.firstinspires.ftc.teamcode.teleops;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;

@TeleOp(name = "CRServo Direct Test")
public class CRServoDirectTest extends LinearOpMode {

    @Override
    public void runOpMode() {
        CRServo servo = hardwareMap.get(CRServo.class, "t1");

        telemetry.addLine("Initialized");
        telemetry.update();

        waitForStart();

        while (opModeIsActive()) {
            if (gamepad1.a) {
                servo.setPower(1.0);
            } else if (gamepad1.x) {
                servo.setPower(-1.0);
            } else {
                servo.setPower(0.0);
            }

            telemetry.addData("Power", servo.getPower());
            telemetry.update();
        }

        servo.setPower(0);
    }
}