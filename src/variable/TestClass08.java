package variable;

import java.util.Scanner;

public class TestClass08 {
	private String name, grade;
 	private int kor, eng, math, sum;
 	private double avg;
 	public void input() {
 		Scanner sc = new Scanner(System.in);
 		System.out.print("이름 입력 : ");
 		name = sc.next();
 		System.out.print("국어점수 입력 : ");
 		kor = sc.nextInt();
 		System.out.print("영어점수 입력 : ");
 		eng = sc.nextInt();
 		System.out.print("수학점수 입력 : ");
 		math = sc.nextInt();
 	}
 	public void sumFunc() {
 		sum = kor + eng + math;
 	}
 	public void avgFunc() {
 		avg = sum / 3.0;
 	}
 	public void gradeFunc() {
 		if(avg >= 90) {
 			grade = "A";
 		}else if(avg >= 80) {
 			grade = "B";
 		}else {
 			grade = "C";
 		}
 	}
 	
 	public void print() {
 		sumFunc();
 		avgFunc();
 		gradeFunc();
 		System.out.println("이름 : " + name);
 		System.out.println("국어 : " + kor);
 		System.out.println("영어 : " + eng);
 		System.out.println("수학 : " + math);
 		System.out.println("합 : " + sum);
 		System.out.println("평균 : " + avg);
 		System.out.println("등급 : " + grade);
 		
 	}
 	
// 입력, 연산, 출력 기능을 만들어 주세요
// 입력 : 이름, 국, 영, 수
// 연산 : 합을 구하는 기능, 평균을 구하는 기능, 등급을 구하는 기능
// 출력 : 이름, 국, 영, 수, 합, 평균, 등급
// 등급 : 평균이 90이상 A, 80이상 B 나머진 C
}
