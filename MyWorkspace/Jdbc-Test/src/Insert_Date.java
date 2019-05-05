//Insert_Date.java
//insert a row with date
//driver:type-4(oracle thin driver)
//database:oracle 11g
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Scanner;
class Insert_Date
{
	public static void main(String[] args)throws Exception
	
	{
		// TODO Auto-generated method stub
		
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","amit");
	PreparedStatement pstmt=con.prepareStatement("insert into medical values(?,?,?)");
	Scanner s=new Scanner(System.in);
	System.out.println("enter id");
	int id=Integer.parseInt(s.nextLine());
	System.out.println("enter medicine name");
	String medicine=s.nextLine();
	System.out.println("enter mfg date(dd-MM-yyyy)");
	String mfgdate=s.nextLine();
	//convert String to java.util.Date
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	java.util.Date d1=sdf.parse(mfgdate);
	//conver java.util.Date to java.sql.Date
	long ms=d1.getTime();
	java.sql.Date d2=new java.sql.Date(ms);
	//set values
	pstmt.setInt(1,id);
	pstmt.setString(2,medicine);
	pstmt.setDate(3,d2);
	int i=pstmt.executeUpdate();
	System.out.println(i+"row inserted");
	pstmt.close();
	con.close();
	

	
	}
}
