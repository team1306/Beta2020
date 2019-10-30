/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */
  public DriveTrain() {
    CommandScheduler.getInstance().registerSubsystem(this);
  }

  /**
   * Will be called periodically whenever the CommandScheduler runs. Use (perhaps)
   * for updating sensor input values. From the subsystem docs:
   * 
   * Subsystems must be registered with the scheduler with the
   * CommandScheduler.registerSubsystem(Subsystem) method in order for the
   * Subsystem.periodic() method to be called. It is recommended that this method
   * be called from the constructor of users' Subsystem implementations.
   */
  @Override
  public void periodic() {

  }

  /**
   * @param velocity - a 1.0 to -1.0 velocity, with 1.0 being full output toward
   *                 the front of the robot and -1 full back.
   * @param rotation - a 1.0 to -1.0 rotational velocity input, with 1.0 being
   *                 full counter-clockwise and -1.0 full clockwise.
   */
  public void arcadeDrive(double velocity, double rotation) {
    //TODO: Read the function docs and implement what it says
  }

}
