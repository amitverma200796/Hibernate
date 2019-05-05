import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRow 
{

	public static void main(String[] args)
	{
		Connection con=null;
		Statement stmt=null;
		
		try
		{
      con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","amit");
     stmt=con.createStatement();
     String sql="delete from amit where id=101";
     int i=stmt.executeUpdate(sql);
     System.out.println(i+"row delete");
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
			}}
	}
}
