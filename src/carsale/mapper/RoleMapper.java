/*
 * (C) Copyright Global CyberSoft (GCS) 2019. All rights reserved. Proprietary and confidential.
 */
package carsale.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import carsale.model.Role;

/**
 * @author <a href="mailto:developer@hitachiconsulting.com">minhduc97.ptit</a>
 */
public class RoleMapper implements IRowMapper<Role> {

  /**
   * {@inheritDoc}
   * 
   * @see carsale.mapper.IRowMapper#mapRow(java.sql.ResultSet)
   */
  @Override
  public Role mapRow(ResultSet rs) {
    Role role = new Role();
    try {
      role.setRoleId(rs.getInt("id"));
      role.setRoleName(rs.getString("name"));
      role.setRoleCode(rs.getString("code"));
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return role;
  }

}
