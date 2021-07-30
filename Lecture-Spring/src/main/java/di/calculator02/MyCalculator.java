package di.calculator02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// 클래스의 이름을 "my"로 지정해서 main에서 편하게 부를 수 있음 
@Component("my")
public class MyCalculator {
	
	private Calculator cal; // 계산 결과 전달
	
	public MyCalculator() {
		
		System.out.println("MyCalculator()...");
		
	}
	
	@Autowired
	@Qualifier("cal")  // Calculator @component의 이름
	public void setCal(Calculator cal) {
		this.cal = cal;
	}

	
	public void printResult() {
		
		System.out.println("(+)연산 : "+ cal.getSum());
		System.out.println("(-) 연산 :" + cal.getSub());
		System.out.println("(*) 연산 :" + cal.getMul());
		System.out.println("(%) 연산 :" + cal.getDiv());
	}
	
	
	
	
}
