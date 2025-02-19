

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

 class home extends JFrame{
    String username;
    public static void main(String[] args) {
        new home().setVisible(true);
    }

    public home() {
        super("Job Portal Management System");

        setForeground(Color.CYAN);
        setLayout(null);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Social-media-connected-03.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000);
        Component add = add(NewLabel);

        JLabel l1 = new JLabel("Job Portal Management System");
	l1.setForeground(Color.red);
        l1.setFont(new Font("Tahoma", Font.PLAIN,55));
	l1.setBounds(400, 40, 1000, 100);
	NewLabel.add(l1);


        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);

        JMenu m1 = new JMenu("REGISTRATION");
        m1.setForeground(Color.BLUE);
	menuBar.add(m1);

        JMenuItem mi1 = new JMenuItem("ADD CANDIDATE");
	m1.add(mi1);

        JMenuItem mi2 = new JMenuItem("UPDATE CANDIDATE DETAIL");
	m1.add(mi2);

        JMenuItem mi3 = new JMenuItem("VIEW CANDIDATE DETAILS");
	m1.add(mi3);

        JMenuItem mi4 = new JMenuItem("DELETE CANDIDATE DETAILS");
	m1.add(mi4);
 mi1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent ae){
            try{
              new newregistration().setVisible(true);
            }catch(Exception e ){}
		}
        });

        mi2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                   new updateregistration().setVisible(true);
                }catch(Exception e ){}
            }
	});

        mi3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                  new viewregistration().setVisible(true);
                }catch(Exception e ){}
            }
	});

        mi4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                // new deleteregistration().setVisible(true);
                }catch(Exception e ){}
            }
	});



	JMenu m2 = new JMenu("APPLICATIONS");
        m2.setForeground(Color.RED);
	menuBar.add(m2);

        JMenuItem mi6 = new JMenuItem("CHECK POSTS");
	m2.add(mi6);

        JMenuItem mi7 = new JMenuItem("NEW APPLICATION ");
	m2.add(mi7);

        JMenuItem mi5 = new JMenuItem("VIEW APPLICATIONS");
	m2.add(mi5);


        mi6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                new checkpost().setVisible(true);
                }catch(Exception e ){}
            }
	});


        mi7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                new newapplication().setVisible(true);
                }catch(Exception e ){}
            }
	});


	mi5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                  new checkapplication().setVisible(true);
                }catch(Exception e ){}

            }
	});


        JMenu m3 = new JMenu("COMPANY");
        m3.setForeground(Color.BLUE);
	menuBar.add(m3);

        JMenuItem mi8 = new JMenuItem("ADD COMPANY");
	m3.add(mi8);


JMenuItem mi16 = new JMenuItem("UPDATE COMPANY");
	m3.add(mi16);

        JMenuItem mi9 = new JMenuItem("DELETE COMPANY");
	m3.add(mi9);

        JMenuItem mi10 = new JMenuItem("VIEW COMPANY");
	m3.add(mi10);

        mi8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
				try{
         new newcompany().setVisible(true);
                  }catch(Exception e ){}
            }
	});



	mi9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
            new deletecompany().setVisible(true);
                }catch(Exception e ){}
            }
	});
            mi16.addActionListener(new ActionListener(){
			            public void actionPerformed(ActionEvent ae){
			                try{
			            new updatecompany().setVisible(true);
			                }catch(Exception e ){}
			            }
	});
        mi10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                 new viewcompany().setVisible(true);
                }catch(Exception e ){}
            }
	});

        JMenu m4 = new JMenu("PAYMENT");
        m4.setForeground(Color.RED);
	menuBar.add(m4);

        JMenuItem mi11 = new JMenuItem("MAKE PAYMENT");
	m4.add(mi11);

	 JMenuItem mi17 = new JMenuItem("BILL ");
		//m4.add(mi17);
 JMenuItem mi18 = new JMenuItem("VIEW PAYMENTS ");
		m4.add(mi18);


        mi11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
           try{
		                    new payment().setVisible(true);
                }catch(Exception e ){}
            }
	});
  mi17.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
            // new newpayment().setVisible(true);
            }
	});
	  mi18.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent ae){
	             try{
				                  new viewpayment().setVisible(true);
                }catch(Exception e ){}
	            }
	});

     JMenu m5 = new JMenu("ADMIN");
        m5.setForeground(Color.BLUE);
	menuBar.add(m5);

        JMenuItem mi12 = new JMenuItem("NEW ADMIN");
	m5.add(mi12);
	 JMenuItem mi21 = new JMenuItem("UPDATE ADMIN");
	m5.add(mi21);
	 JMenuItem mi19 = new JMenuItem("DELETE ADMIN");
	m5.add(mi19);
	 JMenuItem mi20 = new JMenuItem("VIEW ADMIN");
	m5.add(mi20);

        mi12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
           try{
		  				                  new newadmin().setVisible(true);
                }catch(Exception e ){}
            }
	});
	 mi21.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent ae){
	           try{
			  				                  new updateadmin().setVisible(true);
	                }catch(Exception e ){}
	            }
	});
	 mi19.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent ae){
	           try{
			  				                  new deleteadmin().setVisible(true);
	                }catch(Exception e ){}
	            }
	});
	 mi20.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent ae){
	           try{
			  				                  new viewadmin().setVisible(true);
	                }catch(Exception e ){}
	            }
	});

        JMenu m6 = new JMenu("UTILITY");
        m6.setForeground(Color.RED);
	menuBar.add(m6);

        JMenuItem mi13 = new JMenuItem("NOTEPAD");
	m6.add(mi13);

        JMenuItem mi14 = new JMenuItem("CALCULATOR");
	m6.add(mi14);

        mi13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    Runtime.getRuntime().exec("notepad.exe");
                }catch(Exception e){ }
            }
	});


        mi14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    Runtime.getRuntime().exec("calc.exe");
                }catch(Exception e){ }
            }
	});

        JMenu m7 = new JMenu("ABOUT");
        m7.setForeground(Color.BLUE);
	menuBar.add(m7);

        JMenuItem mi15 = new JMenuItem("ABOUT");
	m7.add(mi15);

        mi15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             new About().setVisible(true);
            }
	});



        setExtendedState(JFrame.MAXIMIZED_BOTH);
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
}

}