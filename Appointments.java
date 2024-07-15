import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Appointments extends JPanel implements ActionListener 
	{
	    
		private static final long serialVersionUID = 1L;

        Map<String, Map<Integer, String>> Dates = new HashMap<String, Map<Integer, String>>();
	    Map<Integer, String> Appointments = new HashMap<Integer, String>();   
		
		private JPanel pan = new JPanel(new GridBagLayout());  

		private JButton addAppt = new JButton("Add Appointment");
		private JButton checkAppt = new JButton("Check Appointment");
        private JButton removeAppt = new JButton("Remove Appointment");

        private JTextField addText = new JTextField("Enter 'Name, Date(yyyy-MM-dd)', Table");
        private JTextField checkText = new JTextField("Enter Name, Date to check(yyyy-MM-dd)");
        private JTextField removeText = new JTextField("Enter Name to Remove");
		
		private GridBagConstraints g = new GridBagConstraints();

	    public Appointments() 
	    {
	    	// buttons -------------
	    	
	    	addAppt.setFont(new Font("ITALIC", Font.BOLD, 12));
			addAppt.setBackground(Color.white);
			addAppt.setForeground(Color.darkGray);
			addAppt.setOpaque(true);
			addAppt.addActionListener(this);
			
			checkAppt.setFont(new Font("ITALIC", Font.BOLD, 12));
			checkAppt.setBackground(Color.white);
			checkAppt.setForeground(Color.darkGray);
			checkAppt.setOpaque(true);
			checkAppt.addActionListener(this);
			
			removeAppt.setFont(new Font("ITALIC", Font.BOLD, 12));
			removeAppt.setBackground(Color.white);
			removeAppt.setForeground(Color.darkGray);
			removeAppt.setOpaque(true);
			removeAppt.addActionListener(this);
			

			setBorder(new CompoundBorder(new TitledBorder("Appointments"), new EmptyBorder(4, 0, 0, 0)));
	        g.gridx = 0;
	        g.gridy = 0;
	        g.gridwidth = GridBagConstraints.REMAINDER;
	        g.fill = GridBagConstraints.HORIZONTAL;
	        g.weightx = 1;
	        g.insets = new Insets(4, 4, 4, 4);

	        g.weighty = 1;
	        g.anchor = GridBagConstraints.NORTH;
			
            pan.add(addText, g);
            g.gridy++;
	        pan.add(addAppt, g);
	        g.gridy++;
	        
            pan.add(checkText, g);
            g.gridy++;
            pan.add(checkAppt, g);
	        g.gridy++;
	        
            pan.add(removeText, g);
            g.gridy++;
            pan.add(removeAppt, g);
	        g.gridy++;

	        add(pan, g);

	    }
	    

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			Object obj = e.getSource();
		
			if (obj == addAppt)
			{
				String[] inpt = addText.getText().split(",");	 

                String name = inpt[0].strip();
                String apt = inpt[1].strip();
                Integer table = Integer.parseInt(inpt[2].strip());

				if(Dates.containsKey(apt)){
                    if(Dates.get(apt).containsKey(table)){
                        JOptionPane.showMessageDialog(this, "Table already taken!");	
                    }
                    else{
                        Dates.get(apt).put(table, inpt[0]);
                        JOptionPane.showMessageDialog(this, "Table Added!");
                    }
                }
                else {
                    Map<Integer, String> tables = new HashMap<Integer, String>(); 
                    tables.put(table,name);
                    Dates.put(apt, tables);
                    JOptionPane.showMessageDialog(this, "Table Added!");

                }
			}

			else if (obj == checkAppt)
			{
				String[] inpt = checkText.getText().split(",");
                String name = inpt[0].strip();
                String apt = inpt[1].strip();

                if(Dates.containsKey(apt)){
                    if(Dates.get(apt).containsValue(name)){
                        JOptionPane.showMessageDialog(this, "You have an appointment!");

                        }
                    }
                else{
                    JOptionPane.showMessageDialog(this, "There are no appointments on this date!");
                }
            }
				
		    else if (obj == removeAppt)
			{
                String[] inpt = checkText.getText().split(",");
                String name = inpt[0].strip();
                String apt = inpt[1].strip();

                if(Dates.containsKey(apt)){
                    if(Dates.get(apt).containsValue(name)){
                        Dates.get(apt).values().remove(name);
                        JOptionPane.showMessageDialog(this, "Appointment Removed!");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "You have no appointment!");
                }
				
			}
			
		}


			
		
	}