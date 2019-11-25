
package carsale.service;

import java.util.ArrayList;

import carsale.model.Post;

/**
 * The Interface PostService.
 */
public interface PostService {

  /**
   * Insert post.
   *
   * @param postId
   *          the post id
   * @return the int
   */
  public int insertPost(int postId);

  /**
   * Update post.
   *
   * @param post
   *          the post
   */
  public void updatePost(Post post);

  /**
   * Delete post.
   *
   * @param postId
   *          the post id
   * @return the int
   */
  public int deletePost(int postId);

  /**
   * Gets the post by type.
   *
   * @param postType
   *          the post type
   * @return the post by type
   */
  public ArrayList<Post> getPostByType(String postType);

  /**
   * Gets the post by id.
   *
   * @param postId
   *          the post id
   * @return the post by id
   */
  public Post getPostById(int postId);

  /**
   * Gets the post by title.
   *
   * @param postTitle
   *          the post title
   * @return the post by title
   */
  public Post getPostByTitle(int postTitle);

}
