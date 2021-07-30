package di.anno01;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	// 멤버 변수에도 붙일 수 있다
	// 생성자 주입이나 setter 주입을 하지 않아도 주입이 일어남!
	// annotation 자동 주입이 나오면서 멤버 변수에 바로 연결시키는 방식을 많이 쓰게됨
	//	Car()...
	//	장착된 타이어 : 한국타이어

	// 주입되려는 tire 객체가 2개이면?
	// 우선은 type매칭 => 2개네 => 이름 매칭
	// 1. 타입 매칭 2. 이름 매칭(넥센 타이어는 Tire를 상속x)
	
	// 자동주입을 만들어주면 좋은점!!
	// 처음에 한국타이어를 만들었는데! 금호타이어로 변경했음!
	// 시스템이 변경됨 => bean에서 HankookTire => KumhoTire로 변경하면됨, 실행할 클래스명만 변경하면됨
	// 매우 유연하게 변경할 수 있음
	
	@Autowired 
	private Tire tire;
	
	public Car() {
		System.out.println("Car()...");
	}
	
//	@Autowired
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(Tire)...");
	}
	// setter에 autowired를 넣을 수 있음, 기본생성자 없으면 에러..
	// 기본생성자 호출하고, setter를 호출하니까!,
	// setter 주입은 반드시 기본 생성자를 가지고 있어야함
//	@Autowired
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire()..");
	}

	public void prnTireBrand() {
		
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}
}
