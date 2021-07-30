package di.anno03;

import org.springframework.stereotype.Component;

@Component
public class HankookTire implements Tire {
	
	public HankookTire() {
		// 객체 생성된거 확인
		System.out.println("HankookTire()...");
		
	}
	
	
	public String getBrand() {
		
		return "한국타이어";
	}

}
