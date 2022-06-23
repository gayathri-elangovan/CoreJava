package sample;



import java.sql.*;

public class JDBCExample {
	public static void main(String[] args) {
		try{  
			  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/StudentDB","root","yuva962219");  
			
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from student");  
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
			con.close();  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
	}  
}



