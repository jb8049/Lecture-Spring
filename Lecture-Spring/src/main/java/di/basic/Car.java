package di.basic;

public class Car {
	
	//의존관계 설정, 다른 객체를 멤버 변수로 가지고 있으면 의존 관계가 설정된 것
	private Tire tire;
	
	// 이미 만들어진 객체를 외부에서 주입받겠다!==> 이것이 생성자 주입이다!
	public Car(Tire tire) {
		this.tire = tire;
	}
	
	//타이어가 없는 자동차 만들어보기
	public Car() {
		
	}
	
//	public Car() {
//		의존관계 설정을 누구로 할 것인지, Car를 만들 때 Tire가 필요함
//		tire = new HankookTire();
//		tire = new KumhoTire();
//	}
	
	
	// 내가 이미 가지고 있는 타이어로 자동차 제작
	// DI(의존주입) : setter 주입
	
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire()..");
	}

	public void prnTireBrand() {
		
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}
}
