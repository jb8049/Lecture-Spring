package aop.age;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service //component scan으로 실행했으니까, new해서 만들고 싶은 것은 이런거 적어줘야지
@Aspect
public class MyAspect {
	
	
	// execution(* aop.age.*.setAge(..)) 이 부분 주의하기, 필수 항목 잘써주기
	// setAge(..)으로 넘어오는 나이 인자 알아야함 JoinPoint

//	@After("execution(* aop.age.*.setAge(..))")
	// Before와 After바꿔 보았음 =>around로 가보자
	
	// 공통 코드가 실행되는 시점이 핵심 코드 전에 실행 => @Before
	// 인자가 전달되는거는 Before, After 상관없네, 실행할 때부터 인자를 가지고 있음
	
//	@After("execution(* aop.age.*.setAge(..))")
	public void checkAdult(JoinPoint joinPoint) {
		
		System.out.println(joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());
//		System.out.println(joinPoint.getThis());
		
		//getArgs의 리턴값이 오브젝트 배열로 나옴
		
		//toString으로 찍었더니 내가 전달한 인자가 잘나옴
		System.out.println(Arrays.toString(joinPoint.getArgs()));
		
		// joinPoint.getArgs()는 전달한 인자를 오브젝트 배열 형태로 반환함
		Object[] args = joinPoint.getArgs();
		
		// 조건문 사용하기 위해 String형을 int형으로 다시 변환
		int age =Integer.parseInt(args[0].toString());
		
		if(age <20) {
			System.out.println("미성년입니다.");
		}else {
			System.out.println("성년입니다.");
		}
		
		//중고등 학생 체크 형태는 getThis나 getTarget으로 받아서 실행되고 있는 클래스를 알 수 있음
		//실행되고 있는 대상을 알 수 있음!!, Man클래스인지 Student 클래스인지 확인할 수 있음
		
	}
	
	// Around는 대상 객체의 메서드 실행 전, 후 또는 익셉션 발생 시점에 공통 기능을 실행
	// Before, After를 컨트롤 할 수 있는 Around
	// Around 로 가져오면, 일단 핵심 코드 말고, 공통 부분 => checkAdult2()이 메소드 실행해, 설정해야함
	
	@Around("execution(* aop.age.*.setAge(..))")
	public void checkAdult2(ProceedingJoinPoint joinPoint) throws Throwable {
		
//		joinPoint.proceed();
		System.out.println("checkAdult2");
		
		//setAge 메소드를 실행해줘, 라고 해야 setAge가 실행됨
		
		// System.out.println("checkAdult2"); //공통코드 실행
		// joinPoint.proceed();  //핵심 코드 실행
		// 이렇게 하면, before임, 핵심 코드 실행전에 공통코드 실행
		
// 		이거는 after 핵심 메소드 실행 후 공통 메소드 실행함
//		joinPoint.proceed(); 
//		System.out.println(Arrays.toString(joinPoint.getArgs()));
		
		// setAge()가 만약 리턴값이 있다면?? //joinPoint.proceed(); Object형으로 받아와야함
		
		// After로 해봤음 (핵심 코드 실행 => 공통 코드 실행)
		
//		joinPoint.proceed();
//		Object[] args = joinPoint.getArgs();
		
//		int age = Integer.parseInt(args[0].toString());
//		if(age <20) {
//			System.out.println("미성년입니다.");
//		}else {
//			System.out.println("성년입니다.");
//		}
	}
	
	// 예외가 발생했을 때 이 부분이 실행됨
	@AfterThrowing(pointcut="(* aop.age.*.setAge(..))", throwing="ex")
	public void error(JoinPoint joinPoint, Throwable ex) {
		System.out.println("예외 처리 : " + ex.toString());
	}
}
