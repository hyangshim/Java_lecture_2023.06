package ch08_interface.sec04_example;

public class Main {
	public static void main(String[] args) {
		dbwork(new MySQLDaoImpl());
		dbwork(new OracleDaoImpl());
	}
	
	private static void dbwork(DataAccessobject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

}
