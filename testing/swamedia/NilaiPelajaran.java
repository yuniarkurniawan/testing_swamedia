package testing.swamedia;


public class NilaiPelajaran {
	
	private int id;
	private MataPelajaran mataPelajaran;
	private Siswa siswa;
		
	public NilaiPelajaran() {
		super();
	}
	
	public NilaiPelajaran(int id, MataPelajaran mataPelajaran, Siswa siswa) {
		super();
		this.id = id;
		this.mataPelajaran = mataPelajaran;
		this.siswa = siswa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MataPelajaran getMataPelajaran() {
		return mataPelajaran;
	}

	public void setMataPelajaran(MataPelajaran mataPelajaran) {
		this.mataPelajaran = mataPelajaran;
	}

	public Siswa getSiswa() {
		return siswa;
	}

	public void setSiswa(Siswa siswa) {
		this.siswa = siswa;
	}

	@Override
	public String toString() {
		return "NilaiPelajaran [id=" + id + ", mataPelajaran=" + mataPelajaran + ", siswa=" + siswa + "]";
	}
	
}
