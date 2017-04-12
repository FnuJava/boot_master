package com.boot.service.user;

import org.springframework.stereotype.Service;

import com.boot.api.users.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Override
	public void sayHell() {
		System.out.println("caonima");
	}

}
