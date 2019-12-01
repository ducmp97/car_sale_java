/*
 * (C) Copyright Global CyberSoft (GCS) 2019. All rights reserved. Proprietary and confidential.
 */
package carsale.service;

import carsale.model.Role;

/**
 * @author <a href="mailto:developer@hitachiconsulting.com">minhduc97.ptit</a>
 */
public interface RoleService {

  /**
   * Gets the role by id.
   *
   * @param id
   *          the id
   * @return the role by id
   */
  public Role getRoleById(int id);
}
