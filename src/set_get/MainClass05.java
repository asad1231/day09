package set_get;

import java.util.Scanner;

/*
 로그인 프로그램 만들어 주세요
 LoginClass
 	private id, pwd
 	각 set, getter생성 및 연산하는 기능
 MainClass
 	보여지는 기능을 만들자
 	1.로그인
 	2.회원가입
 	3.종료
 */
class LoginClass{
	private String id = null,pwd = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void login_() {
		String id,pwd;
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		id = sc.next();
		System.out.print("비밀번호 : ");
		pwd = sc.next();
		if(this.id != null && id.equals(this.id) ) {
			if(pwd.equals(this.pwd)) {
				System.out.println("로그인 성공");
			}
		}else {
			System.out.println("로그인 실패");
		}
	}
	public void signup() {
		String id,pwd;
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		id = sc.next();
		System.out.print("비밀번호 : ");
		pwd = sc.next();
		if(!id.equals(this.id)) {
			setId(id);
			setPwd(pwd);
			System.out.println("회원가입 완료");
		}else {
			System.out.println("존재하는 회원");
		}
	}
	
	
}
public class MainClass05 {
	public static void main(String[] args) {
		LoginClass t = new LoginClass();
		Scanner sc = new Scanner(System.in);
		int n;
		String id,pwd;
		while(true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.종료");
			n = sc.nextInt();
			switch(n) {
			case 1 : 
	 	     		 t.login_();
					 break;
					 
			case 2 : 
			 		 t.signup();
			 	     break;
			 	     
			case 3 : System.out.println("프로그램을 종료합니다.");
					   System.exit(1);
			}
		}
	}
}
