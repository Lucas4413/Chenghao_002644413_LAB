package Model;

import java.net.Inet4Address;
import java.util.ArrayList;

public class VitaSignHistory {
	ArrayList<Observation> vitaSignHistory;
	
	public VitaSignHistory() {
		this.vitaSignHistory = new ArrayList<Observation>();
	}

	public ArrayList<Observation> getVitaSignHistory() {
		return vitaSignHistory;
	}

	public void setVitaSignHistory(ArrayList<Observation> vitaSignHistory) {
		this.vitaSignHistory = vitaSignHistory;
	}
	
	public Observation createObservation(int observationId, double bloodPressure, double temperature) {
		Observation observation = new Observation();
		
		observation.setObservationId(observationId);
		observation.setBloodPress(bloodPressure);
		observation.setTemperature(temperature);
		
		this.vitaSignHistory.add(observation);
		
		return observation;
	}
	
	public Boolean checkObservationIdUnique(int id) {
		for (Observation observation : this.vitaSignHistory) {
			if(observation.getObservationId() == id) {
				return false;
			}
		}
		
		return true;
	}
	
	public void removeById(int id) {
		for (Observation o:this.vitaSignHistory) {
			if(o.getObservationId()==id) {
				this.vitaSignHistory.remove(o);
			}
		}
	}
	
	public int getIndexWithID(int id) {
		for (Observation o:this.vitaSignHistory) {
			if(o.getObservationId()==id) {
				return this.vitaSignHistory.indexOf(o);
			}
		}
		return -1;
	}
	
	public Observation getValueAt(int Idx) {
		return this.vitaSignHistory.get(Idx);
	}
}
