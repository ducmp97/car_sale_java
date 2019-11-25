
package carsale.model;

import java.io.Serializable;
import java.sql.Date;

/**
 * The Class Comment.
 */
public class Comment implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The com id. */
  private int comId;

  /** The com title. */
  private String comTitle;

  /** The com content. */
  private String comContent;

  /** The com time. */
  private Date comTime;

  /** The user. */
  private User user;

  /** The post. */
  private Post post;

  /**
   * Instantiates a new comment.
   */
  public Comment() {
    super();
  }

  /**
   * Instantiates a new comment.
   *
   * @param comId
   *          the com id
   * @param comTitle
   *          the com title
   * @param comContent
   *          the com content
   * @param comTime
   *          the com time
   * @param user
   *          the user
   * @param post
   *          the post
   */
  public Comment(int comId, String comTitle, String comContent, Date comTime, User user,
      Post post) {
    super();
    this.comId = comId;
    this.comTitle = comTitle;
    this.comContent = comContent;
    this.comTime = comTime;
    this.user = user;
    this.post = post;
  }

  /**
   * Gets the com id.
   *
   * @return the comId
   */
  public int getComId() {
    return comId;
  }

  /**
   * Sets the com id.
   *
   * @param comId
   *          the comId to set
   */
  public void setComId(int comId) {
    this.comId = comId;
  }

  /**
   * Gets the com title.
   *
   * @return the comTitle
   */
  public String getComTitle() {
    return comTitle;
  }

  /**
   * Sets the com title.
   *
   * @param comTitle
   *          the comTitle to set
   */
  public void setComTitle(String comTitle) {
    this.comTitle = comTitle;
  }

  /**
   * Gets the com content.
   *
   * @return the comContent
   */
  public String getComContent() {
    return comContent;
  }

  /**
   * Sets the com content.
   *
   * @param comContent
   *          the comContent to set
   */
  public void setComContent(String comContent) {
    this.comContent = comContent;
  }

  /**
   * Gets the com time.
   *
   * @return the comTime
   */
  public Date getComTime() {
    return comTime;
  }

  /**
   * Sets the com time.
   *
   * @param comTime
   *          the comTime to set
   */
  public void setComTime(Date comTime) {
    this.comTime = comTime;
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
   * Gets the post.
   *
   * @return the post
   */
  public Post getPost() {
    return post;
  }

  /**
   * Sets the post.
   *
   * @param post
   *          the post to set
   */
  public void setPost(Post post) {
    this.post = post;
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Comment [comId=" + comId + ", comTitle=" + comTitle + ", comContent=" + comContent
        + ", comTime=" + comTime + ", user=" + user + ", post=" + post + "]";
  }

}
