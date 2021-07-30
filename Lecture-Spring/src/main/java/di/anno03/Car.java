package di.anno03;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Car {
	
	// @component로 만든 한국타이어 객체를 주입
	
	// 
	// @Autowired(required = False) 주입하려는 객체가 없으면, 그냥 'null'로 비워둬라는 의미
	@Autowired
	@Qualifier("kumhoTire")
	private Tire tire;
	
	
	public Car() {
		System.out.println("Car()...");
	}
	
	
//	@Qualifier 이렇게 쓰면 에러남=> 생성자는 파라미터를 여러 개 넣을 수 있으니까
//  파라미터에 각각 하나씩 설정해야함
	@Autowired
	public Car(@Qualifier("hankookTire") Tire tire) {
		this.tire = tire;
		System.out.println("Car(Tire)...");
	}
	
//	@Autowired
//	@Qualifier("kumhoTire")
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire()..");
	}

	public void prnTireBrand() {
		
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}
}
