package Tugas_3_PBO;
import java.util.Scanner;

public class GajiPegawai {
	private String nama;
	private String alamat;
	private int uangTransport;
	private int uangTunjangan;
	private int gajiPokok;
	private int totalGaji;
	
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public int getuangTunjangan() {
		return uangTunjangan;
	}
	public void setUangTunjangan(int uangTunjangan) {
		this.uangTunjangan = uangTunjangan;
	}
	public int getUangTransport() {
		return uangTransport;
	}
	public void setUangTransport(int uangTransport) {
		this.uangTransport = uangTransport;
	}
public int getGajiPokok() {
	return gajiPokok;
}
public void setGajiPokok(int gajiPokok) {
	this.gajiPokok = gajiPokok;
}
public int getTotalGaji() {
	return totalGaji;
}
public void setTotalGaji(int totalGaji) {
	this.totalGaji = totalGaji;
}



public int totalGaji(int uangTunjangan,int uangTransport,int gajiPokok) {
	this.totalGaji = this.uangTunjangan + this.uangTransport + this.gajiPokok;
	return this.totalGaji;
	
}

	public void tampilData(String nama,String alamat,int uangTransport,int uangTunjangan,int gajiPokok,int totalGaji) {
		System.out.println("##DATA GAJI KARYAWAN PT.KAKATU##"+"\n"+
													"-------");
	System.out.println("Nama Karyawan		:"+this.nama);
	System.out.println("Alamat			:"+this.alamat);
	System.out.println("Uang Tunjangan		:Rp." + this.uangTunjangan);
	System.out.println("Uang Transport		:Rp." + this.uangTransport);
	System.out.println("Gaji Pokok			:Rp." + this.gajiPokok);
	System.out.println("Total Gaji			:Rp." + totalGaji (this.uangTunjangan,this.uangTransport,this.gajiPokok));
	
	
	}
	
	
	
	public static void main(String[] args) {
		GajiPegawai pegawai = new GajiPegawai();
		
		pegawai.setNama("Maraginda Panggabean");
		pegawai.setAlamat("Haur Jaya");
		pegawai.setUangTransport(10000);
		pegawai.setUangTunjangan(100000);
		pegawai.setGajiPokok(100000);
		
		pegawai.tampilData(
				pegawai.getNama(),
				pegawai.getAlamat(),
				pegawai.getUangTransport(),
				pegawai.getuangTunjangan(),
				pegawai.getGajiPokok(),
				pegawai.getTotalGaji()
				
				);
		
		
		
	}
	
}