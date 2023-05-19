package set_get;
class TestClass03{
	private String name;
	private int age;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
}
public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.setName("홍길동");
		System.out.println(t.getName());
		t.setAge(10);
		t.getAge();
		
	}
}
