package di.calculator02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cal")
public class Calculator {
	
	private int a ;
	private int b ;
	
	// component scan으로 객체 생성할 때는 bean에 직접 value를 전달하지 않으니까
	public Calculator(@Value("300") int a, @Value("33") int b) {
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
