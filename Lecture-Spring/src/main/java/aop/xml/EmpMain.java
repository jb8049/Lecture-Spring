package aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * spring aop특징
 * 1. Runtime 기반
 * 2. Proxy 기반
 * 3. 인터페이스 기반 Employee e = getBean("programmer")
 */

public class EmpMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("aop-xml.xml");
		
//		인터페이스 기반이라 Employee형으로 가져와야함
		Employee e = context.getBean("programmer", Employee.class);
//		Employee e = context.getBean("designer", Employee.class);
		e.work();
		
	}
	
	
}
