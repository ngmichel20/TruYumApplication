package com.cogniznant.truyum.service.impl;

import com.cogniznant.truyum.dao.RoleDao;
import com.cogniznant.truyum.model.Role;
import com.cogniznant.truyum.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "roleService")
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;

	@Override
	public Role findByName(String name) {
		Role role = roleDao.findRoleByName(name);
		return role;
	}
}
