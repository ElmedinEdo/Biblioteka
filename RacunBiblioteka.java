
public class RacunBiblioteka {

		
	private double id;
	private String ime;
	private String prezime;
	public double brojPosu�enihKnjiga;
	
	public RacunBiblioteka() {
				}
	public RacunBiblioteka(double id, String ime, String prezime, double brojPosu�enihKnjiga) {
		this.id=id;
		this.ime = ime;
		this.prezime=prezime;;
	    this.brojPosu�enihKnjiga =brojPosu�enihKnjiga;
		
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
	public double getBrojPosu�enihKnjiga() {
		return brojPosu�enihKnjiga;
	}
	public void setBrojPosu�enihKnjiga(double brojPosu�enihKnjiga) {
		this.brojPosu�enihKnjiga = brojPosu�enihKnjiga;
		
	}
	@Override
	public String toString() {
		return "RacunBiblioteka [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", brojPosu�enihKnjiga="
				+ brojPosu�enihKnjiga + "]";
	}
}
	