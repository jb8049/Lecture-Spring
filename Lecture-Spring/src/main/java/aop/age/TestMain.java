package aop.age;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("aop-age.xml");
		Person p = context.getBean("man", Person.class);
		
		try {
			p.setAge(20);
//			p.setAge(-14); //after가 finally라서 미성년입니다가 뜸
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
