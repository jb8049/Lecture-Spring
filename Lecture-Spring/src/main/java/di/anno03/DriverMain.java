package di.anno03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

public class DriverMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("di-anno03.xml");
		
		//@component로 만들어주면, 별다른 구분 없으면, 클래스명에서 앞에만 소문자로
		
		//Car car = context.getBean("car", Car.class);
		// car.prnTireBrand();
		
		// @Component("myCar")로 만들 수 있음
		// Car car = context.getBean("myCar", Car.class);
		// @Component 이름을 바꿔주는건 비효율적.. => @Qualifier
		// @Component("tire")로 쓰면, car에 맞춰서 변경해준건데
		// 금호 -> 한국으로 변경하고 싶으면, 금호 이름 tire지우고, 다시 한국타이어 쪽에 tire로 지정해줘야함
		
		Car2 car2 = context.getBean("car2", Car2.class);
		car2.prnTireBrand();
	}
	
	
	
	
	
	
}
