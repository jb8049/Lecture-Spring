package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {
	public static void main(String[] args) {
		
		/* 자동으로 이 객체를 읽어오고 싶다
		Hello obj = new Hello(); //기존에는 이렇게 만들었음
		obj.printMsg();
		*/
		
		// src/main/resources 여기가 클래스 패스임!
		// 이거 실행하자마자 bean에 가지고 있는 객체 생성
		//ApplicationContext context = new ClassPathXmlApplicationContext("beanContainer.xml"); 
		
		//파일의 경로를 설정해줄 수 있음
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beanContainer.xml");
		
		// 파일 시스템이나 클래스패스의 역할을 다할 수 있는 거는 Generic
		ApplicationContext context = new GenericXmlApplicationContext("beanContainer.xml");
		
		// 컨테이너를 이용해서 객체 가져오고 싶다, 구분자는 id
		// context.getBean("hello"); // getBean은 Object형이다, Hello가 가지고 있는 것 호출하기 위해서는 "명시적 형변환 필요"
		Hello obj = (Hello) context.getBean("hello");
		
		System.out.println("obj : " + obj);
		
		obj.printMsg();
		
		// 생성되어 있는 것을 들고옴
		Hello obj2 = (Hello) context.getBean("hello2");
		System.out.println(obj2); // 이렇게 찍으면 주소값이 동일함, 만들어진거 재사용한 것
		System.out.println("obj2 : " + obj2);
		
		
		// 근데 매번 명시적 형변환 쓰는거 귀찮은데..
		// "hello2"는 Hello 클래스야 => 이렇게하면 제네릭으로 Hello형으로 변경된다
		// 명시적 형변환 써도 되고, getBean으로 얻을 때 제네릭으로
		// Hello obj2 = context.getBean("hello2", Hello.class);
	}
}
