
package carsale.model;

import java.io.Serializable;

/**
 * The Class Image.
 */
public class Image implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The image id. */
  private int imageId;

  /** The image url. */
  private String imageUrl;

  /** The image type. */
  private String imageType;

  /**
   * Instantiates a new image.
   */
  public Image() {
    super();
  }

  /**
   * Instantiates a new image.
   *
   * @param imageId
   *          the image id
   * @param imageUrl
   *          the image url
   * @param imageType
   *          the image type
   */
  public Image(int imageId, String imageUrl, String imageType) {
    super();
    this.imageId = imageId;
    this.imageUrl = imageUrl;
    this.imageType = imageType;
  }

  /**
   * Gets the image id.
   *
   * @return the imageId
   */
  public int getImageId() {
    return imageId;
  }

  /**
   * Sets the image id.
   *
   * @param imageId
   *          the imageId to set
   */
  public void setImageId(int imageId) {
    this.imageId = imageId;
  }

  /**
   * Gets the image url.
   *
   * @return the imageUrl
   */
  public String getImageUrl() {
    return imageUrl;
  }

  /**
   * Sets the image url.
   *
   * @param imageUrl
   *          the imageUrl to set
   */
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  /**
   * Gets the image type.
   *
   * @return the imageType
   */
  public String getImageType() {
    return imageType;
  }

  /**
   * Sets the image type.
   *
   * @param imageType
   *          the imageType to set
   */
  public void setImageType(String imageType) {
    this.imageType = imageType;
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Image [imageId=" + imageId + ", imageUrl=" + imageUrl + ", imageType=" + imageType
        + "]";
  }

}
