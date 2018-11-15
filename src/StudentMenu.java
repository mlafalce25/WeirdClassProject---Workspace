import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Write a description of class StudentMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentMenu
{
    // User interface data
    JButton [] m;
    JLabel capName;
    JLabel capOther;
    JTextField txtName;
    JTextField txtOther;
    Student [] roster;

    // Student data
    Student current;

    /**
     * Constructor for objects of class Menu
     */
    public StudentMenu()   {
        // Create the user interface
        JFrame f;
        JPanel p;
        ButtonGroup g;
        String [] actions = {"Get", "Ids", "CS Majors", "Students"};
        f = new JFrame("Student Database");
        p = new JPanel(new GridLayout(2,3));
        capName = new JLabel("Name");
        capOther = new JLabel("Other");
        txtName = new JTextField(8);
        txtOther = new JTextField(8);
        p.add(capName);
        p.add(txtName);
        p.add(capOther);
        p.add(txtOther);
        // Buttons
        m = new JButton[actions.length];
        ButtonListener bl = new ButtonListener();
        int i = 0;
        for (String d: actions) {
            m[i] = new JButton(d);
            m[i].addActionListener(bl);
            p.add(m[i++]);

        }
        f.getContentPane().add(p);
        f.pack();
        f.show();

        // 1) Create a array from roster of four student objects
		 roster = new Student[3];
		roster[0] = new Student("Matt");
		roster[1] = new Student("John");
		roster[2] = new Student("Nico");
		roster[3] = new Student("Kevin");
    }
    
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JButton b = (JButton)event.getSource();

            if (b == m[0]) { // User clicked "Get" button
                String name = txtName.getText();

                // 2) Find the student among the objects and print his or her information
				for(int x = 0; x<4; x++){
					if(name.equals(roster[x].getName())){
						System.out.println(roster[x].toString());
					}
				}
            } else if (b == m[1]) { // User clicked the "Ids" button
            	
                // 3) Print the ID of the recently selected student
            	String name = txtName.getText();
            	for(int x = 0; x<4; x++){
					if(name.equals(roster[x].getID())){
						System.out.println(roster[x].getID());
					}
				}

            } else if (b == m[2]) { //User clicked the "CS Major" button

                // 4 Print all the CS majors
            	for(int x=0;x<4;x++){
            		if(roster[x].getMajor() == Major.CS){
            			System.out.println(roster[x].toString());
            		}
            	}
            } else if (b == m[3]) { // Usr clicked on the "Students" method
		// 5 Print all students
            	for(int x=0;x<4;x++){
            		System.out.println(roster[x].toString());
            	}

            }
        }
    }
}
