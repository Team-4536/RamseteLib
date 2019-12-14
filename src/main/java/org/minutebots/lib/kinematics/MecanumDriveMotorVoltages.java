

package org.minutebots.lib.kinematics;

/**
 * Represents the motor voltages for a mecanum drive drivetrain.
 */
@SuppressWarnings("MemberName")
public class MecanumDriveMotorVoltages {
  /**
   * Voltage of the front left motor.
   */
  public double frontLeftVoltage;

  /**
   * Voltage of the front right motor.
   */
  public double frontRightVoltage;

  /**
   * Voltage of the rear left motor.
   */
  public double rearLeftVoltage;

  /**
   * Voltage of the rear right motor.
   */
  public double rearRightVoltage;

  /**
   * Constructs a MecanumDriveMotorVoltages with zeros for all member fields.
   */
  public MecanumDriveMotorVoltages() {
  }

  /**
   * Constructs a MecanumDriveMotorVoltages.
   *
   * @param frontLeftVoltage  Voltage of the front left motor.
   * @param frontRightVoltage Voltage of the front right motor.
   * @param rearLeftVoltage   Voltage of the rear left motor.
   * @param rearRightVoltage  Voltage of the rear right motor.
   */
  public MecanumDriveMotorVoltages(double frontLeftVoltage,
                                 double frontRightVoltage,
                                 double rearLeftVoltage,
                                 double rearRightVoltage) {
    this.frontLeftVoltage = frontLeftVoltage;
    this.frontRightVoltage = frontRightVoltage;
    this.rearLeftVoltage = rearLeftVoltage;
    this.rearRightVoltage = rearRightVoltage;
  }

  @Override
  public String toString() {
    return String.format("MecanumDriveMotorVoltages(Front Left: %.2f V, Front Right: %.2f V, "
            + "Rear Left: %.2f V, Rear Right: %.2f V)", frontLeftVoltage, frontRightVoltage,
        rearLeftVoltage, rearRightVoltage);
  }
}
