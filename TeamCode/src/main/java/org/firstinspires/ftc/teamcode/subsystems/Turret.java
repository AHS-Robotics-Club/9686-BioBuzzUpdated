//package org.firstinspires.ftc.teamcode.subsystems;
//
//import com.qualcomm.robotcore.hardware.HardwareMap;
//import com.seattlesolvers.solverslib.command.SubsystemBase;
//import com.seattlesolvers.solverslib.hardware.motors.CRServoEx;
//import com.seattlesolvers.solverslib.hardware.motors.CRServoGroup;
//import com.seattlesolvers.solverslib.hardware.servos.ServoEx;
//import com.seattlesolvers.solverslib.hardware.servos.ServoExGroup;
//
//public class Turret extends SubsystemBase {
//    private final CRServoGroup turret;
//
//    public Turret(HardwareMap hw){
//        CRServoEx left = new CRServoEx(hw, "t1");
//        CRServoEx right = new CRServoEx(hw, "t2");
//        turret = new CRServoGroup(left, right);
//
//    }
//
//    public void right(){
//        turret.set(0.2);
//    }
//
//    public void left(){
//        turret.set(-0.2);
//    }
//
//
////    public void periodic() {turret.set(0);}
//
//
//
//
//
//
//
//
//
//
//    //use servogroup
//}

package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.SubsystemBase;

public class Turret extends SubsystemBase {

    private CRServo left;
    private CRServo right;

    public Turret(HardwareMap hw) {
        left = hw.get(CRServo.class, "t1");
        right = hw.get(CRServo.class, "t2");
    }

    public void right() {
        left.setPower(0.5);
        right.setPower(0.5);
    }

    public void left() {
        left.setPower(-0.5);
        right.setPower(-0.5);
    }

    public void stop() {
        left.setPower(0);
        right.setPower(0);
    }
}
