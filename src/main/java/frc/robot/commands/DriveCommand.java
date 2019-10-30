/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.UserInput;
import frc.robot.subsystems.DriveTrain;

/**
 * An example command that uses an example subsystem.
 */
public class DriveCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

  //Controller bindings, to be set with RobotContainer

  private final DriveTrain m_driveTrain;

  public static UserInput VelocityInput;
  public static UserInput RotationInput;
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public DriveCommand(DriveTrain subsystem) {
    m_driveTrain = subsystem;
    addRequirements(subsystem);
    subsystem.setDefaultCommand(this);
  }

  @Override
  public void execute(){
    m_driveTrain.arcadeDrive(VelocityInput.getValue(),RotationInput.getValue());
  }
}
