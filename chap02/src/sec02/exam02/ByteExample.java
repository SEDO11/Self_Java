package sec02.exam02;
// byte 오버플로우 byte = -128 ~ 127 까지 표현가능
public class ByteExample {

	public static void main(String[] args) {
		
		byte var1 = -128;
		byte var2 = 0; 
		byte var3 = 127;
		// byte var4 = 200; // 오버플로우로 인해 오류가 뜬다.
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);

	}

}
