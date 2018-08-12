
public class RacunBiblioteka {

		
	private double id;
	private String ime;
	private String prezime;
	public double brojPosuðenihKnjiga;
	
	public RacunBiblioteka() {
				}
	public RacunBiblioteka(double id, String ime, String prezime, double brojPosuðenihKnjiga) {
		this.id=id;
		this.ime = ime;
		this.prezime=prezime;;
	    this.brojPosuðenihKnjiga =brojPosuðenihKnjiga;
		
	}
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public double getBrojPosuðenihKnjiga() {
		return brojPosuðenihKnjiga;
	}
	public void setBrojPosuðenihKnjiga(double brojPosuðenihKnjiga) {
		this.brojPosuðenihKnjiga = brojPosuðenihKnjiga;
		
	}
	@Override
	public String toString() {
		return "RacunBiblioteka [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", brojPosuðenihKnjiga="
				+ brojPosuðenihKnjiga + "]";
	}
}
	