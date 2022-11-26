package classes;
import java.awt.Color; 
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ButtonPanel extends JPanel{

	private JButton addTask;
	private JButton clearTask;
	private JButton clearAll;
	
	Border emptyBorder = BorderFactory.createEmptyBorder();		//creating a border
	
	//constructor
	ButtonPanel(){
		this.setPreferredSize(new Dimension(400,60));
		//this.setBackground(Color.red);			//checked the size
		
		addTask = new JButton("New Task");
		addTask.setBorder(emptyBorder); 							//makes sure don't have border
		addTask.setFont(new Font("Helvetica", Font.BOLD, 20));
		this.add(addTask);											
		
		this.add(Box.createHorizontalStrut(20));				//helps formatting 
		clearTask = new JButton("Clear Completed Tasks");
		clearTask.setBorder(emptyBorder); 			
		clearTask.setFont(new Font("Helvetica", Font.BOLD, 20));
		this.add(clearTask);
		
		this.add(Box.createHorizontalStrut(20));		
		clearAll = new JButton("Clear All");
		clearAll.setBorder(emptyBorder); 			
		clearAll.setFont(new Font("Helvetica", Font.BOLD, 20));
		this.add(clearAll);

	}
	
	//getters for returning the JButton to write more functionality for them 
	public JButton getAddTask() {		
		return addTask;
	}
	
	public JButton getClearTask() {
		return clearTask;
	}
	
	public JButton getClearAll() {
		return clearAll;
	}
}
