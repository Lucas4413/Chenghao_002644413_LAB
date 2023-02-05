package Model;

import java.util.ArrayList;

public class MedcineCatalog {
	ArrayList<Medicne> medicneCatalog;
	
	public MedcineCatalog() {
		this.medicneCatalog = new ArrayList<Medicne>();
	}

	public ArrayList<Medicne> getMedicneCatalog() {
		return medicneCatalog;
	}

	public void setMedicneCatalog(ArrayList<Medicne> medicneCatalog) {
		this.medicneCatalog = medicneCatalog;
	}
	
	public Medicne createMedicne(String name, double dosage) {
		Medicne medicne = new Medicne();
		
		medicne.setMedcineName(name);
		medicne.setDosage(dosage);
		
		this.medicneCatalog.add(medicne);
		
		return medicne;
	}
	
	public Boolean checkMedcineUnique(String name) {
		for (Medicne m:this.medicneCatalog) {
			if (m.getMedcineName().equals(name)) {
				return false;
			}
		}
		
		return true;
	}
	
	public Medicne getValueAt(int Idx) {
		return this.medicneCatalog.get(Idx);
	}
	
	public Medicne getMedcineWithName(String name) {
		for(Medicne med:this.medicneCatalog) {
			if(med.getMedcineName().equals(name)) {
				return med;
			}
		}
		return null;
	}
	
	public void delete(int Idx) {
		this.medicneCatalog.remove(Idx);
	}
}
