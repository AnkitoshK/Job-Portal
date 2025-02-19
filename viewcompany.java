import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;

public class viewcompany extends JFrame
{

 	TextField text1,text2,text3;
 	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	Object	data[];
  	JTable table;
	public  viewcompany() throws Exception
	{
		Container container = getContentPane();
		container.setLayout(new GridLayout());
		Vector vColumns = new Vector();
		vColumns.add("ID" );
		vColumns.add("NAME");
		vColumns.add("ADDRESS");
		vColumns.add("MOBILE");
		vColumns.add("ADHAR");
		vColumns.add("EDUC ATION");
		vColumns.add("STATUS");




		try
		{
  			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:job","","");
			String sql2="select * from registration ";

			stmt=con.createStatement(rs.TYPE_SCROLL_SENSITIVE,rs.CONCUR_UPDATABLE);
			rs=stmt.executeQuery(sql2);
			rs.beforeFirst();

			Vector vData = new Vector();


			while(rs.next())
			{
                Vector v = new Vector();
				v.add(rs.getInt(1));
				v.add(rs.getString(2));

                v.add(rs.getString(3));

				v.add(rs.getString(4));
				v.add(rs.getString(5));
				v.add(rs.getString(6));

				v.add(rs.getString(7));

				vData.add(v);




			}


			JTable table=new JTable(vData,vColumns);

			JScrollPane jsp=new JScrollPane(table);
			add(jsp);


		}catch(Exception e)
			{
				System.out.println("error"+e);
			}
		this.setVisible(true);
		this.setSize(500,500);
		setTitle("Customer Report");
    }

}
