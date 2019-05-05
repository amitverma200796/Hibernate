//SavepointTest.java
//Save point
//driver:type-4(oracle thin driver)
//database:oracle 11g
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.Statement;




public class SavepointTest 
{

	public static void main(String[] args)throws Exception
	
	{
		// TODO Auto-generated method stub
		
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","amit");
	Statement stmt=con.createStatement();
	//disable autocommit mode
	con.setAutoCommit(false);
	int i=0;
	Savepoint sp=null;
	try
	{
		stmt.executeUpdate("insert into loan values(104,'home',10000)");
		stmt.executeUpdate("update emp set sal=111111 where empno=7788");
		sp=con.setSavepoint();
		i=1;
		stmt.executeUpdate("delete from amit where id=101");
		con.commit();
		System.out.println("entire table is committed");
	}
	catch(Exception e)
	{
		if(i==1)
		{
			con.rollback();
			con.commit();
			System.out.println("Below savepont are cancelled and above savepoint are committed");
		}
		else
		{
			con.rollback();
			System.out.println("Entire transaction is cancelled");
		}
	}
stmt.close();
con.close();
	}

}
