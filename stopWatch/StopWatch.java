
import java.awt.event.*;
import  java.awt.*;
import javax.swing.*;

public class StopWatch implements ActionListener {
    JFrame frame = new JFrame();
    JButton startButton = new JButton("Start");
    JButton resetButton = new JButton("Reset");
    JLabel timeLabel = new JLabel();

    //time bat dau
    int elapsedTime =0;
    int seconds = 0;
    int minutes = 0;
    int hours = 0;
    boolean started = false;
    String second_string = String.format("%02d",seconds);
    String minutes_string = String.format("%02d",minutes);
    String hours_string = String.format("%02d",hours);

    Timer timer = new Timer(1000, new ActionListener() {

            public void actionPerformed(ActionEvent e){
                //set run time
                elapsedTime += 1000;
                hours = (elapsedTime/3600000);
                minutes = (elapsedTime/60000)%60;
                seconds = (elapsedTime/1000)%60;
                second_string = String.format("%02d",seconds);
               minutes_string = String.format("%02d",minutes);
               hours_string = String.format("%02d",hours);
               timeLabel.setText(hours_string+":"+minutes_string+":"+second_string);
            }
    });

 StopWatch(){
//css => 00:00
         timeLabel.setText(hours_string+":"+minutes_string+":"+second_string);
         timeLabel.setBounds(100,100,200,100);
         timeLabel.setFont(new Font("Verdana",Font.PLAIN,35));
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);

//css => nut start
     startButton.setBounds(100,200,100,50);
     startButton.setFont(new Font("Ink Free",Font.PLAIN,20));
     startButton.setFocusable(false);
     startButton.addActionListener(this);

     //css => nut reset
    resetButton.setBounds(200,200,100,50);
     resetButton.setFont(new Font("Ink Free",Font.PLAIN,20));
     resetButton.setFocusable(false);
    resetButton.addActionListener(this);
    //add vao css
frame.add(startButton);
frame.add(resetButton);
frame.add(timeLabel);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(420,420);
frame.setLayout(null);
frame.setVisible(true);
 }
    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==startButton){
    start();

    //click double in start
    if(started==false){
        started=true;
        startButton.setText("Stop");
        start();
    }
    else{
        started=false;
        startButton.setText("Start");
        stop();
    }

}
//click reset
        if(e.getSource()==resetButton){
            started=false;
            startButton.setText("Start");
            reset();
        }
    }
    void start(){
timer.start();
    }
    void stop(){
timer.stop();
    }
    void reset(){
        timer.stop();
        elapsedTime=0;
        seconds=0;
        minutes=0;
        hours=0;

        second_string = String.format("%02d",seconds);
        minutes_string = String.format("%02d",minutes);
        hours_string = String.format("%02d",hours);
        timeLabel.setText(hours_string+":"+minutes_string+":"+second_string);

    }
}
