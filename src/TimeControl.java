package odev;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class TimeControl extends Thread{
    private boolean resume;
    private Date date;
    private SimpleDateFormat formatter;

    public TimeControl(boolean resume) {
        this.resume = resume;
        this.date = new Date(System.currentTimeMillis());
        this.formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm EEE", Locale.ENGLISH);
    }

    public TimeControl(boolean resume, Date date) {
        this.resume = resume;
        this.date = date;
        this.formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm EEE", Locale.ENGLISH);
    }
    

    @Override
    public void run() {
        try{
            Gui.msg = formatter.format(date);
        } catch(NullPointerException e){
            
        }
        while(resume) {
            try {
                    Thread.sleep(1000);
            } catch (InterruptedException e) {
                    System.out.println("Interrupted");
            }
            date.setTime(date.getTime() + 60000);
            try{
                Gui.msg = formatter.format(date);
            } catch(NullPointerException ex){
                
            }
        }
    }

    public boolean isResume() {
        return resume;
    }

    public void setResume(boolean resume) {
        this.resume = resume;
    }
    
    public boolean getResume(){
        return resume;
    }

    public Date getDate() {
        return date;
    }
    
    public String getTime(){
        return formatter.format(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    

}


