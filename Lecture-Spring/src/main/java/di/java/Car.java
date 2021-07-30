package di.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	@Qualifier("hankook")  // Tire 객체 두 개일 때, 이렇게 지정해줘야함
	private Tire tire;
	
	public Car(Tire tire) {
		this.tire = tire;
	}
	
	public Car() {
		System.out.println("Car()...");
	}
	
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire()..");
	}

	public void prnTireBrand() {
		
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}
}
