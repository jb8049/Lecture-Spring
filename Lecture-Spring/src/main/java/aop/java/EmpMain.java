package aop.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * spring aop특징
 * 1. Runtime 기반
 * 2. Proxy 기반
 * 3. 인터페이스 기반 Employee e = getBean("programmer")
 */

public class EmpMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		

		Employee e = context.getBean("programmer", Employee.class);

		//이렇게 했더니 실행안하네.. => MyAspect 클래스를 안만들었잖아
		// @Component같은거 붙여야함!! => MyAspect에 @Service를 붙임
		// 공통 코드인 MyAspect를 안만들어도 일단 실행은 됐음
		// 전체적인 시스템에 영향을 안끼침!
		e.work();
		
	
		
	}
	
	
}
