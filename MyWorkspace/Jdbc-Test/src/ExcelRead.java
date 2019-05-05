//Excel data read
//driver: Type-1(jdbc-odbc bridge)
//database:Excel workbook
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExcelRead {

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:odbc:XLDSN");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from [Sheet1$]");
		
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		rs.close();
		stmt.close();
		con.close();

	}

}
