package sec01.test.exam05;

public class Parent {
	private String nation;
	
	public Parent() {
		this("���ѹα�");
		System.out.println("Parent() Call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String name) Call");
	}
}
