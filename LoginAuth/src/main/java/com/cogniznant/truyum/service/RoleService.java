package com.cogniznant.truyum.service;

import com.cogniznant.truyum.model.Role;

public interface RoleService {
    Role findByName(String name);
}
