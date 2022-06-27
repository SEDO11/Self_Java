package chap08.sec02.test;

public class DaoExample {
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		// �ڵ� Ÿ�� ��ȯ
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

}
