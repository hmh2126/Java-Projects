package classes;
import java.awt.BorderLayout; 
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AppFrame extends JFrame {			//extending JFrame for GUI
	
	private TitleBar title;					//how the to do list will be organized 
	private List list;
	private ButtonPanel buttonPanel;
	
	//added for more functionality
	private JButton addTask;		
	private JButton clearTask;
	private JButton clearAll;
	
	
	//constructor
	AppFrame(){
		
		this.setSize(400,600);			
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		title = new TitleBar();					//creating the objects (components)
		list = new List();
		buttonPanel = new ButtonPanel();
		
		//adding the component classes to the to do list
		this.add(title,BorderLayout.NORTH);						//frames are border layout by default 		
		this.add(buttonPanel,BorderLayout.SOUTH);		
		this.add(list, BorderLayout.CENTER);
		
		addTask = buttonPanel.getAddTask();
		clearTask = buttonPanel.getClearTask();
		clearAll = buttonPanel.getClearAll();
		
		addListeners();			//responds to events such as key press, mouse click, etc
	}
	
	public void addListeners() 
	{
		addTask.addMouseListener(new MouseAdapter()
		{													//when press on add task, enters
		
			@Override
			public void mousePressed(MouseEvent e) 
			{														//Called just after the user presses a mouse button while the cursor is over the listened-to component
				Task task = new Task();
				list.add(task);
				list.updateNumbers();
				
				task.getFinished().addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
					task.changeState(); 							//when click mouse button want the task to change status 
					list.updateNumbers();
					revalidate();
					}
				});
				revalidate();										//if don't then wont appear on screen - tells the layout manager to recalculate (which is necessary when adding components)
				
			}
		});
		
		clearTask.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e)
			{
				list.removeCompletedTasks();
				repaint();
			}
		});
		
		clearAll.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e)
			{
				list.removeAll();
				repaint();
			}
		});
		
		
	}

}
