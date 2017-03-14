package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.HelloWorld;

public class Test {
	
	public static ApplicationContext context;
	public static HelloWorld helloWorld;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		helloWorld = (HelloWorld) context.getBean("helloworld");
		helloWorld.sayHello();
	}

}
