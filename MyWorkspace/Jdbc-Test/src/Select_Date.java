//Select_Date.java
//select mfgdate of medical table
//driver:type-4(oracle thin driver)
//database:oracle 11g
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.sql.SQLException;
public class Select_Date
{

	public static void main(String[] args) 
	
	{      Connection con=null;
	       Statement stmt=null;
		try
		{
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","amit");
	      stmt=con.createStatement();
	      ResultSet rs=stmt.executeQuery("select mfgdate from medical where id=123");
	      //ResultSet object has one row with one column
	      //move cursor to next row
	      rs.next();
	      //read data from ResultSet
	      java.util.Date d=rs.getDate(1);
	      //convert data object to String
         SimpleDateFormat sdf=new SimpleDateFormat("EEEE,dd,'th'MMMM,yyyy");
         //SimpleDateFormat convert String to Date and date to String
         //parse();string-->Date object
         //Format(); Date object-->String
         String str=sdf.format(d);
         System.out.println(str);
         rs.close();
		}
        catch(SQLException ex1)
		{
        	System.out.println(ex1);
		}
		catch(Exception ex2)
		{
			System.out.println(ex2);
		}
		finally
		{
			try
			{
				if(stmt!=null)
					stmt.close();
				if(con!=null)
					con.close();
			}
			catch(Exception ex3)
			{
				System.out.println(ex3);
			}
		}
		
		
	}

}
