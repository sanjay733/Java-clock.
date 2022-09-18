import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
	
	
	
	   Calendar Calendar;                  //using the abstract calendar class
	   SimpleDateFormat timeFormat;        //using SimpleDateFormat for formatting data or parsing data to one another - here for timeFormat
	   SimpleDateFormat dayFormat;         //using SimpleDateFormat for formatting data or parsing data to one another - here for dayFormat
	   SimpleDateFormat dateFormat;        //using SimpleDateFormat for formatting data or parsing data to one another - here for dateFormat
	   JLabel timeLabel;
	   JLabel dayLabel;
	   JLabel dateLabel;
	   String time;
	   String Day;
	   String date;
	   
	   
        MyFrame(){
        	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	this.setTitle("My Clock-Sanjay");
        	this.setLayout(new FlowLayout());
        	this.setSize(350,200);
        	this.setResizable(false);
        	timeFormat = new SimpleDateFormat("hh:mm:ss a");
        	dayFormat  = new SimpleDateFormat("EEEE");
        	dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
        	
        	
        	timeLabel=new JLabel();
        	dayLabel = new JLabel();
        	dateLabel = new JLabel();
        	
        	
        	timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));      
        	timeLabel.setForeground(new Color(0X00FF00));
        	timeLabel.setBackground(Color.black);
        	timeLabel.setOpaque(true);
        
        	
        	dayLabel.setFont(new Font("Ink Free",Font.PLAIN,35)); 
        	
        	
        	dateLabel.setFont(new Font("Ink Free",Font.PLAIN,25));
        	
        	this.add(timeLabel);
        	this.add(dayLabel);
        	this.add(dateLabel);
        	this.setVisible(true);
        	
        	setTime();
        	
        }
        public void setTime() {
        	while(true) {
        		
        	time= timeFormat.format(Calendar.getInstance().getTime());
        	timeLabel.setText(time);
        	
        	Day= dayFormat.format(Calendar.getInstance().getTime());
        	dayLabel.setText(Day);
        	
        	date= dateFormat.format(Calendar.getInstance().getTime());
        	dateLabel.setText(date);
        	
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        }
        }
}
