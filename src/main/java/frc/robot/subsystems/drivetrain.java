
package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class drivetrain extends SubsystemBase {
  /** Creates a new drivetrain. */
  VictorSPX motorRightF;
  VictorSPX motorRightB;
  VictorSPX motorLeftF;
  VictorSPX motorLeftB;
  double eixo1x;
  double eixo1y;
  double eixo2x;
  double eixo2y;
  double magnitude1;
  double seno1;
  double magnitude2;
  double seno2;
  

  
  public drivetrain() {
    motorRightF = new VictorSPX(Constants.rightFMotor);
    motorRightB = new VictorSPX(Constants.rightBMotor);
    motorLeftF = new VictorSPX(Constants.leftFMotor);
    motorLeftB = new VictorSPX(Constants.leftBMotor);

  }

  @Override
  public void periodic() {
   
    
  }
}
