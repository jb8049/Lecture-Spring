package di.xml02;

public class Car {
	
	// 다른 객체를 멤버변수로 가지고 있으면 의존 관계
	private Tire tire;

	
	public Car() {
		System.out.println("Car() 호출...");
	}

	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(Tire) 호출...");
	}
	
	// constructor arg 생성자를 통해 의존 주입
	public Car(Tire tire1, Tire tire2) {
		System.out.println("Car(Tire,Tire) 호출...");
	}
	
	public Car(Tire tire, String str) {
		System.out.println("Car(Tire, String) 호출...");
		System.out.println("str : " + str);
	}


	public void prnTireBrand() {
		
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}
}
