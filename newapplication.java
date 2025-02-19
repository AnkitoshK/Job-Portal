

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class newapplication extends JFrame {
	private JPanel contentPane;
        Choice c1,c2;
           JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
           Connection con=null;
		   	PreparedStatement pstmt=null;
		   	PreparedStatement pstmt1=null;
		   	Statement stmt=null;
		   	Statement stmt1=null;
		   	Statement stmt2=null;
int ssss;
String str5="";
		   	ResultSet rs=null;
		   	ResultSet rs1=null;

    ResultSet r=null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newapplication frame = new newapplication();
					frame.setVisible(true);
				} catch (Exception ep) {
					System.out.println("error"+ep);
				}
			}
		});
	}

	public newapplication() throws SQLException {
		setBounds(580, 220, 850, 550);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/job-portal-1.jpg"));
                Image i3 = i1.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
              l1 = new JLabel(i2);
                l1.setBounds(500,100,300,300);
                add(l1);

		JLabel lblName = new JLabel("NEW APPLICATION DETAILS");
		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		lblName.setBounds(118, 11, 300, 53);
		contentPane.add(lblName);

                JLabel lb3 = new JLabel("ID:");
		lb3.setBounds(35, 70, 100, 14);
		contentPane.add(lb3);

c1=new Choice();
                c1.setBounds(150, 70, 50, 30);
                add(c1);
                c2=new Choice();
				                c2.setBounds(250, 70, 50, 30);
                add(c2);

                JLabel lblId = new JLabel("NAME:");
		lblId.setBounds(35, 110, 200, 14);
		contentPane.add(lblId);

               l2 = new JLabel();
		l2.setBounds(150, 110, 200, 14);
		contentPane.add(l2);

                JLabel lb2 = new JLabel("ADDRESS:");
		lb2.setBounds(35, 150, 200, 14);
		contentPane.add(lb2);

                 l3 = new JLabel();
		l3.setBounds(150, 150, 200, 14);
		contentPane.add(l3);

		JLabel lblName_1 = new JLabel("MOBILE:");
		lblName_1.setBounds(35, 190, 200, 14);
		contentPane.add(lblName_1);

		 l4 = new JLabel();
		l4.setBounds(150, 190, 200, 14);
		contentPane.add(l4);


		JLabel lblGender = new JLabel("EDUCATION :");
		lblGender.setBounds(35, 230, 200, 14);
		contentPane.add(lblGender);

                 l5 = new JLabel();
		l5.setBounds(150, 230, 200, 14);
		contentPane.add(l5);

		JLabel lblCountry = new JLabel("APPLICATIO ID :");
		lblCountry.setBounds(35, 270, 200, 14);
		contentPane.add(lblCountry);

                 l6 = new JLabel();
		l6.setBounds(150, 270, 200, 14);
		contentPane.add(l6);

		JLabel lblReserveRoomNumber = new JLabel("STATUS :");
		lblReserveRoomNumber.setBounds(35, 310, 200, 14);
		//contentPane.add(lblReserveRoomNumber);

                 l7 = new JLabel();
		l7.setBounds(150, 310, 200, 14);
		//contentPane.add(l7);

		JLabel lblCheckInStatus = new JLabel("COMPANY :");
		lblCheckInStatus.setBounds(250, 110, 100, 14);
		contentPane.add(lblCheckInStatus);

                 l8 = new JLabel();
		l8.setBounds(350, 110, 200, 14);
		contentPane.add(l8);


		JLabel lblDeposite = new JLabel("POST :");
		lblDeposite.setBounds(250, 150, 100, 14);
		contentPane.add(lblDeposite);

		 l9 = new JLabel();
		l9.setBounds(350, 150, 200, 14);
		contentPane.add(l9);
		JLabel lblCheckInSt = new JLabel("QUALIFIACATION :");
				lblCheckInSt.setBounds(250, 190, 130, 14);
				contentPane.add(lblCheckInSt);

		                 l10 = new JLabel();
				l10.setBounds(360, 190, 200, 14);
				contentPane.add(l10);
 try
        {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("Jdbc:Odbc:job");
         stmt=con.createStatement();

        String str="select ID from application";
       ResultSet rrr= stmt.executeQuery(str);
        while(rrr.next())
        {
        	String sss=rrr.getString("ID");

        	int ssss=Integer.parseInt(sss)+1;
        	l6.setText(""+ssss);



        }
        }
        catch(Exception e)
        {
        	System.out.println("error"+e);
        }
 try
        {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("Jdbc:Odbc:job");
         stmt=con.createStatement();

        String str="select ID from application";
       ResultSet rrr= stmt.executeQuery(str);
        while(rrr.next())
        {
        	String sss=rrr.getString("ID");

        	int ssss=Integer.parseInt(sss)+1;




        }
        }
        catch(Exception e)
        {
        	System.out.println("error"+e);
        }


		try{
String sql="Select * From registration";
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:job","","");
		stmt=con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
		rs=stmt.executeQuery(sql);
		rs.beforeFirst();
		while(rs.next())
		{
			c1.addItem(rs.getString(1));
		}
} catch(Exception ex){}
		try{
String sql="Select * From company";
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:job","","");
		stmt=con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
		rs=stmt.executeQuery(sql);
		rs.beforeFirst();
		while(rs.next())
		{
			c2.addItem(rs.getString(1));
		}
} catch(Exception ex){}
		JButton b1 = new JButton("Check");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
 try
						      	   {
									   String sel11=c1.getSelectedItem();
									   int se=Integer.parseInt(sel11);
						      	   String str="select * from rEGISTRATION where id="+se+"";
						          rs=stmt.executeQuery(str);
						          while(rs.next())
						          {
						          	// t1.setText(rs.getString(1));
						   		                       l2.setText(rs.getString(2));
													                                       l3.setText(rs.getString(3));
													                                       l4.setText(rs.getString(4));
													                                       l5.setText(rs.getString(6));
													                                      //l6.setText(rs.getString(6));
													                                       //l7.setText(rs.getString(7));
													                                      // l8.setText(rs.getString(8));
													                                     //  l9.setText(rs.getString(9));
                                }
 String sel1=c2.getSelectedItem();
									   int se1=Integer.parseInt(sel1);
						      	   String str1="select * from company where id="+se1+"";
						          rs=stmt.executeQuery(str1);
						          while(rs.next())
						          {
						          	// t1.setText(rs.getString(1));
						   		                       l8.setText(rs.getString(2));
													                                       l9.setText(rs.getString(3));
													                                       //l8.setText(rs.getString(4));
													                                       l10.setText(rs.getString(5));
													                                       //l6.setText(rs.getString(6));
													                                       //l7.setText(rs.getString(7));
													                                      // l8.setText(rs.getString(8));
													                                     //  l9.setText(rs.getString(9));
                                }


						          }
						          catch(Exception ex)
						          {
						          	  System.out.println("error"+ex);
       }
                        }
		});
		b1.setBounds(425, 70, 80, 22);
                b1.setBackground(Color.BLACK);
                b1.setForeground(Color.WHITE);
		contentPane.add(b1);


		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            //Conn c = new Conn();
                            String radio = null;

   String s1 = c1.getSelectedItem(); //username
                                   String s2 = c2.getSelectedItem();;
   	    			String s3 =  l2.getText();
   	    			String s4 =  l3.getText();
                                   String s5 =  l4.getText();;
   	    			String s6 =  l8.getText();
   	    			String s7 =  l9.getText();  //address
                                   String s8 =  l10.getText();
                                   String s9 = l6.getText(); //email
String s10 = l5.getText();

	try
   	  {
   	    System.out.println("bhbhjbhj");
        str5="insert into application values('"+s9+"','"+s1+"','"+s2+"','"+s3+"','"+s5+"','"+s4+"','"+s10+"','"+s6+"','"+s7+"','"+s8+"')";
        int n =stmt.executeUpdate(str5);

      JOptionPane.showMessageDialog(null, "Register Successfully");
       //reset1();
      }
      catch(Exception ex)
      {
      	System.out.println("error"+ex);
      }
			}
		});
		btnNewButton.setBounds(100, 430, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);

		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            setVisible(false);
			}
		});
		btnExit.setBounds(260, 430, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);

                getContentPane().setBackground(Color.WHITE);
	}
}