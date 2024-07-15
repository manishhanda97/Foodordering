import javax.swing.*; 
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

public class MAIN extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	// for order storage
	HashMap <String, String> msgTable = new HashMap<String, String>();
	HashMap <String, Float> priceTable = new HashMap<String, Float>();
	public String msg = "";
	public float price = 0;
	Random rand = new Random();

	// main menu components
	JFrame f = new JFrame();
	JPanel panel = new JPanel(new GridBagLayout());
	JTabbedPane tab = new JTabbedPane();
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	
	// main menu buttons
	JButton btn = new JButton("ADD TO CART");
	JButton EditOrder_button = new JButton("Edit Order");
	JButton MakeAppointmentChangeTable_button = new JButton("Make Appointment");
	JButton VIPCardPoints_button = new JButton("VIP Members");
	JButton Checkout_button = new JButton("Checkout");
	
	
	//Add Order Components
	JLabel label, label2, label3, labelSpecialReq, labelP,labelI, label4, label5,label6 ;
	   JCheckBox cb1, cb2,cb3, cb_E1, cb_E2, cb_E3, cb_E4,cb_E5,cb_E6,cb_E7, cb_E8, cb_D1, cb_D2, cb_D3, cb_D4,
	         cb_S1,cb_S2,cb_S3, cb_B1, cb_B2, cb_B3;
	   JTextField tf1;
	   ImageIcon icon;
	   JRadioButton rb, rb1;
	   ButtonGroup bg;
	   

	// MAIN METHOD
	    public static void main(String[] args) 
	    {
	    	SwingUtilities.invokeLater(new Runnable() // so program will run faster
	    	{
	            public void run() 
	            {
	                new MAIN();
	            }
	        });
  
	    }  

    public MAIN() 
    {
    	// edit buttons
    	btn.setBounds(220,500,180,60);
        btn.setFont(new Font("ITALIC", Font.BOLD, 18));
        btn.setBackground(Color.PINK);
        btn.setForeground(Color.black);
        btn.setOpaque(true);
        
    	EditOrder_button.setBounds(50,600,100,50);
    	EditOrder_button.setFont(new Font("ITALIC", Font.BOLD, 12));
    	EditOrder_button.setBackground(Color.white);
    	EditOrder_button.setForeground(Color.darkGray);
    	EditOrder_button.setOpaque(true);
    	
    	MakeAppointmentChangeTable_button.setBounds(200,600,100,50);
    	MakeAppointmentChangeTable_button.setFont(new Font("ITALIC", Font.BOLD, 12));
    	MakeAppointmentChangeTable_button.setBackground(Color.white);
    	MakeAppointmentChangeTable_button.setForeground(Color.darkGray);
    	MakeAppointmentChangeTable_button.setOpaque(true);
    	
    	VIPCardPoints_button.setBounds(350,600,100,50);
    	VIPCardPoints_button.setFont(new Font("ITALIC", Font.BOLD, 12));
    	VIPCardPoints_button.setBackground(Color.white);
    	VIPCardPoints_button.setForeground(Color.darkGray);
    	VIPCardPoints_button.setOpaque(true);
    	
    	Checkout_button.setBounds(500,600,100,50);
    	Checkout_button.setFont(new Font("ITALIC", Font.BOLD, 12));
    	Checkout_button.setBackground(Color.white);
    	Checkout_button.setForeground(Color.darkGray);
    	Checkout_button.setOpaque(true);
        
    	// Makes buttons go to ActionListener when clicked
    	btn.addActionListener(this);
    	
        EditOrder_button.addActionListener(this);
        MakeAppointmentChangeTable_button.addActionListener(this);
        VIPCardPoints_button.addActionListener(this);
        Checkout_button.addActionListener(this);
        
        // frame set up
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	getContentPane().setBackground(Color.pink);
        tab.setBounds(10,10,700,700);
        tab.add("Menu", panel);
        
        label= new JLabel("CSU MENU");
        label.setFont(new Font("Lucida Grande", Font.BOLD, 24));
      
        label.setOpaque(true);
        label2= new JLabel("APPETIZERS");
        label2.setBounds(23, 40, 150, 80);
        label2.setFont(new Font("ITALIC", Font.BOLD, 14));
        label3= new JLabel("ENTREES");
        label3.setBounds(23,190,160,50);
        label3.setFont(new Font("ITALIC", Font.BOLD, 14));
        label4= new JLabel("DRINKS");
        label4.setBounds(420,40,150,80);
        label4.setFont(new Font("ITALIC", Font.BOLD, 14));

        label5= new JLabel("SHAKES");
        label5.setBounds(420,190,150,90);
        label5.setFont(new Font("ITALIC", Font.BOLD, 14));

        label6= new JLabel("BEERS");
        label6.setBounds(420,310,150,90);
        label6.setFont(new Font("ITALIC", Font.BOLD, 14));

        labelSpecialReq= new JLabel("Special Request");
        labelSpecialReq.setBounds(255,42,190,120);

        labelP= new JLabel();
        labelP.setBounds(250,650,170,40);

        labelI= new JLabel();
        labelI.setBounds(225,350,250,160);

        rb= new JRadioButton("Spicy");
        rb.setBounds(225,280, 78,90);

        rb1= new JRadioButton("Not Spicy");
        rb1.setBounds(290,280,100,90);

        bg= new ButtonGroup();
        bg.add(rb);
        bg.add(rb1);

        tf1= new JTextField(25);
        tf1.setBounds(237,110,130,80);
        tf1.setBackground(Color.white);

        cb1 = new JCheckBox("ONION RINGS - $6 (10% off)");       

        cb2 = new JCheckBox("FRIES - $4 (10% off)");
        
        cb3= new JCheckBox("BONLESS WINGS - $9");
        
        cb_E1= new JCheckBox("CHICKEN SANDWICH - $12 (10% off)");
       
        cb_E2= new JCheckBox("CHICKEN QUESADILLA - $11");
       
        cb_E3= new JCheckBox("GRILLED SHRIMP - $14");
    
        cb_E4= new JCheckBox("CHICKEN KABAB - $14");
        
        cb_E5= new JCheckBox("BONE-IN WINGS - $10");
        
        cb_E6= new JCheckBox("BOURBON CHICKEN - $13");      

        cb_E7= new JCheckBox("ORANGE CHICKEN - $10");
        
        cb_E8= new JCheckBox("CHICKEN LOLIPOP - $12");
       
        cb_D1= new JCheckBox("COKE - $3");
        
        cb_D2= new JCheckBox("SPRITE - $3");
        
        cb_D3= new JCheckBox("DR PEPPER - $3");
        
        cb_D4= new JCheckBox("DIET PEPSI - $2"); 

        cb_S1= new JCheckBox("BANANA - $4");
        
        cb_S2= new JCheckBox("CHOCOLATE - $4");
        
        cb_S3= new JCheckBox("VANILLA - $4");
      
        cb_B1= new JCheckBox("CORONA - $5");
        
        cb_B2= new JCheckBox("STELLA - $6");
        
        cb_B3= new JCheckBox("BUDLIGHT - $5");
        

        // add all of add order components to menu 

        GridBagConstraints c = new GridBagConstraints();
        
        // title
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 0;
        c.weighty = 0.15;
        c.anchor = GridBagConstraints.NORTH;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        panel.add(label, c);
        
        // column 1
        c.gridx = 1;
        c.gridy = 1;
        panel.add(label2, c);
        c.gridy++;
        panel.add(cb1, c);
        c.gridy++;
        panel.add(cb2, c);
        c.gridy++;
        panel.add(cb3, c);
        c.gridy++;
      
        panel.add(label3, c);
        c.gridy++;
        panel.add(cb_E1, c);
        c.gridy++;
        panel.add(cb_E2, c);
        c.gridy++;
        panel.add(cb_E3, c);
        c.gridy++;
        panel.add(cb_E4, c);
        c.gridy++;
        panel.add(cb_E5, c);
        c.gridy++;
        panel.add(cb_E6, c);
        c.gridy++;
        panel.add(cb_E7, c);
        c.gridy++;
        panel.add(cb_E8, c);
        
        // column 2
        c.gridx = 2;
        c.gridy = 1;
        panel.add(labelSpecialReq, c);
        c.gridy++;
        panel.add(tf1, c);
        c.gridy++;
        
        // column 3
        c.gridx = 3;
        c.gridy = 1;
        panel.add(label4, c);
        c.gridy++;
        panel.add(cb_D1, c);
        c.gridy++;
        panel.add(cb_D2, c);
        c.gridy++;
        panel.add(cb_D3, c);
        c.gridy++;
        panel.add(cb_D4, c);
        c.gridy++;
        
        panel.add(label5, c);
        c.gridy++;
        panel.add(cb_S1, c);
        c.gridy++;
        panel.add(cb_S2, c);
        c.gridy++;
        panel.add(cb_S3, c);
        c.gridy++;
        
        panel.add(label6, c);
        c.gridy++;
        panel.add(cb_B1, c);
        c.gridy++;
        panel.add(cb_B2, c);
        c.gridy++;
        panel.add(cb_B3, c);
        c.gridy++;
        
        // column 4
        c.gridx = 4;
        c.gridy = 1;
        panel.add(btn, c);
        c.gridy++;
        c.gridy++;
        c.gridy++;
        c.gridy++;
        c.gridy++;
        c.gridy++;
        c.gridy++;
        c.gridy++;

        panel.add(EditOrder_button, c);
        c.gridy++;
        panel.add(MakeAppointmentChangeTable_button, c);
        c.gridy++;
        panel.add(VIPCardPoints_button, c);
        c.gridy++;
        panel.add(Checkout_button, c);
        c.gridy++;
        
        // mouse listener for closing tabs
        tab.addMouseListener(new MouseListener()
		{

			@Override
			public void mouseClicked(MouseEvent e) {}

			@Override
			public void mousePressed(MouseEvent e) 
			{
				int index = tab.getSelectedIndex();
				
				if (index != 0) // if statement makes it so main tab cannot be deleted
				{
					JPopupMenu popupMenu = new JPopupMenu();
					JMenuItem delete = new JMenuItem("X");
					delete.addActionListener(new ActionListener() // deletes current tab (hover over it)
							{
								@Override
								public void actionPerformed(ActionEvent e) 
								{
									tab.remove(index);
								}
						
							});
							popupMenu.add(delete);
							popupMenu.show(tab, e.getX(),e.getY() - 20); 	
				}
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}
	
		});
        
        add(tab);  
        setSize(750,775);  
        setTitle("CSU Ordering App");
        setLayout(null);  
        setVisible(true); 
        
    }
    

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// add order actions
	      if (cb1.isSelected()) {
	         price += 5.40;
	         msg += "ONION RINGS (10% off) : $5.40\n";

	      }

	      if (cb2.isSelected()) {
	         price += 3.60;
	         msg += "FRIES (10% off) : $3.60\n";
	        
	      }
	      if (cb3.isSelected()) {
	         price += 9;
	         msg += "BONELESS WINGS : $9\n";

	      }

	      if (cb_E1.isSelected()) {
	         price += 10.80;
	         msg += "CHICKEN SANDWICH (10% off) : $10.80\n";
	         
	      }
	      if (cb_E2.isSelected()) {
	         price += 11;
	         msg += "CHICKEN QUESADILLA : $11\n";
	         
	      }

	      if (cb_E3.isSelected()) 
	      {
	    	  JOptionPane.showMessageDialog(this,"GRILLED SHRIMP CURRENTLY UNAVAILABLE");
	      }

	      if (cb_E4.isSelected()) {
	         price += 14;
	         msg += "CHICKEN KABAB : $14\n";

	      }

	      if (cb_E5.isSelected()) {
	         price += 10;
	         msg += "BONE-IN WINGS : $10\n";

	      }
	      if (cb_E6.isSelected()) {
	         price += 13;
	         msg += "BOURBON CHICKEN : $13\n";


	      }
	      if (cb_E7.isSelected()) {
	         price += 10;
	         msg += "ORANGE CHICKEN : $10\n";


	      }
	      if (cb_E8.isSelected()) {
	         price += 12;
	         msg += "CHICKEN LOLLIPOP : $12\n";


	      }
	      if (cb_D1.isSelected()) {
	         price += 3;
	         msg += "COKE : $3\n";


	      }
	      if (cb_D2.isSelected()) {
	         price += 3;
	         msg += "SPRITE : $3\n";
	         

	      }
	      if (cb_D3.isSelected()) {
	         price += 3;
	         msg += "DR. PEPPER : $3\n";


	      }
	      if (cb_D4.isSelected()) {
	         price += 2;
	         msg += "DIET PEPSI : $2\n";


	      }
	      if (cb_S1.isSelected()) {
	         price += 4;
	         msg += "BANANA : $4\n";
	         

	      }
	      if (cb_S2.isSelected()) {
	         price += 4;
	         msg += "CHOCOLATE : $4\n";


	      }
	      if (cb_S3.isSelected()) {
	    	  JOptionPane.showMessageDialog(this,"VANILLA SHAKE CURRENTLY UNAVAILABLE");

	      }
	      if (cb_B1.isSelected()) {
	         price += 5;
	         msg += "CORONA : $5\n";


	      }
	      if (cb_B2.isSelected()) {
	         price += 6;
	         msg += "STELLA : $6\n";


	      }
	      if (cb_B3.isSelected()) {
	         price += 5;
	         msg += "BUDLIGHT : $5\n";


	      }
	      
	      // other button actions
		Object obj = e.getSource();
    	
    	if (obj == EditOrder_button)
    	{
    		System.out.println("Edit Order");
    		tab.add("Edit Order", new EditOrder());
    		
    	}
    	else if (obj == MakeAppointmentChangeTable_button)
    	{
    		System.out.println("Make Appointment");
    		tab.add("Make Appointment", new Appointments());
    	}
    	
    	else if (obj == VIPCardPoints_button)
    	{	
    		 System.out.println("VIP Card Points");
    		 tab.add("VIP", new Vipaccount());
    		 
    	}
    	else if (obj == Checkout_button)
    	{
    		System.out.println("Checkout");
    		tab.add("Checkout", new CheckOut());
    	}
    	
    	else if (obj == btn)
    	{
    		System.out.println("ORDER ADDED");
    		
    		if (msg == "" && price == 0)
    		{
    			JOptionPane.showMessageDialog(this,"Select items to add order");	
    		}
    		
    		else
    		{
    			msg += "------------------\n";
    			String request = String.format("SPECIAL REQUEST: %s\n\n", tf1.getText());
       		 JOptionPane.showMessageDialog(f,"ITEMS ADDED\n\n" + msg + "Total: $" + String.format("%.2f", price) + "\n\n" + request );
       		 
       		 // add special request getText to msg
       		 	msg += (request);
    		}
    		
    	// set all checkboxes and textfield to false after order is added
    		cb1.setSelected(false);
    		cb2.setSelected(false);
    		cb3.setSelected(false);
    		
    		cb_E1.setSelected(false);
    		cb_E2.setSelected(false);
    		cb_E3.setSelected(false);
    		cb_E4.setSelected(false);
    		cb_E5.setSelected(false);
    		cb_E6.setSelected(false);
    		cb_E7.setSelected(false);
    		cb_E8.setSelected(false);
    		
    		cb_D1.setSelected(false);
    		cb_D2.setSelected(false);
    		cb_D3.setSelected(false);
    		cb_D4.setSelected(false);
    		
    		cb_S1.setSelected(false);
    		cb_S2.setSelected(false);
    		cb_S3.setSelected(false);
    		
    		cb_B1.setSelected(false);
    		cb_B2.setSelected(false);
    		cb_B3.setSelected(false);
    		
    		tf1.setText("");
    	
    	  System.out.println("msg:\n" + msg);
     	  System.out.println("price:\n" +price);
     	  
   	      msgTable.put("Order ",msg);
   	      priceTable.put("Total ", price);
   	      
   	      System.out.println(msgTable);
   	      System.out.println(priceTable);

    	}
      
	}
	
	
	public class EditOrder extends JPanel implements ActionListener 
	{
	    
		private static final long serialVersionUID = 1L;
		
		private JPanel pan = new JPanel(new GridBagLayout());  
		private JButton view = new JButton("View Cart");
		private JButton clear = new JButton("Clear Cart");
		private JButton add = new JButton("Double Order Quantity");
		
		private GridBagConstraints g = new GridBagConstraints();

	    public EditOrder() 
	    {
	    	// buttons -------------
	    	
	    	view.setFont(new Font("ITALIC", Font.BOLD, 12));
			view.setBackground(Color.white);
			view.setForeground(Color.darkGray);
			view.setOpaque(true);
			view.addActionListener(this);
			
			clear.setFont(new Font("ITALIC", Font.BOLD, 12));
			clear.setBackground(Color.white);
			clear.setForeground(Color.darkGray);
			clear.setOpaque(true);
			clear.addActionListener(this);
			
			add.setFont(new Font("ITALIC", Font.BOLD, 12));
			add.setBackground(Color.white);
			add.setForeground(Color.darkGray);
			add.setOpaque(true);
			add.addActionListener(this);
			

			setBorder(new CompoundBorder(new TitledBorder("CART"), new EmptyBorder(4, 0, 0, 0)));
	        g.gridx = 0;
	        g.gridy = 0;
	        g.gridwidth = GridBagConstraints.REMAINDER;
	        g.fill = GridBagConstraints.HORIZONTAL;
	        g.weightx = 1;
	        g.insets = new Insets(4, 4, 4, 4);

	        g.weighty = 1;
	        g.anchor = GridBagConstraints.NORTH;
			
	        pan.add(view, g);
	        g.gridy++;
			
	        pan.add(clear, g);
	        g.gridy++;
	        
	        pan.add(add, g);
	        g.gridy++;

	        add(pan, g);

	    }
	    

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			Object obj = e.getSource();
		
			if (obj == view)
			{
				JOptionPane.showMessageDialog(f,"CART:\n\n" + msg + "\nTotal: $" + String.format("%.2f", price) + "\n\n");	 
				
			}
			else if (obj == clear)
			{
				msgTable.clear();
				priceTable.clear();
				
				msg = "";
				price = 0;
				
				JOptionPane.showMessageDialog(this, "CART CLEARED");	 
				
			}
			else if (obj == add)
			{
				
				if (msgTable.isEmpty() && priceTable.isEmpty())
				{
					JOptionPane.showMessageDialog(this, "ERROR: CART IS EMPTY");
				}
				
				else
				{
					msg = msg + msg;
					price = price + price;
					
					msgTable.put("Order ",msg);
			   	    priceTable.put("Total ", price);
					
			   	    JOptionPane.showMessageDialog(this, "ORDER QUANTITY DOUBLED");
					
				}
					 
				
			}
			
		}


			
		
	}

	
	
	
	public class CheckOut extends JPanel 
	{
		private static final long serialVersionUID = 1L;
		
		private ApplyCoupons applyCoupons;
		private Promotional promotional;
		private SelectPayment selectPayment;
		private ReviewOrder reviewOrder;
		
		// apply coupons
		private JTextField t_Coupons;
		private JButton confirm = new JButton("Confirm Code");
		private JLabel l = new JLabel(" no coupons applied");
		
		// promotional items
		private JRadioButton oRings, fries, sandwich;
	    private JLabel Label;
	    private JLabel L = new JLabel("Select optional items to add:");
	    
	    // select payment
	    private JRadioButton card, cash, VIP;
	    private JLabel Lab;
	    
	    // review order
	    private JButton help, review, submit, edit;


		    public CheckOut() 
		    {

		    	setLayout(new GridBagLayout());
	            GridBagConstraints gbc = new GridBagConstraints();
	            gbc.gridx = 0;
	            gbc.gridy = 0;
	            gbc.weightx = 1;
	            gbc.weighty = 0.33;
	            gbc.anchor = GridBagConstraints.WEST;
	            gbc.fill = GridBagConstraints.BOTH;
	            gbc.insets = new Insets(4, 4, 4, 4);
	            
	            add((promotional = new Promotional()), gbc);
	            gbc.gridy++;
	 
	            add((selectPayment = new SelectPayment()), gbc);
	            gbc.gridy++;
	            add((applyCoupons = new ApplyCoupons()), gbc);

	            gbc.gridy = 0;
	            gbc.gridx++;
	            gbc.gridheight = GridBagConstraints.REMAINDER;
	            gbc.fill = GridBagConstraints.VERTICAL;
	            gbc.weighty = 1;
	            gbc.weightx = 0;
	            add((reviewOrder = new ReviewOrder()), gbc);

		        setSize(600,600);
		    }
		    
		    public class ApplyCoupons extends JPanel implements ActionListener
		    {
				private static final long serialVersionUID = 1L;
		    	
		    	public ApplyCoupons()
		    	{
		    		confirm.setFont(new Font("ITALIC", Font.BOLD, 12));
		    		confirm.setBackground(Color.white);
					confirm.setForeground(Color.darkGray);
					confirm.setOpaque(true);
		    		confirm.addActionListener(this);
		    		
		    		l.setFont(new Font("ITALIC", Font.BOLD, 14));
		    		
		    		setLayout(new GridBagLayout());
			        GridBagConstraints gbc = new GridBagConstraints();
			        gbc.gridx = 0;
			        gbc.gridy = 0;
			        gbc.anchor = GridBagConstraints.WEST;

			        add(new JLabel("Enter Coupon Code: "), gbc);
			        gbc.gridy++;

			        gbc.gridx++;
			        gbc.gridy = 0;
			        gbc.weightx = 1;
			        gbc.fill = GridBagConstraints.HORIZONTAL;

			        add((t_Coupons = new JTextField(20)), gbc);
			         
			        gbc.gridy++;
			        gbc.gridx++;
			        gbc.gridy = 0;
			        gbc.weightx = 1;
			        gbc.fill = GridBagConstraints.HORIZONTAL;
			        add(confirm);
			        
			        gbc.gridy = 2;
			        gbc.gridx = 2;
			        gbc.fill = GridBagConstraints.HORIZONTAL;
			        add(l);
		    	}
		    	

			    // confirm button click - applies coupons
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					System.out.println("confirm");
					
					String getValue = t_Coupons.getText();
					System.out.println(getValue);
					
					if (getValue.equals("CSU"))
					{
						l.setText(getValue + " 5% off CSU discount applied");
						price = price - ((float) (price * 0.05));
						msg = msg + "5% off CSU discount applied\n";
						
						msgTable.put("Order ",msg);
						priceTable.put("Total ", price);
						
					}
					
					else if (getValue.equals("VIP"))
					{
						l.setText(getValue + " 10% off discount applied");
						price = price - ((float) (price * 0.10));
						msg = msg + "10% off CSU discount applied\n";
						
						msgTable.put("Order ",msg);
						priceTable.put("Total ", price);
					}
					else
					{
						l.setText("no coupons applied");
					}
						
				}

				
			}

			public class Promotional extends JPanel implements ActionListener
			{
				
				private static final long serialVersionUID = 1L;
			    
		        public Promotional()
		        {
		 
					setLayout(new GridBagLayout());
			        setBorder(new CompoundBorder(new TitledBorder("Promotional Items (10% off)"), new EmptyBorder(12, 0, 0, 0)));
			        GridBagConstraints gbc = new GridBagConstraints();
			        gbc.gridx = 0;
			        gbc.gridy = 0;
			        gbc.anchor = GridBagConstraints.WEST;
			        gbc.insets = new Insets(0, 0, 0, 4);
			        JPanel panel = new JPanel(new GridBagLayout());   
			        
			        panel.add(L);
			        gbc.gridy++;
			        gbc.gridy++;
			        panel.add((oRings = new JRadioButton("Onion Rings")), gbc); // add prices here
			        gbc.gridy++;
			        panel.add((fries = new JRadioButton("Fries")), gbc);
			        gbc.gridy++;
			        panel.add((sandwich = new JRadioButton("Chicken Sandwich")), gbc);
			        
			        oRings.addActionListener(this);
		        	fries.addActionListener(this);
		        	sandwich.addActionListener(this);

			        gbc.gridx++;
			        gbc.weightx = 1;
			        gbc.fill = GridBagConstraints.HORIZONTAL;
			        panel.add((Label = new JLabel("")), gbc);

			        gbc.gridx = 0;
			        gbc.gridy = 0;
			        gbc.weightx = 1;
			        gbc.gridwidth = GridBagConstraints.REMAINDER;
			        gbc.fill = GridBagConstraints.HORIZONTAL;
			        gbc.insets = new Insets(4, 4, 4, 4);
			        add(panel, gbc);

			        gbc.gridy++;
			        gbc.fill = GridBagConstraints.NONE;
			        gbc.anchor = GridBagConstraints.CENTER;
			       
	
		        }

				@Override
				public void actionPerformed(ActionEvent e) 
				{
					if (oRings.isSelected())
					{
						JOptionPane.showMessageDialog(this,"ONION RINGS ADDED TO CART");
						price += 5.40;
						msg += "added -- ONION RINGS (10% off) : $5.40\n";
						
						msgTable.put("Order ", msg);
						priceTable.put("Total ", price);
						
					}
					
					else if (fries.isSelected())
					{
						JOptionPane.showMessageDialog(this,"FRIES ADDED TO CART");
						
						price += 3.60;
				        msg += "added -- FRIES (10% off) : $3.60\n";
						
						msgTable.put("Order ", msg);
						priceTable.put("Total ", price);
					}
					
					else if (sandwich.isSelected())
					{
						JOptionPane.showMessageDialog(this,"CHICKEN SANDWICH ADDED TO CART");
						
						 price += 10.80;
				         msg += "added -- CHICKEN SANDWICH (10% off) : $10.80\n";
						
						msgTable.put("Order ", msg);
						priceTable.put("Total ", price);
					}
							
				}
				
			}

			public class SelectPayment extends JPanel implements ActionListener 
			{
				 
				private static final long serialVersionUID = 1L;
				   
				public SelectPayment()	
				{
				 	setLayout(new GridBagLayout());
			        setBorder(new CompoundBorder(new TitledBorder("Select Payment Type (upon arrival only)"), new EmptyBorder(8, 0, 0, 0)));
			        GridBagConstraints gbc = new GridBagConstraints();
			        gbc.gridx = 0;
			        gbc.gridy = 0;
			        gbc.insets = new Insets(0, 0, 0, 4);
			        gbc.anchor = GridBagConstraints.WEST;

			        JPanel panel = new JPanel(new GridBagLayout());
			        
			        panel.add((card = new JRadioButton("Pay with card")), gbc);
			        gbc.gridy++;
			        panel.add((cash = new JRadioButton("Pay with cash")), gbc);
			        gbc.gridy++;
			        panel.add((VIP = new JRadioButton("Charge to VIP account")), gbc);
			        
			        card.addActionListener(this);
			        cash.addActionListener(this); 
			        VIP.addActionListener(this);
			        
			        gbc.gridx++;
			        gbc.weightx = 1;
			        gbc.fill = GridBagConstraints.HORIZONTAL;
			        panel.add((Lab = new JLabel("")), gbc);

			        gbc.gridx = 0;
			        gbc.gridy = 0;
			        gbc.weightx = 1;
			        gbc.gridwidth = GridBagConstraints.REMAINDER;
			        gbc.fill = GridBagConstraints.HORIZONTAL;
			        gbc.insets = new Insets(4, 4, 4, 4);
			        add(panel, gbc);

			        gbc.gridy++;
			        gbc.fill = GridBagConstraints.NONE;
			        gbc.anchor = GridBagConstraints.CENTER;
			        
 
				}


				@Override
				public void actionPerformed(ActionEvent e) 
				{

					if (card.isSelected())
					{
						if (cash.isSelected() || VIP.isSelected())
			    		{
			    			JOptionPane.showMessageDialog(this,"WARNING: Payment type already selected");
			    			cash.setSelected(false);
			    			VIP.setSelected(false);
			    		}
			    		else
			    		{
			    			msg = msg + "Payment Type: CARD\n";
			    	   	    msgTable.put("Order ",msg);
			    	   	      
			    	   	    System.out.println(msgTable);  
			    		}

					}
			    	
					else if (cash.isSelected())
					{
			    		if (card.isSelected() || VIP.isSelected())
			    		{
			    			JOptionPane.showMessageDialog(this,"WARNING: Payment type already selected");
			    			card.setSelected(false);
			    			VIP.setSelected(false);
			    		}
			    		else
			    		{
			    			msg = msg + "Payment Type: CASH\n";
			    			msgTable.put("Order ",msg);
			    	   	      
			    	   	    System.out.println(msgTable); 
			    		}
					}
					
					else if (VIP.isSelected())
					{
			    		if (card.isSelected() || cash.isSelected())
			    		{
			    			JOptionPane.showMessageDialog(this,"WARNING: Payment type already selected");
			    			card.setSelected(false);
			    			cash.setSelected(false);
			    		}
			    		else
			    		{
			    			msg = msg + "Payment Type: VIP Account\n";
			    			msgTable.put("Order ",msg);
			    	   	      
			    	   	    System.out.println(msgTable); 
			    		}
					}		
					
				}
				
			}

			public class ReviewOrder extends JPanel implements ActionListener
			{
				
				private static final long serialVersionUID = 1L;
				
				int rand_int = rand.nextInt(1000);
				

				
				public ReviewOrder()
				{
 
					setLayout(new GridBagLayout());
			        GridBagConstraints gbc = new GridBagConstraints();
			        gbc.gridx = 0;
			        gbc.gridy = 0;
			        gbc.gridwidth = GridBagConstraints.REMAINDER;
			        gbc.fill = GridBagConstraints.HORIZONTAL;
			        gbc.weightx = 1;
			        gbc.insets = new Insets(4, 4, 4, 4);

			        gbc.gridy++;
			        add((help = new JButton("Help")), gbc); // phone number
			        gbc.gridy++;
			        add((edit = new JButton("Edit Order")), gbc);
			        gbc.gridy++;
			        gbc.weighty = 1;
			        gbc.anchor = GridBagConstraints.SOUTH;
			        add((review = new JButton("Review Order")), gbc); // review order
			        
			        gbc.gridy++;
			        gbc.weighty = 0;
			        gbc.anchor = GridBagConstraints.SOUTH;
			        add((submit = new JButton("SUBMIT ORDER")), gbc); // submit order
			        
			        // button action listeners
			        help.addActionListener(this);
			        edit.addActionListener(this);
			        review.addActionListener(this);
			        submit.addActionListener(this);
			        
					help.setFont(new Font("ITALIC", Font.BOLD, 12));
					help.setBackground(Color.white);
					help.setForeground(Color.darkGray);
					help.setOpaque(true);
					
					edit.setFont(new Font("ITALIC", Font.BOLD, 12));
					edit.setBackground(Color.white);
					edit.setForeground(Color.darkGray);
					edit.setOpaque(true);
					
					review.setFont(new Font("ITALIC", Font.BOLD, 12));
					review.setBackground(Color.white);
					review.setForeground(Color.darkGray);
					review.setOpaque(true);
					
					submit.setFont(new Font("ITALIC", Font.BOLD, 18));
					submit.setBackground(Color.PINK);
					submit.setForeground(Color.black);
					submit.setOpaque(true);

				}

				@Override
				public void actionPerformed(ActionEvent e) 
				{
					Object obj = e.getSource();
			    	
			    	if (obj == help)
			    	{
			    		JOptionPane.showMessageDialog(this,"Call 333-444-8888 for assistance");
			    	}
			    	
			    	else if (obj == edit)
			    	{
			    		System.out.println("Edit Order");
			    		tab.add("Edit Order", new EditOrder());
			    	}
			    	
			    	else if (obj == review)
			    	{
			    		System.out.println("Review Order");
						
						JOptionPane.showMessageDialog(f,"CART\n\n" + msg + "\nTotal: $" + String.format("%.2f", price) + "\n\n");
			    		System.out.println(msgTable);
			     	    System.out.println(priceTable);
			    	}

			    	else if (obj == submit)
			    	{
			    		if (msgTable.isEmpty() && priceTable.isEmpty() )
			    		{
			    			JOptionPane.showMessageDialog(this,"ERROR: Items must be added to cart before submitting");
			    		}
			    		
			    		else
			    		{
			    			System.out.println("Submit"); 
			    			
				    		try 
				    		{
								downloadReceipt();
							} catch (IOException e1) 
				    		{
								e1.printStackTrace();
							}
				    		
				    		JOptionPane.showMessageDialog(this,String.format("ORDER SUBMITTED\nORDER #: %d\nOrder will be ready in 20-30 minutes",rand_int));
				    	
				    		// reset all buttons/fields after submission
				    		
				    		t_Coupons.setText("");
				    		confirm.setSelected(false);
				    		l.setText("no coupons applied");
				    		
				    		oRings.setSelected(false);
				    		fries.setSelected(false);
				    		sandwich.setSelected(false);
				    		
				    		card.setSelected(false);
				    		cash.setSelected(false);
				    		
				    		// clear global vars and hashtables
				    		msg = "";
				    		price = 0;
				    		msgTable.clear();
				    		priceTable.clear();
				    		
				    		
			    		}
			        
			    	}
			    	
			   
				}
				

				private void downloadReceipt() throws IOException 
				{
					String p = String.format("%.2f", price);
			        String o = String.format("%d", rand_int );
					
			        
			        FileWriter wr = new FileWriter("receipt.txt");
			 
			        
			        
			        wr.write("CSU RECEIPT:\n\n");
			        wr.write("SUMMARY:\nORDER #: ");
			        wr.write(o);
			        wr.write("\n\n");
			        
			        wr.write(msg);
			        wr.write("TOTAL:\n");
			        wr.write("$" + p);
			        
			        
			        
			        System.out.println("FILE:" + msg);
			        System.out.println("FILE:"+ p);
			         
			        wr.flush();
			        wr.close();
					
				}
				

			}


	}



	
	
}
