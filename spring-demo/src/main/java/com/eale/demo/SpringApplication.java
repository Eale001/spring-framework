package com.eale.demo;

import com.eale.demo.modle.MyTestBean;
import com.eale.demo.service.ILogin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Admin
 * @Date 2021/1/5
 * @Description //
 * @Version 1.0
 **/
public class SpringApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springApplication.xml");
		String id = applicationContext.getId();
		System.out.println(id);
		ILogin loginService = (ILogin) applicationContext.getBean("loginService");
		String s = loginService.loginCheck("username", "xiaohong");
		System.out.println(s);

		MyTestBean testBean = (MyTestBean) applicationContext.getBean("testBean");

		String testBean1 = testBean.getTestBean();
		System.out.println(testBean1);

		System.out.println(System.getProperty("sun.boot.class.path"));

	}


}
