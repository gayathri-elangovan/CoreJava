package sample;

public class DBConnection {
	private static DBConnection dbInstance=null;
	private DBConnection()
	{
	}
	public static DBConnection getInstance()
	{
		if(dbInstance==null)
		{
			dbInstance=new DBConnection();
			System.out.println("New Instance.");
		}
		else
		{
			System.out.println("Same Instance.");
		}
		return dbInstance;
	}

}
