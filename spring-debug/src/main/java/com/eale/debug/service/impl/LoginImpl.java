package com.eale.debug.service.impl;

import com.eale.debug.service.ILogin;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author Admin
 * @Date 2021/1/5
 * @Description //
 * @Version 1.0
 **/
public class LoginImpl implements ILogin {

	String id = "";

	@Autowired(required = false)
	public void setId(String id) {
		this.id = id;
	}


	public String loginCheck(String userName, String password) {
		System.out.println("boy登录...");
		return "success";
	}
}
