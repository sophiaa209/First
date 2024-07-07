import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.VoltageSensor;

@Disabled
@Autonomous(group="testulet:))")

public class Test extends LinearOpMode {
    public static DcMotorEx leftFront, rightFront, leftBack, rightBack;
//Config names are the same as the variable names
    

   @Override
    public void waitForStart() {
       initHardware();

   }
   public void runOpMode(){

   }

public void initHardware(){
    leftFront=(DcMotor.class ,"leftFront");
    rightFront=(DcMotor.class ,"rightFront");
    leftBack=(DcMotor.class ,"leftBack");
    rightBack=(DcMotor.class ,"rightBack");

    leftFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    rightFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    leftBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    rightBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

    leftFront.setDirection(DcMotorSimple.Direction.REVERSE);
    leftBack.setDirection(DcMotorSimple.Direction.REVERSE);

    leftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    rightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    leftBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    rightBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    VoltageSensor voltageSensor=hardwareMap.voltageSensor.iterator().next();


}

}
