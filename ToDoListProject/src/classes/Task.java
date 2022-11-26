package classes;
import java.awt.BorderLayout; 
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Task extends JPanel{
	
	private JLabel index;
	private JTextField taskName;
	private JButton finished;
	private JTextField timeNeeded;
	
	private boolean checked;
	
	//constructor
	Task(){
		this.setPreferredSize(new Dimension(40,20));
		this.setBackground(Color.gray);	
		this.setLayout(new BorderLayout());		
		
		checked = false;	//by default
		
		index = new JLabel("");
		index.setPreferredSize(new Dimension(20,20));			
		index.setHorizontalAlignment(JLabel.CENTER);
		this.add(index, BorderLayout.WEST);
		
		taskName = new JTextField("Write Task: ");
		taskName.setBorder(BorderFactory.createEmptyBorder());		//border layout sets the horizontal gap in between components 
		taskName.setBackground(Color.gray);
		this.add(taskName,BorderLayout.CENTER);
		
		timeNeeded = new JTextField("     Time Needed: ");
		timeNeeded.setBorder(BorderFactory.createEmptyBorder());		 
		timeNeeded.setBackground(Color.gray);
		this.add(timeNeeded,BorderLayout.AFTER_LAST_LINE);
		
		finished = new JButton("Close");
		finished.setPreferredSize(new Dimension(40,20));		//want it to be wider so encompass it 
		finished.setBorder(BorderFactory.createEmptyBorder());
		this.add(finished, BorderLayout.EAST);
		
	}

	public JButton getFinished() {
		return finished;
	}
	
	public void changeIndex(int num) {
		this.index.setText(num+"");		//expects a string 
		this.revalidate();
	}
	
	public void changeState() {						//once click finished the task then turns green 	
		this.setBackground(Color.green);
		taskName.setBackground(Color.green);  			//changes color of task
		timeNeeded.setBackground(Color.green);
		checked = true;								//whatever is false hasn't been finished 
		revalidate();
	}
	
	public boolean getState() {
		return checked; 
	}
}
