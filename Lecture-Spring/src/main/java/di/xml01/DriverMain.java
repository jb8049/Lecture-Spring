package di.xml01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {
	
	public static void main(String[] args) {
		
		//setter 주입해보자 => 얘는 자동차 만들어질 떄 타이어 없어
		//한국타이어를 넣어보자
//		Tire tire = new HankookTire();
//		Car car = new Car(tire);
		//car.setTire(tire);
		//car.prnTireBrand();

		// 이제 스프링 컨테이너로 만들어보자
		// 일단, 내가 직접 객체를 만들지 않아야지
		
		ApplicationContext context = new GenericXmlApplicationContext("di-xml01.xml");
		
		// 방법1
		// Car car = (Car)context.getBean("car");
		
		// Hello obj2 = context.getBean("hello2", Hello.class);
		//	Car car = (Car)context.getBean("car");
		
//		Tire tire = (Tire)context.getBean("tire"); //한국타이어 객체 생성
//		car.setTire(tire);
//		car.prnTireBrand();
		
		// car라는 인스턴스 객체를 만들면서, setter 주입을 하고 싶다!
		// 스프링 컨테이너에서 애초에 설정하고 싶다 => .xml로
		
		//  방법2, xml에 설정한 car2는 생성하면서 setter주입도 함께, property를 설정
		Car car2 = (Car)context.getBean("car2");
		car2.prnTireBrand(); // 금호타이어 하고 싶으면, xml에서 ref를 kumho로 설정하면 됨

		
	}
	
	

}
