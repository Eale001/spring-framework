package com.eale.debug;

import com.eale.debug.service.ILogin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Admin
 * @Date 2021/1/5
 * @Description //
 * @Version 1.0
 **/
public class Application {


	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springApplication.xml");
		ILogin bean = (ILogin) applicationContext.getBean("loginService");
		String s = bean.loginCheck("123", "124");
		System.out.println(s);


	}

}
