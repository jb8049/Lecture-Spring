package di.xml01;

public class Car {
	
	// 다른 객체를 멤버변수로 가지고 있으면 의존 관계
	private Tire tire;
	private Tire frontL;
	private Tire frontR;
	private Tire backL;
	private Tire backR;
	
	public Car() {
		//타이어는 이미 있어, 자동차만 만들어주세요
	}
	
	public Car(Tire tire) {
		this.tire = tire;
		
	}
	
	//setter 주입
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire(Tire) 호출");
	}
	
	
	public void setFrontL(Tire frontL) {
		this.frontL = frontL;
		System.out.println("setFrontL(Tire) 호출");
	}



	public void setFrontR(Tire frontR) {
		this.frontR = frontR;
		System.out.println("setFrontR(Tire) 호출");
	}



	public void setBackL(Tire backL) {
		this.backL = backL;
		System.out.println("setBackL(Tire) 호출");
	}



	public void setBackR(Tire backR) {
		this.backR = backR;
		System.out.println("setBackR(Tire) 호출");
	}



	public void prnTireBrand() {
		
		System.out.println("장착된 타이어 : " + tire.getBrand());
		System.out.println("장착된 frontL 타이어 : " + frontL.getBrand());
	}
}
