

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
public class newcompany extends JFrame {
  Connection con;
            ResultSet rs;
            Statement stmt;
            String str5="";

	private JPanel contentPane;
	private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
        JComboBox comboBox;
        JRadioButton r1,r2;
        Choice c1;
	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newcompany frame = new newcompany();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public newcompany() throws SQLException {

                setBounds(580, 220, 900, 600);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/Industries-recruitment.PNG"));
                Image i3 = i1.getImage().getScaledInstance(450, 500,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(450,40,450,450);
                add(l1);

		JLabel lblName = new JLabel("NEW COMPANY FORM");
		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		lblName.setBounds(118, 11, 260, 53);
		contentPane.add(lblName);

                JLabel l3 = new JLabel("Id :");
		l3.setBounds(35, 70, 200, 14);
		contentPane.add(l3);

                t7 = new JTextField();
		t7.setBounds(271, 70, 150, 20);
		contentPane.add(t7);
		t7.setColumns(10);

                JLabel lblId = new JLabel("NAME");
		lblId.setBounds(35, 110, 200, 14);
		contentPane.add(lblId);

                 t9 = new JTextField();
		t9.setBounds(271, 110, 150, 20);
		contentPane.add(t9);

                JLabel l2 = new JLabel("POST :");
		l2.setBounds(35, 150, 200, 14);
		contentPane.add(l2);

                t1 = new JTextField();
		t1.setBounds(271, 150, 150, 20);
		contentPane.add(t1);
		t1.setColumns(10);

		JLabel lblName_1 = new JLabel("NO OF SEATS :");
		lblName_1.setBounds(35, 190, 200, 14);
		contentPane.add(lblName_1);

		t2 = new JTextField();
		t2.setBounds(271, 190, 150, 20);
		contentPane.add(t2);
		t2.setColumns(10);


		JLabel lblGender = new JLabel("REQ.QUALIFICAION   :");
		lblGender.setBounds(35, 230, 200, 14);
		contentPane.add(lblGender);

               t10 = new JTextField();
			   		t10.setBounds(271, 230, 150, 20);
			   		contentPane.add(t10);
		t2.setColumns(10);



		JLabel lblCountry = new JLabel("EDUCATION :");
		lblCountry.setBounds(35, 270, 200, 14);
		//contentPane.add(lblCountry);

                t3 = new JTextField();
		t3.setBounds(271, 270, 150, 20);
		//contentPane.add(t3);
		//t3.setColumns(10);

		JLabel lblReserveRoomNumber = new JLabel("STATUS:");
		lblReserveRoomNumber.setBounds(35, 310, 200, 14);
		//contentPane.add(lblReserveRoomNumber);

                t5 = new JTextField();
		t5.setBounds(271, 310, 150, 20);
		//contentPane.add(t5);
		//t5.setColumns(10);

		JLabel lblCheckInStatus = new JLabel("Phone :");
		lblCheckInStatus.setBounds(35, 350, 200, 14);
		//contentPane.add(lblCheckInStatus);

                t6 = new JTextField();
		t6.setBounds(271, 350, 150, 20);
		//contentPane.add(t6);
		//t6.setColumns(10);

		JLabel lblDeposite = new JLabel("Email :");
		lblDeposite.setBounds(35, 390, 200, 14);
		//contentPane.add(lblDeposite);

		t8 = new JTextField();
		t8.setBounds(271, 390, 150, 20);
		//contentPane.add(t8);

        try
        {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("Jdbc:Odbc:job");
         stmt=con.createStatement();

        String str="select ID from company";
       ResultSet rrr= stmt.executeQuery(str);
        while(rrr.next())
        {
        	String sss=rrr.getString("ID");

        	int ssss=Integer.parseInt(sss)+1;
        	t7.setText(""+ssss);



        }
        }
        catch(Exception e)
        {
        	System.out.println("error"+e);
        }


		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            //Conn c = new Conn();
                            String radio = null;

   String s9 = t7.getText(); //username
                                   String s1 = t9.getText();;
   	    			String s2 =  t1.getText();
   	    			String s3 =  t2.getText();
                                   String s4 =  t10.getText();;
   	    			//String s5 =  t3.getText();
   	    			//String s7 =  t5.getText();  //address
                                   //String s8 =  t6.getText();
                                   //String s10 = t8.getText(); //email


	try
   	  {
   	    System.out.println("bhbhjbhj");
        str5="insert into company values('"+s9+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"')";
        int n =stmt.executeUpdate(str5);

      JOptionPane.showMessageDialog(null, "Register Successfully");
       //reset1();
      }
      catch(Exception ex)
      {
      	System.out.println("error"+e);
      }
						                          }

                           /* try{
	    			String s9 = t7.getText(); //username
                                String s1 = (String)comboBox.getSelectedItem();
	    			String s2 =  t1.getText();
	    			String s3 =  t2.getText();
                                String s4 =  radio;
	    			String s5 =  t3.getText();
	    			String s7 =  t5.getText();  //address
                                String s8 =  t6.getText();
                                String s10 = t8.getText(); //email

                                String q1 = "insert into customer values('"+s9+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s7+"','"+s8+"','"+s10+"')";
                               // c.s.executeUpdate(q1);

	    			JOptionPane.showMessageDialog(null, "Customer Added Successfully");
                                setVisible(false);
	    		}catch(SQLException e1){
	    			System.out.println(e1.getMessage());
	    		}
		    		catch(NumberFormatException s){
		    			JOptionPane.showMessageDialog(null, "Please enter a valid Number");
			}*/

		});
		btnNewButton.setBounds(100, 350, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);

		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            setVisible(false);
			}
		});
		btnExit.setBounds(260, 350, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);

                getContentPane().setBackground(Color.WHITE);
	}
}