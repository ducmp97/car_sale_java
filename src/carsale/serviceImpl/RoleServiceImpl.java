/*
 * (C) Copyright Global CyberSoft (GCS) 2019. All rights reserved. Proprietary and confidential.
 */
package carsale.serviceImpl;

import carsale.dao.RoleDao;
import carsale.dao.impl.RoleDaoImpl;
import carsale.model.Role;
import carsale.service.RoleService;

/**
 * @author <a href="mailto:developer@hitachiconsulting.com">minhduc97.ptit</a>
 */
public class RoleServiceImpl implements RoleService {

  private RoleDao roleDao;

  /**
   * 
   */
  public RoleServiceImpl() {
    roleDao = new RoleDaoImpl();
  }

  /**
   * {@inheritDoc}
   * 
   * @see carsale.service.RoleService#getRoleById(int)
   */
  @Override
  public Role getRoleById(int id) {
    return roleDao.getRoleById(id);
  }

}
