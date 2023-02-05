package Model;

public class Observation {
	int observationId;
	private double bloodPress;
	private double temperature;
	private Medicne medcine;
	
	public Medicne getMedcine() {
		return medcine;
	}
	public void setMedcine(Medicne medcine) {
		this.medcine = medcine;
	}
	public int getObservationId() {
		return observationId;
	}
	public void setObservationId(int observationId) {
		this.observationId = observationId;
	}
	public double getBloodPress() {
		return bloodPress;
	}
	public void setBloodPress(double bloodPress) {
		this.bloodPress = bloodPress;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
}
