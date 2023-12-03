
package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.Analogicos;
import frc.robot.subsystems.drivetrain;


public class RobotContainer {
 
  public static final Joystick m_joystick = new Joystick(0);
  private static final drivetrain m_drive = new drivetrain();


  public RobotContainer() {
  
    m_drive.setDefaultCommand(new Analogicos(m_drive, m_joystick.getRawAxis(0), m_joystick.getRawAxis(1), m_joystick.getRawAxis(4), m_joystick.getRawAxis(5)));
    
    
  }
}
