package classes;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitleBar extends JPanel{		//must extend JPanel to organize components for the GUI

	//constructor
	TitleBar(){
		this.setPreferredSize(new Dimension(400,80));
		this.setBackground(Color.gray);					

		JLabel titleText = new JLabel("To Do List");		
		titleText.setPreferredSize(new Dimension(200,80));
		titleText.setFont(new Font("Helvetica", Font.BOLD, 20));
		titleText.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(titleText);			//adding all work to the title bar 
	}
	
}
