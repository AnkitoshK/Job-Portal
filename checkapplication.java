import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.*;
class checkapplication extends JFrame implements ActionListener,ItemListener
{
   private DefaultTableModel mod;
   private JTable tab;
int tno1,tname,destinl;
	String str1="";
		String str2="";
	String url="jdbc:odbc:job";
    Connection con;
    Statement st;
    ResultSet rs,rs1,rs3;
    JButton b1,b2,b3;
    //List li1;
    JComboBox cb1;
      JFrame jf;


    checkapplication()
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
         mod.addColumn("Id");
         mod.addColumn("rid");
         mod.addColumn("cid");
         mod.addColumn("name ");
         mod.addColumn("add");
         mod.addColumn("mob");
		 mod.addColumn("qualification");
		 mod.addColumn("cname ");
		 mod.addColumn("cpost");
		 mod.addColumn("cquali");





         tab= new JTable(mod);
         JScrollPane jp = new JScrollPane(tab , ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	     jp.setBounds(20,150,600,200);
         jf.add(jp);



         lb1= new JLabel("Select Id",JLabel.LEFT);

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
		    		ResultSet rsc=st.executeQuery("select * from application");
			    	while(rsc.next())
			        {

			        	cb1.addItem(rsc.getString("ID"));

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
   	  	str1="select * from application where ID="+ cb1.getSelectedItem() +" ";
   	  	rs3=st.executeQuery(str1);
   	  	while(rs3.next())
   	  	{
   	  		         int t1=rs3.getInt("ID");
                	 int t2=rs3.getInt("rid");
					 int t3=(rs3.getInt("cid"));
            		String t4=rs3.getString("aname");
                	 String t5=rs3.getString("aadd");
					 String t6=(rs3.getString("amob"));
 					String t7=rs3.getString("aquali");
                	 String t8=rs3.getString("cname");
					 String t9=(rs3.getString("cpost"));
					String t10=(rs3.getString("cquali"));


           		mod.insertRow(k++,new Object[]   {t1 ,t2,t3,t4,t5,t6,t7,t8,t9,t10});

 	  	}
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
         checkapplication ri= new  checkapplication();
}
}



