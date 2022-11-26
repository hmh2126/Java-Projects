package classes;
import java.awt.Color; 
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class List extends JPanel {
	
	//constructor
	List(){
		GridLayout layout = new GridLayout(10,1);		//using different layout
		layout.setVgap(5);								//for spacing 
		
		this.setLayout(layout);
		//this.setBackground(Color.red);		//testing  
		this.setPreferredSize(new Dimension(400,560));
	}

	public void updateNumbers() {
		Component[] listItems = this.getComponents();			//array of all components and then loop through them and add the right number
		for(int i = 0; i < listItems.length; i++) {
			if(listItems[i] instanceof Task) {					//if at that index it is a instance of the Task class then ..
				((Task)listItems[i]).changeIndex(i+1);			//must cast and change index so doesn't start at zero
			}
		}
	}
	
	public void removeCompletedTasks()
	{
		
		for(Component c : getComponents())
		{
			if(c instanceof Task)
			{
				if(((Task)c).getState())			//casting
				{
					remove(c);
					updateNumbers();
				}
			}
		}
		
	}
	public void removeAll() {
		for(Component c : getComponents())
		{
			if(c instanceof Task){
				remove(c);
			}
		}
	}
		
}

