package aop.anno;

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
		
		ApplicationContext context = new GenericXmlApplicationContext("aop-anno.xml");
		
//		인터페이스 기반이라 Employee형으로 가져와야함
		
		// .xml에서 new해서 객체만 만들어 놓은 상태임
		//  MyAsapect에서 annotation을 활용해서 공통 코드 주입 시점을 정할 것임
		
		Employee e = context.getBean("programmer", Employee.class);
//		Employee e = context.getBean("designer", Employee.class);
		e.work();
		
		// 이거 실행하면은 공통 코드 주입이 일어나면 안됨
		// 다른 곳에 있는거 가져올 때는 앞에 패키지명 붙여야함
//		aop.xml.Employee e2 = context.getBean("programmer2",aop.xml.Employee.class);
//		e2.work();
		
	}
	
	
}
