package di.anno03;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car2 {

//  이름매칭부터 먼저하는 리소스 => 퀄리파이어가 있더라도 name부터 찾음
//	@Resource(name="hankookTire")
//	@Qualifier("kumhoTire")
//	@Resource // 리소스는 이름 매칭부터 함 => tire이름으로 해놓은 nexenTire => 근데 이거는 Tire타입이 아니다!! 그래서 바로 에러남=> 퀄리파이어 가기전에 오류남
//	@Qualifier("kumhoTire")
	private Tire tire;
	
	public Car2() {
		System.out.println("Car2()...");
	}
	
	@Resource(name="hankookTire")
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire()..");
	}

	public void prnTireBrand() {
		
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}
}
