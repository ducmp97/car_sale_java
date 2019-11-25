
package carsale.model;

import java.io.Serializable;

/**
 * The Class Description.
 */
public class Description implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The des id. */
  private int desId;

  /** The des title. */
  private String desTitle;

  /** The des content. */
  private String desContent;

  /** The des type. */
  private String desType;

  /** The image. */
  private Image image;

  /**
   * Instantiates a new description.
   */
  public Description() {
    super();
  }

  /**
   * Instantiates a new description.
   *
   * @param desId
   *          the des id
   * @param desTitle
   *          the des title
   * @param desContent
   *          the des content
   * @param desType
   *          the des type
   * @param image
   *          the image
   */
  public Description(int desId, String desTitle, String desContent, String desType,
      Image image) {
    super();
    this.desId = desId;
    this.desTitle = desTitle;
    this.desContent = desContent;
    this.desType = desType;
    this.image = image;
  }

  /**
   * Gets the des id.
   *
   * @return the desId
   */
  public int getDesId() {
    return desId;
  }

  /**
   * Sets the des id.
   *
   * @param desId
   *          the desId to set
   */
  public void setDesId(int desId) {
    this.desId = desId;
  }

  /**
   * Gets the des title.
   *
   * @return the desTitle
   */
  public String getDesTitle() {
    return desTitle;
  }

  /**
   * Sets the des title.
   *
   * @param desTitle
   *          the desTitle to set
   */
  public void setDesTitle(String desTitle) {
    this.desTitle = desTitle;
  }

  /**
   * Gets the des content.
   *
   * @return the desContent
   */
  public String getDesContent() {
    return desContent;
  }

  /**
   * Sets the des content.
   *
   * @param desContent
   *          the desContent to set
   */
  public void setDesContent(String desContent) {
    this.desContent = desContent;
  }

  /**
   * Gets the des type.
   *
   * @return the desType
   */
  public String getDesType() {
    return desType;
  }

  /**
   * Sets the des type.
   *
   * @param desType
   *          the desType to set
   */
  public void setDesType(String desType) {
    this.desType = desType;
  }

  /**
   * Gets the image.
   *
   * @return the image
   */
  public Image getImage() {
    return image;
  }

  /**
   * Sets the image.
   *
   * @param image
   *          the image to set
   */
  public void setImage(Image image) {
    this.image = image;
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Description [desId=" + desId + ", desTitle=" + desTitle + ", desContent="
        + desContent + ", desType=" + desType + ", image=" + image + "]";
  }

}
