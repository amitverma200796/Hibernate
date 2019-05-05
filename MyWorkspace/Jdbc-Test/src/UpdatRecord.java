import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdatRecord 
{

	public static void main(String[] args)
	{
		Connection con=null;
		Statement stmt=null;
	try
	{
	 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","amit");	
	 stmt=con.createStatement();
		String sql="update emp set sal=9000 where empno=7788";
		int i=stmt.executeUpdate(sql);
		System.out.println(i+"row updated");
		
		}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	finally
	{
	try
	{
		
	 stmt.close();
	 con.close();
	}
	catch(Exception ex)
	{
		System.out.println(ex);
	}
	}

}
}