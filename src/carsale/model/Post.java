
package carsale.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Post.
 */
public class Post implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The post id. */
  private int postId;

  /** The post title. */
  private String postTitle;

  /** The post content. */
  private String postContent;

  /** The time update. */
  private Date timeUpdate;

  /** The post type. */
  private String postType;

  /** The user. */
  private User user;

  /** The list image. */
  private ArrayList<Image> listImage;

  /**
   * Instantiates a new post.
   */
  public Post() {
    super();
  }

  /**
   * Instantiates a new post.
   *
   * @param postId
   *          the post id
   * @param postTitle
   *          the post title
   * @param postContent
   *          the post content
   * @param timeUpdate
   *          the time update
   * @param postType
   *          the post type
   * @param user
   *          the user
   * @param listImage
   *          the list image
   */
  public Post(int postId, String postTitle, String postContent, Date timeUpdate,
      String postType, User user, ArrayList<Image> listImage) {
    super();
    this.postId = postId;
    this.postTitle = postTitle;
    this.postContent = postContent;
    this.timeUpdate = timeUpdate;
    this.postType = postType;
    this.user = user;
    this.listImage = listImage;
  }

  /**
   * Gets the post id.
   *
   * @return the postId
   */
  public int getPostId() {
    return postId;
  }

  /**
   * Sets the post id.
   *
   * @param postId
   *          the postId to set
   */
  public void setPostId(int postId) {
    this.postId = postId;
  }

  /**
   * Gets the post title.
   *
   * @return the postTitle
   */
  public String getPostTitle() {
    return postTitle;
  }

  /**
   * Sets the post title.
   *
   * @param postTitle
   *          the postTitle to set
   */
  public void setPostTitle(String postTitle) {
    this.postTitle = postTitle;
  }

  /**
   * Gets the post content.
   *
   * @return the postContent
   */
  public String getPostContent() {
    return postContent;
  }

  /**
   * Sets the post content.
   *
   * @param postContent
   *          the postContent to set
   */
  public void setPostContent(String postContent) {
    this.postContent = postContent;
  }

  /**
   * Gets the time update.
   *
   * @return the timeUpdate
   */
  public Date getTimeUpdate() {
    return timeUpdate;
  }

  /**
   * Sets the time update.
   *
   * @param timeUpdate
   *          the timeUpdate to set
   */
  public void setTimeUpdate(Date timeUpdate) {
    this.timeUpdate = timeUpdate;
  }

  /**
   * Gets the post type.
   *
   * @return the postType
   */
  public String getPostType() {
    return postType;
  }

  /**
   * Sets the post type.
   *
   * @param postType
   *          the postType to set
   */
  public void setPostType(String postType) {
    this.postType = postType;
  }

  /**
   * Gets the user.
   *
   * @return the user
   */
  public User getUser() {
    return user;
  }

  /**
   * Sets the user.
   *
   * @param user
   *          the user to set
   */
  public void setUser(User user) {
    this.user = user;
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
   * {@inheritDoc}
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Post [postId=" + postId + ", postTitle=" + postTitle + ", postContent="
        + postContent + ", timeUpdate=" + timeUpdate + ", postType=" + postType + ", user="
        + user + ", listImage=" + listImage + "]";
  }

}
