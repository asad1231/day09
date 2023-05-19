package variable;
class Testclass03{
	int num;
	public void test01() {
		num = 1000;
		System.out.println("test01 : " + num);
	}
	public void test02() {
		System.out.println("test02 : " + num);
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		Testclass03 t = new Testclass03();
		t.test01();
		t.test02();
		System.out.println("static : " + TestClass04.num);
	}
}
