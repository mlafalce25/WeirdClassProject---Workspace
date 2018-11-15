import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

/**
 * Write a description of class StudentMenu here.
 * 
 * @author (Matthew LaFalce) 
 * @version (a version number or a date)
 */
public class Class1
{
    // User interface data
    JButton [] m;
    JLabel capName;
    JLabel capOther;
    JTextField txtName;
    JTextField txtOther;

    // Student data: YOUR DECLARATIONS GO HERE
    ArrayList<Student> roster;

    /**
     * Constructor for objects of class Menu
     */
    public Class1()   {
        // Create the user interface
        JFrame f;
        JPanel p;
        ButtonGroup g;
        String [] actions = {"List Students", "Find Student", "Add Student"};
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

        // 1) Instantiate the ArrayList
       ArrayList<Student> roster = new ArrayList<Student>(); 
        // 2) Add a few students to the list
       roster.add(new Student("Nico"));
       roster.add(new Student("Matt"));
       roster.add(new Student("Jimmy"));
       roster.add(new Student("RJ"));
       

    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JButton b = (JButton)event.getSource();

            if (b == m[0]) { // User clicked List Students
		String name = txtName.getText();

                // 3) Lists the students
				for(int x=0;x<roster.size();x++){
					System.out.print("Student "+x+": "+roster.get(x));
				}
            } else if (b == m[1]) { // User clicked the find student
		String name = txtName.getText();
                // 4) Find and print the student in the list 
				for(int x=0;x<roster.size();x++){
					if(name.equalsIgnoreCase(roster.get(x).getName())){
						System.out.println(name+" is in position "+x+" in the roster.");
					}
					
				}
            } else if (b == m[2]) { //User clicked the Add Student button
		String name = txtName.getText();
                // 4 Create a new Student object and add to list
				roster.add(new Student(name));
            } 
        }
    }
}
