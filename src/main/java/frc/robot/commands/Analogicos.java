// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivetrain;

public class Analogicos extends CommandBase {
  drivetrain m_drive;
  double eixo1x;
  double eixo1y;
  double eixo2x;
  double eixo2y;
  double magnitude1;
  double seno1;
  double magnitude2;
  double seno2;
  public static double motoresdireita1;
  public static double motoresesquerda1;
  public static double motoresdireita2;
  public static double motoresesquerda2;
  public static double buttonV;

  
  public Analogicos(drivetrain drive, double param_eixo1x, double param_eixo1y, double param_eixo2x, double param_eixo2y) {
   
    m_drive = drive;
    eixo1x = param_eixo1x;
    eixo1y = param_eixo1y;
    eixo2x = param_eixo2x;
    eixo2y = param_eixo2y;
    
    addRequirements(m_drive);
  }

 
  @Override
  public void initialize() {
    magnitude1 = Math.sqrt(Math.pow(eixo1y, 2) + Math.pow(eixo1x, 2));
    seno1 = eixo1y / magnitude1;
    magnitude2 = Math.sqrt(Math.pow(eixo2y, 2) + Math.pow(eixo2x, 2));
    seno2 = eixo2y / magnitude2;
    buttonV = 1;
  }

  
  @Override
  public void execute() {
     // Analogico Comum

    // Quadrante 1
    if (eixo1y >= 0 && eixo1x >= 0) {
      motoresesquerda1 = magnitude1*buttonV;
      motoresdireita1 = ((2 * seno1 - 1) * magnitude1)*buttonV;
      // Quadrante 2
    } else if (eixo1y >= 0 && eixo1x <= 0) {
      motoresesquerda1 = ((2 * seno1 - 1) * magnitude1)*buttonV;
      motoresdireita1 = magnitude1*buttonV;
      // Quadrante 3
    } else if (eixo1y < 0 && eixo1x < 0) {
      motoresesquerda1 = -magnitude1*buttonV;
      motoresdireita1 = ((2 * seno1 + 1) * magnitude1)*buttonV;
      // Quadrante 4
    } else if (eixo1y < 0 && eixo1x >= 0) {
      motoresesquerda1 = ((2 * seno1 + 1) * magnitude1)*buttonV;
      motoresdireita1 = -magnitude1*buttonV;
    }

  }

  
  @Override
  public void end(boolean interrupted) {}


  @Override
  public boolean isFinished() {
    return false;
  }
}
