
package carsale.model;

import java.io.Serializable;

/**
 * The Class Spec.
 */
public class Spec implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The spec id. */
  private int specId;

  /** The spec title. */
  private String specTitle;

  /** The spec name. */
  private String specName;

  /** The spec des. */
  private String specDes;

  /** The spec dram. */
  private String specDram;

  /** The spec detail. */
  private String specDetail;

  /** The car. */
  private Car car;

  /**
   * Instantiates a new spec.
   */
  public Spec() {
    super();
  }

  /**
   * Instantiates a new spec.
   *
   * @param specId
   *          the spec id
   * @param specTitle
   *          the spec title
   * @param specName
   *          the spec name
   * @param specDes
   *          the spec des
   * @param specDram
   *          the spec dram
   * @param specDetail
   *          the spec detail
   * @param car
   *          the car
   */
  public Spec(int specId, String specTitle, String specName, String specDes, String specDram,
      String specDetail, Car car) {
    super();
    this.specId = specId;
    this.specTitle = specTitle;
    this.specName = specName;
    this.specDes = specDes;
    this.specDram = specDram;
    this.specDetail = specDetail;
    this.car = car;
  }

  /**
   * Gets the spec id.
   *
   * @return the specId
   */
  public int getSpecId() {
    return specId;
  }

  /**
   * Sets the spec id.
   *
   * @param specId
   *          the specId to set
   */
  public void setSpecId(int specId) {
    this.specId = specId;
  }

  /**
   * Gets the spec title.
   *
   * @return the specTitle
   */
  public String getSpecTitle() {
    return specTitle;
  }

  /**
   * Sets the spec title.
   *
   * @param specTitle
   *          the specTitle to set
   */
  public void setSpecTitle(String specTitle) {
    this.specTitle = specTitle;
  }

  /**
   * Gets the spec name.
   *
   * @return the specName
   */
  public String getSpecName() {
    return specName;
  }

  /**
   * Sets the spec name.
   *
   * @param specName
   *          the specName to set
   */
  public void setSpecName(String specName) {
    this.specName = specName;
  }

  /**
   * Gets the spec des.
   *
   * @return the specDes
   */
  public String getSpecDes() {
    return specDes;
  }

  /**
   * Sets the spec des.
   *
   * @param specDes
   *          the specDes to set
   */
  public void setSpecDes(String specDes) {
    this.specDes = specDes;
  }

  /**
   * Gets the spec dram.
   *
   * @return the specDram
   */
  public String getSpecDram() {
    return specDram;
  }

  /**
   * Sets the spec dram.
   *
   * @param specDram
   *          the specDram to set
   */
  public void setSpecDram(String specDram) {
    this.specDram = specDram;
  }

  /**
   * Gets the spec detail.
   *
   * @return the specDetail
   */
  public String getSpecDetail() {
    return specDetail;
  }

  /**
   * Sets the spec detail.
   *
   * @param specDetail
   *          the specDetail to set
   */
  public void setSpecDetail(String specDetail) {
    this.specDetail = specDetail;
  }

  /**
   * Gets the car.
   *
   * @return the car
   */
  public Car getCar() {
    return car;
  }

  /**
   * Sets the car.
   *
   * @param car
   *          the car to set
   */
  public void setCar(Car car) {
    this.car = car;
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Spec [specId=" + specId + ", specTitle=" + specTitle + ", specName=" + specName
        + ", specDes=" + specDes + ", specDram=" + specDram + ", specDetail=" + specDetail
        + ", car=" + car + "]";
  }

}
