import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{

	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	SimpleDateFormat eraFormat;
	SimpleDateFormat zoneFormat;
	
	JLabel timeLabel;					 
	JLabel dayLabel;		
	JLabel dateLabel;
	JLabel eraLabel;
	JLabel zoneLabel;
	
	String time;
	String day;
	String date;
	String era;
	String zone;

	
	//constructor
	MyFrame(){

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("The Clock Program");
		this.setLayout(new FlowLayout());
		this.setSize(300,200);
		this.setResizable(true); 
		this.getContentPane().setBackground(Color.gray);
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");							//different ways to format it - check oracle site for documentation 
		dayFormat = new SimpleDateFormat("EEEE");				
		dateFormat = new SimpleDateFormat("MMMM dd, yyyy");				 
		eraFormat = new SimpleDateFormat("G");		
		zoneFormat = new SimpleDateFormat("z");				 


		timeLabel = new JLabel();			
		timeLabel.setFont(new Font("Helvetica", Font.PLAIN, 40));
		timeLabel.setForeground(new Color(0x0000ff));
		timeLabel.setOpaque(true); 													//shows changes made
		
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("Helvetica", Font.PLAIN, 35));
		dayLabel.setForeground(Color.white);
		
		
		dateLabel = new JLabel();
		dateLabel.setFont(new Font("Helvetica", Font.PLAIN, 30));
		dateLabel.setForeground(Color.white);

		
		eraLabel = new JLabel();
		eraLabel.setFont(new Font("Helvetica", Font.PLAIN, 30));
		eraLabel.setForeground(Color.white);
		
		zoneLabel = new JLabel();
		zoneLabel.setFont(new Font("Helvetica", Font.PLAIN, 30));
		zoneLabel.setForeground(Color.white);


		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		this.add(eraLabel);
		this.add(zoneLabel);
		this.setVisible(true);
		
		setTime();																		//update the time every 1 second so that it isn't static in the GUI
		
	}
	
	public void setTime() {
		while(true) {
			time = timeFormat.format(Calendar.getInstance().getTime());					//pass in date by using calendar - gets current time 
			timeLabel.setText(time);			
			
			day = dayFormat.format(Calendar.getInstance().getTime());		
			dayLabel.setText(day);
			
			date = dateFormat.format(Calendar.getInstance().getTime());		
			dateLabel.setText(date);
			
			era = eraFormat.format(Calendar.getInstance().getTime());		
			eraLabel.setText(era);
			
			zone = zoneFormat.format(Calendar.getInstance().getTime());		
			zoneLabel.setText(zone);
		
		
			try {
				Thread.sleep(1000);														//to have this update every 1 second (main thread will sleep for 1000ms then update again) 
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 			
		}
		
	}
	
}
