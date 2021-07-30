package di.calculator.java;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cal")
public class Calculator {
	
	private int a ;
	private int b ;
	
	public Calculator(@Value("100") int a , @Value("33") int b) {
		this.a = a;
		this.b = b;
		System.out.println("Calculator()...");
	}
	
	public int getSum() {
		return a+b;
	}
	
	public int getSub() {
		return a-b;
	}
	
	public int getMul() {
		return a*b;
	}
	
	public int getDiv() {
		return a/b;
	}
	
}
