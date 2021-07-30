package di.anno02;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	// 리소스는 이름매칭 부터 먼저함..(이름매칭 => 타입매칭)
	// 넥센 => tire로 설정, 넥센은 Tire객체가 아님.. 이거부터 매칭 됨
	// @Autowired는 타입매칭 => 이름매칭
	
	@Resource
	private Tire tire;
	
	
	public Car() {
		System.out.println("Car()...");
	}
	
//	@Resource 리소스는 생성자에 사용하면 에러남
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(Tire)...");
	}
	
//	@Resource
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire()..");
	}

	public void prnTireBrand() {
		
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}
}
