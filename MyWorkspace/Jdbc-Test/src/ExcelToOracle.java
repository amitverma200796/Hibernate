import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExcelToOracle {

	public static void main(String[] args) throws Exception
	{
		Connection con1=DriverManager.getConnection("jdbc:odbc:xldsn");
		Statement stmt=con1.createStatement();
		ResultSet rs=stmt.executeQuery("select * from [Sheet1$]");
		Connection con2=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","amit");
		PreparedStatement pstmt=con2.prepareStatement("insert into products values(?,?,?)");
	while(rs.next())
	{
		pstmt.setInt(1,rs.getInt(1));
	    pstmt.setString(2,rs.getString(2));
	    pstmt.setInt(3,rs.getInt(3));
	pstmt.executeUpdate();
	System.out.println("Record copy");
	}
	stmt.close();
	rs.close();
	pstmt.close();
	con1.close();
	con2.close();
	
	
	

	}

}
