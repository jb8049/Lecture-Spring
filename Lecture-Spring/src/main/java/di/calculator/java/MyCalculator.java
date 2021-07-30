package di.calculator.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mycal")
public class MyCalculator {
	
	private Calculator cal;
	
	public MyCalculator() {
		
		System.out.println("MyCalculator()...");
	}
	
	@Autowired
	@Qualifier("cal")
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
