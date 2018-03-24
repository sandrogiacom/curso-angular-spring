package com.giacom.helpdesk.api.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.giacom.helpdesk.api.entity.User;

@Component
public interface UserService {

	User findByEmail(String email);

	User createOrUpdate(User user);

	User findById(String id);

	void delete(User user);

	Page<User> findAll(int page, int count);

}
