/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {

  private final DifferentialDrive driveBase;

  // Motors
  private final WPI_TalonSRX frontLeft;
  private final WPI_TalonSRX backLeft;
  private final WPI_TalonSRX frontRight;
  private final WPI_TalonSRX backRight;
  // Motor Group
  private final SpeedControllerGroup leftSide;
  private final SpeedControllerGroup rightSide;

  /**
   * Creates a new DriveTrain.
   */
  public DriveTrain() {
    CommandScheduler.getInstance().registerSubsystem(this);

    // initialize motors
    frontLeft = new WPI_TalonSRX(Constants.K_DRIVE_LEFT_FRONT_ID);
    frontRight = new WPI_TalonSRX(Constants.K_DRIVE_RIGHT_FRONT_ID);
    backLeft = new WPI_TalonSRX(Constants.K_DRIVE_LEFT_BACK_ID);
    backRight = new WPI_TalonSRX(Constants.K_DRIVE_RIGHT_BACK_ID);

    // group motors
    leftSide = new SpeedControllerGroup(frontLeft, backLeft);
    rightSide = new SpeedControllerGroup(frontRight, backRight);

    driveBase = new DifferentialDrive(leftSide, rightSide);
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
   * An exposition for DifferentialDrive.arcadeDrive
   * 
   * @param velocity - a 1.0 to -1.0 velocity, with 1.0 being full output toward
   *                 the front of the robot and -1 full back.
   * @param rotation - a 1.0 to -1.0 rotational velocity input, with 1.0 being
   *                 full counter-clockwise and -1.0 full clockwise.
   * 
   */
  public void arcadeDrive(double velocity, double rotation) {
    driveBase.arcadeDrive(velocity, rotation);
  }

  /**
   * An exposition for DifferentialDrive.tankDrive
   * 
   * @param leftSpeed  - output velocity of the left drive side
   * @param rightSpeed - output velocity of the right drive side
   */
  public void tankDrive(double leftSpeed, double rightSpeed) {
    driveBase.tankDrive(leftSpeed, rightSpeed);
  }

}