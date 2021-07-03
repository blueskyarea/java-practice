package practice.interfaces;

public class Client {
	
	public static void main(String[] args) {
		//Dao dao = new MySqlDao();
		Dao dao = new PostgresDao();
		new Client().getData(dao);
	}
	
	private void getData(Dao dao) {
		dao.getAll().forEach((key, value) -> {
			System.out.println(key + ":" + value);
		});
	}
}
