package variable;

import java.util.Scanner;

public class TestClass07 {
	private int age = 0;
	private String name = null;
	
	/*
	  입력, 출력, 만으로 연산하는 각각의 기능을 만드세요
	  변수는 인스턴스 변수로 변경하여 사용하세요
	*/

	public void input_() {
		Scanner input = new Scanner(System.in);
		System.out.println("이름 입력");
		name = input.next();
		System.out.println("나이 입력");
		age = input.nextInt();
	}
	public void age_() {
		age = age-1;
	}
	public void output() {
		System.out.println("이름 : " + name);
		System.out.println("만 나이 : " + age);
	}
}
/*
 public class TestClass08 { //MainClass08
 	private String name, grade;
 	private int kor, eng, math, sum;
 	private double avg;
 	
 입력, 연산, 출력 기능을 만들어 주세요
 입력 : 이름, 국, 영, 수
 연산 : 합을 구하는 기능, 평균을 구하는 기능, 등급을 구하는 기능
 출력 : 이름, 국, 영, 수, 합, 평균, 등급
 등급 : 평균이 90이상 A, 80이상 B 나머진 C
 */

