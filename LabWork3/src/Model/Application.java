package Model;

public class Application {
	private MedcineCatalog Catalog;
	private VitaSignHistory History;
	
	public Application() {
		this.Catalog = new MedcineCatalog();
		this.History = new VitaSignHistory();
	}
	
	public MedcineCatalog getCatalog() {
		return Catalog;
	}
	public void setCatalog(MedcineCatalog medcineCatalog) {
		this.Catalog = medcineCatalog;
	}
	public VitaSignHistory getHistory() {
		return History;
	}
	public void setHistory(VitaSignHistory vitaSignHistory) {
		this.History = vitaSignHistory;
	}
	
}
