package practice.anonymous;

public class TryAnonymous {

	public static void main(String[] args) {
		new TryAnonymous().execute();
	}
	
	public void execute() {
		// normal class
		MySqlDao mySqlDao = new MySqlDao();
		System.out.println(mySqlDao.getData());
		
		// anonymous class
		Dao mySqlDao2 = new Dao() {
			@Override
			public String getData() {
				return "MySql data from anonymous class";
			}
		};
		System.out.println(mySqlDao2.getData());
	}
	
	interface Dao {
	    String getData();
	}
	
	class MySqlDao implements Dao {
		@Override
		public String getData() {
			return "MySql data from MySqlDao.class";
		}
	}
}
