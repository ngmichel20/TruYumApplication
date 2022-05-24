package com.cogniznant.truyum.service;

import com.cogniznant.truyum.model.User;
import com.cogniznant.truyum.model.UserDto;
import java.util.List;

public interface UserService {
	User save(UserDto user);

	List<User> findAll();

	User findOne(String username);
}
