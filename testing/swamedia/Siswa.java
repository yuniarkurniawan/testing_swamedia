package testing.swamedia;

public class Siswa {
	
	private int id;
	private String namaSiswa;
		
	public Siswa() {
		super();
	}
	public Siswa(int id, String namaSiswa) {
		super();
		this.id = id;
		this.namaSiswa = namaSiswa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNamaSiswa() {
		return namaSiswa;
	}
	public void setNamaSiswa(String namaSiswa) {
		this.namaSiswa = namaSiswa;
	}
	
	
}
