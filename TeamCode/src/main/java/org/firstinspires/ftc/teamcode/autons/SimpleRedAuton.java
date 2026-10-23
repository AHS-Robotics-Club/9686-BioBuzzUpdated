//import com.pedropathing.follower.Follower;
//import com.qualcomm.hardware.limelightvision.Limelight3A;
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//
//@Autonomous
//class SimpleRedAuton extends LinearOpMode {
//    @Override public void runOpMode() {
//        Follower follower = new Follower();   // your team's follower
//        Limelight3A limelight = hardwareMap.get(Limelight3A.class,
//                org.firstinspires.ftc.teamcode.HiveConfig.LIMELIGHT_NAME);
//        limelight.start();
//
//        int picked = new org.firstinspires.ftc.teamcode.BallHunt(follower, limelight, intake)
//                .reds().collect(2).within(20)
//                .go(this);   // blocking: drives, picks 2 red balls, hands back
//
//        // ...then drive to the backdrop and score them...
//    }
//}