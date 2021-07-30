package di.calculator01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyCalculator {
	
	//멤버 변수에 직접 값 대입
	@Autowired
	private Calculator cal; // 계산 결과 전달
	
	public MyCalculator() {
		
		System.out.println("MyCalculator()...");
		
	}
	
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
