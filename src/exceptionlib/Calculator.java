package exceptionlib;

import java.util.Scanner;

public class Calculator {
	
	public static int add(int x,  int y){
		int result = x+y;
		return result;
	}
	
	public static int sub(int x, int y){
		int result = x-y;
		return result;
	}
	public static int multi(int x, int y){
		int result = x*y;
		return result;
	}
	public static int div(int x, int y) throws 영으로나눈예외오류, 범위를벗어난오류{ //throws는 여러개의 오류 상황에 대해 처리 할 수 있다.
																							//EX) throws 영으로나눈오류,영으로나눈또다른오류
		if(y==0)
			throw new 영으로나눈예외오류();
		
		if(!(0<=x && x<=100))
			throw new 범위를벗어난오류();
	
		int result = x/y;
		return result;
	}
}
