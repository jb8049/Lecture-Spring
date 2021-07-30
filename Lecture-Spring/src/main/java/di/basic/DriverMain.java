package di.basic;

public class DriverMain {
	
	public static void main(String[] args) {
		
		// 이렇게 외부에서 객체를 생성해서, 의존성을 가지고 있는 Car를 실행할 때
		HankookTire han = new HankookTire();
		KumhoTire kum = new KumhoTire();
		
		// 생성자를 통해 객체를 외부에서 주입하겠다
		// DI(의존 주입) : 생성자 주입
		
//		Car car = new Car(kum);
//		car.prnTireBrand();
		
		//내가 자동차를 그냥 한 대 만들었어, 타이어는 가지고 있는 것을 넣어주고 싶다
		Car car = new Car();
		//내가 가지고 있는 타이어를 끼운다 => set을 써서 사용
		
		car.setTire(han); //setter 주입 방식
		car.prnTireBrand();
		
		// 이렇게 하면, 좋은 부분은 뭘까??
		// 코드를 고칠 필요없다! 변화에 민감하지 않다!
		// 넥센 타이어를 넣고 싶은데, 외부에서 만들어서 넣어주면 끝
		// 다른 것을 만들어서 넣어도, 기존 코드를 수정할 필요없음
		// 의존 주입을 받는 Car입장에서는 넥센이든 금호든 한국타이어든 상관없다
		// 그냥 Tire형이기 때문임
		
//		NexenTire nexen = new NexenTire();
//		Car car2 = new Car();
//		car2.setTire(nexen);
//		car2.prnTireBrand();
	}
	
	
	
	
	
	
}
