package sec02.exam03;

public class Test03 {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.printf("arr1[%d]: %d\n",i ,arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
			System.out.printf("arr1[%d]: %d\n",i ,arr1[i]);
		}
		System.out.println();
		
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.printf("arr2[%d]: %.2f\n",i ,arr2[i]);
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {
			System.out.printf("arr2[%d]: %.2f\n",i ,arr2[i]);
		}
		System.out.println();
		
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.printf("arr3[%d]: %s\n",i ,arr3[i]);
		}
		arr3[0] = "1��";
		arr3[1] = "2��";
		arr3[2] = "3��";
		for(int i=0; i<3; i++) {
			System.out.printf("arr3[%d]: %s\n",i ,arr3[i]);
		}
		System.out.println();
	}

}