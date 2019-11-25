
package carsale.model;

import java.io.Serializable;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Car.
 */
public class Car implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The car id. */
  private int carId;

  /** The car name. */
  private String carName;

  /** The car category. */
  private String carCategory;

  /** The car status. */
  private String carStatus;

  /** The car des. */
  private String carDes;

  /** The list image. */
  private ArrayList<Image> listImage;

  /** The description. */
  private Description description;

  /**
   * Instantiates a new car.
   */
  public Car() {
    super();
  }

  /**
   * Instantiates a new car.
   *
   * @param carId
   *          the car id
   * @param carName
   *          the car name
   * @param carCategory
   *          the car category
   * @param carStatus
   *          the car status
   * @param carDes
   *          the car des
   * @param listImage
   *          the list image
   * @param description
   *          the description
   */
  public Car(int carId, String carName, String carCategory, String carStatus, String carDes,
      ArrayList<Image> listImage, Description description) {
    super();
    this.carId = carId;
    this.carName = carName;
    this.carCategory = carCategory;
    this.carStatus = carStatus;
    this.carDes = carDes;
    this.listImage = listImage;
    this.description = description;
  }

  /**
   * Gets the car id.
   *
   * @return the carId
   */
  public int getCarId() {
    return carId;
  }

  /**
   * Sets the car id.
   *
   * @param carId
   *          the carId to set
   */
  public void setCarId(int carId) {
    this.carId = carId;
  }

  /**
   * Gets the car name.
   *
   * @return the carName
   */
  public String getCarName() {
    return carName;
  }

  /**
   * Sets the car name.
   *
   * @param carName
   *          the carName to set
   */
  public void setCarName(String carName) {
    this.carName = carName;
  }

  /**
   * Gets the car category.
   *
   * @return the carCategory
   */
  public String getCarCategory() {
    return carCategory;
  }

  /**
   * Sets the car category.
   *
   * @param carCategory
   *          the carCategory to set
   */
  public void setCarCategory(String carCategory) {
    this.carCategory = carCategory;
  }

  /**
   * Gets the car status.
   *
   * @return the carStatus
   */
  public String getCarStatus() {
    return carStatus;
  }

  /**
   * Sets the car status.
   *
   * @param carStatus
   *          the carStatus to set
   */
  public void setCarStatus(String carStatus) {
    this.carStatus = carStatus;
  }

  /**
   * Gets the car des.
   *
   * @return the carDes
   */
  public String getCarDes() {
    return carDes;
  }

  /**
   * Sets the car des.
   *
   * @param carDes
   *          the carDes to set
   */
  public void setCarDes(String carDes) {
    this.carDes = carDes;
  }

  /**
   * Gets the list image.
   *
   * @return the listImage
   */
  public ArrayList<Image> getListImage() {
    return listImage;
  }

  /**
   * Sets the list image.
   *
   * @param listImage
   *          the listImage to set
   */
  public void setListImage(ArrayList<Image> listImage) {
    this.listImage = listImage;
  }

  /**
   * Gets the description.
   *
   * @return the description
   */
  public Description getDescription() {
    return description;
  }

  /**
   * Sets the description.
   *
   * @param description
   *          the description to set
   */
  public void setDescription(Description description) {
    this.description = description;
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Car [carId=" + carId + ", carName=" + carName + ", carCategory=" + carCategory
        + ", carStatus=" + carStatus + ", carDes=" + carDes + ", listImage=" + listImage
        + ", description=" + description + "]";
  }

}
