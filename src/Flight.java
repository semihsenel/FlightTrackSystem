package odev;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

//such as the weekdays, the departure and arrival times, the aircraft model, the flight number and the name of the airlines.
public class Flight extends Thread implements Serializable {
	private LinkedList<String> weekdays;
        private String departureTime,arrivalTime;
	private String aircraftModel;
	private String flightNumber;
	private String airlines;
	private String departureCity;
	private String arrivalCity;
        private boolean isTime;
        private boolean askPermission;
        private boolean isArrived;
	
	public Flight(String flightNumber, String aircraftModel, String airlines, String departureTime,
			String arrivalTime, String departureCity, String arrivalCity) {
		weekdays = new LinkedList<>(); 
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.aircraftModel = aircraftModel;
		this.flightNumber = flightNumber;
		this.airlines = airlines;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
                this.isTime = false;
                this.askPermission = false;
                this.isArrived = false;
        }

        public boolean isIsArrived() {
            return isArrived;
        }

        public void setIsArrived(boolean isArrived) {
            this.isArrived = isArrived;
        }


        public boolean getAskPermission() {
            return askPermission;
        }

        public void setAskPermission(boolean askPermission) {
            this.askPermission = askPermission;
        }

        public boolean getIsTime() {
            return isTime;
        }

        public void setIsTime(boolean isTime) {
            this.isTime = isTime;
        }
        
	public LinkedList<String> getWeekdays() {
		return weekdays;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public String getAircraftModel() {
		return aircraftModel;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public String getAirlines() {
		return airlines;
	}

	public void setWeekdays(LinkedList<String> weekdays) {
		this.weekdays = weekdays;
	}
        
        public void removeWeekdays(){
            weekdays.clear();
        }

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}
	
	public String getDepartureCity() {
		return departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}
	
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

        public void setAircraftModel(String aircraftModel) {
            this.aircraftModel = aircraftModel;
        }
        
	public void addWeekday(String day) {
		weekdays.add(day);
	}
        
        public String[] getInfo(){
            String[] info = new String[8];
            info[0] = this.flightNumber;
            info[1] = this.aircraftModel;
            info[2] = this.airlines;
            info[3] = this.departureTime;
            info[4] = this.arrivalTime;
            info[5] = this.departureCity;
            info[6] = this.arrivalCity;
            info[7] = "";
            for (String weekday : weekdays) {
                info[7] += weekday + ",";
            }
            if (!info[7].isEmpty() ) {
                info[7] = info[7].substring(0, info[7].length() - 1);  
            }
            return info;
        }

    @Override
    public void run() {
        
        while(!isTime){
            try{
                if(Gui.msg.substring(11, 16).equals(this.departureTime)){
                    for (String w : weekdays) {

                        if(Gui.msg.substring(17).equalsIgnoreCase(w.substring(0,3))){
                            Gui.msgState = this.flightNumber + " has taken off!";
                            isTime = true;
                        }
                    }
                }
            } catch(NullPointerException e){
                
            }
        }
        try {
            Flight.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Flight.class.getName()).log(Level.SEVERE, null, ex);
        }
        Gui.msgState = "";
        while(!isArrived){
            while(isTime){
                if(Gui.msg.substring(11, 16).equals(this.arrivalTime)){
                    this.askPermission = true;
                }
            }
        }
    }  
}
