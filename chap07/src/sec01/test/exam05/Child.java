package sec01.test.exam05;

public class Child extends Parent{
	private String name;
	
	public Child() {
		// �� �ڸ��� super()�� �����Ǿ� �־ �θ�Ŭ������ ȣ���Ѵ�.
		this("ȫ�浿");
		System.out.println("Child() Call");
		this.run();
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
	
	void run() {
		this.run("������");
		System.out.println("run() call");
	}
	
	void run(String s) {
		System.out.println("run(String s) call");
	}

}
