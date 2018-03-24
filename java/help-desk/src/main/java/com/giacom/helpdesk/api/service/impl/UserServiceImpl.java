package com.giacom.helpdesk.api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.giacom.helpdesk.api.entity.User;
import com.giacom.helpdesk.api.repository.UserRepository;
import com.giacom.helpdesk.api.service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public User createOrUpdate(User user) {
		return userRepository.save(user);
	}

	@Override
	public User findById(String id) {
		Optional<User> user = userRepository.findById(id);
		return user.get();
	}

	@Override
	public void delete(User user) {
		userRepository.delete(user);

	}

	@Override
	public Page<User> findAll(int page, int count) {
		PageRequest pages = PageRequest.of(page, count);
		return userRepository.findAll(pages);
	}

}
