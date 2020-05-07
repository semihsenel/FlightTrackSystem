package odev;

import java.util.LinkedList;

public class Main {
	
	public static void main(String[] args) {
		boolean useInit = true; // IT must be false after first execution;
		if(useInit) {
			init();
		}
   		Gui arayuz = new Gui();
		arayuz.setVisible(true); 
    }
        
	public static void init() {
            LinkedList<Capital> capitals = new LinkedList<>();
            Capital London = new Capital("London");
            Capital Sydney = new Capital("Sydney");
            Capital NewYork = new Capital("New York");
            Capital Paris = new Capital("Paris");
            Capital Tokyo = new Capital("Tokyo");
            capitals.add(Tokyo);
            capitals.add(London);
            capitals.add(Sydney);
            capitals.add(NewYork);
            capitals.add(Paris);

            Flight flight1 = new Flight("TK1920", "Airbus A330", "Narita Airport", "19:20", "22:30", "Tokyo", "Sydney");
            flight1.addWeekday("Monday");
            flight1.addWeekday("Wednesday");
            Flight flight2 = new Flight("SE55", "Boeing", "Sydney Airport", "06:00", "12:30", "Sydney", "New York");
            flight2.addWeekday("Sunday");
            Flight flight3 = new Flight("YTU", "Boeing 737-800", "Paris-charles De Gaulle Airport", "10:00", "16:40", "Paris", "Tokyo");
            flight3.addWeekday("Tuesday");
            flight3.addWeekday("Wednesday");
            flight3.addWeekday("Thursday");
            Flight flight4 = new Flight("YS3455", "Airbus A350", "John F. Kendedy Airport", "11:15", "15:35", "New York", "London");
            flight4.addWeekday("Saturday");
            Flight flight5 = new Flight("TK1919", "Boeing 737-500", "Narita Airport", "20:10", "04:30", "Tokyo", "Paris");
            flight5.addWeekday("Saturday");
            flight5.addWeekday("Sunday");
            Flight flight6 = new Flight("UK03", "Boeing 737-800", "London Heathrow Airport", "18:45", "21:15", "London", "Paris");
            flight6.addWeekday("Sunday");
            flight6.addWeekday("Friday");
            flight6.addWeekday("Monday");
            Flight flight7 = new Flight("PS05", "Airbus A330", "Paris-charles De Gaulle Airport", "02:30", "08:25", "Paris", "London");
            flight7.addWeekday("Satuday");
            flight7.addWeekday("Sunday");
            Flight flight8 = new Flight("SS", "Beoing", "THY", "14:10", "14:15", "Tokyo", "New York");
            flight8.addWeekday("Tuesday");
            flight8.addWeekday("Thursday");
            Flight flight9 = new Flight("TR55", "Airbus", "London Airport", "16:00", "17:30", "Tokyo", "London");
            flight9.addWeekday("Wednesday");
            flight9.addWeekday("Friday");
            Flight flight10 = new Flight("XX35", "Boeing 738", "THY", "04:30", "05:00", "New York", "Paris");
            flight10.addWeekday("Saturday");
            flight10.addWeekday("Sunday");
            Gui.flights.add(flight1);
            Gui.flights.add(flight2);
            Gui.flights.add(flight3);
            Gui.flights.add(flight4);
            Gui.flights.add(flight5);
            Gui.flights.add(flight6);
            Gui.flights.add(flight7);
            Gui.flights.add(flight8);
            Gui.flights.add(flight9);
            Gui.flights.add(flight10);
            Gui.writeData(capitals,Gui.flights);
		
	}
        
}
