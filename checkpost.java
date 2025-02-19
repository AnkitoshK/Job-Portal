import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.*;
class checkpost extends JFrame implements ActionListener,ItemListener
{
   private DefaultTableModel mod;
   private JTable tab;

	String str1="";
	String url="jdbc:odbc:job";
    Connection con;
    Statement st;
    ResultSet rs;
    JButton b1,b2,b3;
    //List li1;
    JComboBox cb1;
      JFrame jf;


    checkpost()
    {
          JLabel lb1;

          ;
         jf= new JFrame(" Retrieve Post Info By Name");
          jf.setLayout(null);
         jf.setSize(700,500);
         jf.setResizable(true);
         try
         {
         	 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         	 con=DriverManager.getConnection(url," "," ");
         	 st=con.createStatement();
         }
         catch(Exception e)
         {
         	System.out.println("error"+e);
         }
         jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

         //* table creation *//

         mod= new DefaultTableModel();
         mod.addColumn("no");
         mod.addColumn("name");
         mod.addColumn("post");
         mod.addColumn("seats ");
         mod.addColumn("Qualification");


         tab= new JTable(mod);
         JScrollPane jp = new JScrollPane(tab , ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	     jp.setBounds(20,150,600,200);
         jf.add(jp);



         lb1= new JLabel("Select post Name",JLabel.LEFT);

         cb1= new JComboBox();
         //li1= new List();
         b1= new JButton("Show");
         b1.setBounds(320,50,100,30);
         b2= new JButton("Reset");
         b2.setBounds(450,50,100,30);
         b3= new JButton("Cancel");
         b3.setBounds(560,50,100,30);

         lb1.setBounds(10,50,150,30);
         cb1.setBounds(160,50,130,30);
         //li1.setBounds(20,100,500,300);
         try
		    {
		    		ResultSet rsc=st.executeQuery("select * from company");
			    	while(rsc.next())
			        {

			        	cb1.addItem(rsc.getString("post"));

			        }

			        rsc.close();
          }

        catch(SQLException e)
     	    {

			   System.out.println("SQL Combo" + e);
	   		}



         jf.add(lb1);
         jf.add(cb1);
         //jf.add(li1);
         jf.add(b1);
         jf.add(b2);
         jf.add(b3);
         jf.setVisible(true);
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         cb1.addItemListener(this);
   }
  public void actionPerformed(ActionEvent ae)
   {

   	 if(ae.getSource()==b1)
   	  {

   	     	int k=0;

		try
   	    {
   	  	str1="select * from company where post='"+ cb1.getSelectedItem() +"' ";
   	  	rs=st.executeQuery(str1);
   	  	while(rs.next())
   	  	{
   	  		         int tno1=rs.getInt("ID");
                	 String tname1=rs.getString("name");
					 String destin1=(rs.getString("post"));
					 int amt1=(rs.getInt("postno"));
					 String atime1=(rs.getString("qualification"));

           		     mod.insertRow(k++,new Object[]   {tno1 ,tname1, destin1 , amt1,atime1});

   	  	} rs.close();

   	    }

   	catch(SQLException e)
   	{
   		JOptionPane.showMessageDialog(null,e.toString(), "Error",JOptionPane.ERROR_MESSAGE  ) ;
   	}



   }

  if(ae.getSource()==b2)
   	  {

   	  	int r=0;
   	  	try
   	  	{
   	  		for(int i=mod.getRowCount()-1;i>=0;i--)
   	  		{
   	  			mod.removeRow(i);
   	  		}
   	  	}
   	  	catch(Exception e)
   	  	{
   	  	   JOptionPane.showMessageDialog(null,toString() ," Error Message ",JOptionPane.ERROR_MESSAGE);
   	  	}

      }


   	  if(ae.getSource()==b3)
   	  {
   	  	jf.dispose();



   	  }


  }

public void itemStateChanged(ItemEvent ie)
{
	if(ie.getSource()==cb1)
	{


    }

}
public static void main(String args[])
{
         checkpost ri= new  checkpost();
}
}



