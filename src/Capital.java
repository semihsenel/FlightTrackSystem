package odev;

import java.io.Serializable;

public class Capital implements Serializable{
        private String name;
	private final ControlTower tower;
	
	public Capital(String name) {
		tower = new ControlTower();
                this.name = name;
	}

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        
}
