
package carsale.model;

import java.io.Serializable;

/**
 * The Class CityFee.
 */
public class CityFee implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The city fee id. */
  private int cityFeeId;

  /** The city name. */
  private String cityName;

  /** The tax. */
  private Double tax;

  /** The registration. */
  private Double registration;

  /** The insurrance. */
  private Double insurrance;

  /** The license plate. */
  private Double licensePlate;

  /**
   * Instantiates a new city fee.
   */
  public CityFee() {
    super();
  }

  /**
   * Instantiates a new city fee.
   *
   * @param cityFeeId
   *          the city fee id
   * @param cityName
   *          the city name
   * @param tax
   *          the tax
   * @param registration
   *          the registration
   * @param insurrance
   *          the insurrance
   * @param licensePlate
   *          the license plate
   */
  public CityFee(int cityFeeId, String cityName, Double tax, Double registration,
      Double insurrance, Double licensePlate) {
    super();
    this.cityFeeId = cityFeeId;
    this.cityName = cityName;
    this.tax = tax;
    this.registration = registration;
    this.insurrance = insurrance;
    this.licensePlate = licensePlate;
  }

  /**
   * Gets the city fee id.
   *
   * @return the cityFeeId
   */
  public int getCityFeeId() {
    return cityFeeId;
  }

  /**
   * Sets the city fee id.
   *
   * @param cityFeeId
   *          the cityFeeId to set
   */
  public void setCityFeeId(int cityFeeId) {
    this.cityFeeId = cityFeeId;
  }

  /**
   * Gets the city name.
   *
   * @return the cityName
   */
  public String getCityName() {
    return cityName;
  }

  /**
   * Sets the city name.
   *
   * @param cityName
   *          the cityName to set
   */
  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  /**
   * Gets the tax.
   *
   * @return the tax
   */
  public Double getTax() {
    return tax;
  }

  /**
   * Sets the tax.
   *
   * @param tax
   *          the tax to set
   */
  public void setTax(Double tax) {
    this.tax = tax;
  }

  /**
   * Gets the registration.
   *
   * @return the registration
   */
  public Double getRegistration() {
    return registration;
  }

  /**
   * Sets the registration.
   *
   * @param registration
   *          the registration to set
   */
  public void setRegistration(Double registration) {
    this.registration = registration;
  }

  /**
   * Gets the insurrance.
   *
   * @return the insurrance
   */
  public Double getInsurrance() {
    return insurrance;
  }

  /**
   * Sets the insurrance.
   *
   * @param insurrance
   *          the insurrance to set
   */
  public void setInsurrance(Double insurrance) {
    this.insurrance = insurrance;
  }

  /**
   * Gets the license plate.
   *
   * @return the licensePlate
   */
  public Double getLicensePlate() {
    return licensePlate;
  }

  /**
   * Sets the license plate.
   *
   * @param licensePlate
   *          the licensePlate to set
   */
  public void setLicensePlate(Double licensePlate) {
    this.licensePlate = licensePlate;
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "CityFee [cityFeeId=" + cityFeeId + ", cityName=" + cityName + ", tax=" + tax
        + ", registration=" + registration + ", insurrance=" + insurrance + ", licensePlate="
        + licensePlate + "]";
  }

}
