package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		int[][] mathScores = new int[2][3]; //2�� 3���� ������ �迭 ����
		mathScores[1][2] = 10;
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("mathScores[%d][%d] = %d\n", i, j, mathScores[i][j]);
			}
		}
		
		System.out.println();
		
		int[][] englishScores = new int[2][]; //���� ���� �����Ͽ� ��ܽ� �迭 �����
		englishScores[0] = new int[2]; // 0, 1�� �ǹǷ� 2�� ����� �� ���⿡ ������ ���.
		englishScores[1] = new int[3];
		englishScores[0][1] = 500;
		for(int i=0; i<englishScores.length; i++) {
			//for(int j=0; j<3; j++)
			for(int j=0; j<englishScores[i].length; j++) {
				System.out.printf("englishScores[%d][%d] = %d\n", i, j, englishScores[i][j]);
			}
		}
		
		System.out.println();
		
		int[][] javaScores = {{95, 80}, {92, 96, 80}}; //��������� ������ ��ܽı��� �迭 
		for(int i=0; i<javaScores.length; i++) {
			for(int j=0; j<javaScores[i].length; j++) {
				System.out.printf("englishScores[%d][%d] = %d\n", i, j, javaScores[i][j]);
			}
		}
	}

}
