package set_get;

import java.util.Scanner;

class TestClass06{
	private int max,min;
	public void setMax(int max) {
		this.max = max;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return this.max;
	}
	public int getMin() {
		return this.min;
	}
	public void maxFunc(int a, int b, int c) {
		int max = a;
		if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		this.max = max;
	}
	public void minFunc(int a, int b, int c) {
		int min = a;
		if(min > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		this.min = min;
	}
	
}

public class MainClass06 {
	public static void main(String[] args) {
//		세 개의 정수를 전달받아, 최대값과 최소값을 구하는 메서드를 만들어보자.
//		최대값,최소값 인스턴스 변수로 선언 set,getter 생성 후 getter 통해 main에서 출력 
		TestClass06 t = new TestClass06();
		Scanner input = new Scanner(System.in);
		int a,b,c;
		System.out.print("정수 3개 입력 : ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		t.maxFunc(a, b, c);
		t.minFunc(a, b, c);
		System.out.println("최대값 : " + t.getMax());
		System.out.println("최소값 : " + t.getMin());
		
		
		
	}
}
