package di.xml02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {
	
	public static void main(String[] args) {
		
		// 여기서 바로 new해서 객체 생성됨
		ApplicationContext context = new GenericXmlApplicationContext("di-xml02.xml");
		
		//Car car = context.getBean("car", Car.class);
		//car.prnTireBrand();
		
		/*Tire tire = new HankookTire();
		Car car = new Car(tire);
		car.prnTireBrand();*/
		
		
	}
	
	

}
