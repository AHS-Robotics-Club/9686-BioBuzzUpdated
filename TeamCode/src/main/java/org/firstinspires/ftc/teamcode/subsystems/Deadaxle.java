package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.SubsystemBase;
import com.seattlesolvers.solverslib.hardware.servos.ServoEx;
import com.seattlesolvers.solverslib.hardware.servos.ServoExGroup;

public class Deadaxle extends SubsystemBase {
    private final ServoExGroup dx;

    public Deadaxle(HardwareMap hw){
        ServoEx left = new ServoEx(hw, "left");
        ServoEx right = new ServoEx(hw, "right");
        right.setInverted(true);
        dx = new ServoExGroup(left, right);

    }
    
    public void block(){
        dx.set(0.5);
    }

    public void intake(){
        dx.set(0);
    }
    
    
    







    //use servogroup
}
