//TransactionTest
//Transaction Management
//driver:type-4(oracle thin driver)
//database:oracle 11g
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class TransactionTest
{

	public static void main(String[] args)throws Exception
	{
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","amit");
	     Statement stmt=con.createStatement();
	     //disable automatic mode
	     con.setAutoCommit(false);
	     try
	     {
	    	 stmt.executeUpdate("insert into student values(101,'sumit',699)");
	    	 stmt.executeUpdate("insert into student values(102,'suman',600)");
	    	 stmt.executeUpdate("insert into student values(103,'amit',500)");
	    	 stmt.executeUpdate("insert into student values(104,'anil',699)");
	    	 stmt.executeUpdate("insert into amit values(101,'sumit',10000,10)");
	     con.commit();
         System.out.println("Transaction commited");
	     
	     
	     }
	     catch(Exception e)
	     {
	    	 con.rollback();
	    	 System.out.println("Transaction cancelled");
		     
	    	 
	     }
	 stmt.close();
	 con.close();

	}

}
