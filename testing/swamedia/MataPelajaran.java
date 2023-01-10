package testing.swamedia;

public class MataPelajaran {
	
	private int id;
	private String namaPelajaran;
	
	
	public MataPelajaran() {
		super();
	}
	public MataPelajaran(int id, String namaPelajaran) {
		super();
		this.id = id;
		this.namaPelajaran = namaPelajaran;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNamaPelajaran() {
		return namaPelajaran;
	}
	public void setNamaPelajaran(String namaPelajaran) {
		this.namaPelajaran = namaPelajaran;
	}
	
}
