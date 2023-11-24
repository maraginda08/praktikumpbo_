package Tugas_3_PBO;
import java.util.Scanner;

public class CetakNama {
	private int jumlahCetak;
	private String Nama;
	
	public int getjumlahCetak() {
		return jumlahCetak;
	}
	public void setjumlahCetak(int jumlahCetak) {
		this.jumlahCetak = jumlahCetak;
	}
	public String getNama() {
		return Nama;
	}
	public void setNama(String Nama) {
		this.Nama = Nama;
	}
	public void cetakNama(String Nama) {
		this.Nama = Nama;
	}
	
	
	
	public void cetak(int jumlahCetak,String Nama) {
		this.jumlahCetak = jumlahCetak;
		this.Nama = Nama;
		
		for(int i = 1; i<=jumlahCetak; i++) {
			System.out.println(i + "."+Nama);
		}
}
	public static void main(String[] args) {
		CetakNama data = new CetakNama();
		String Nama;
		int jumlahCetak;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== Applikasi pencetak Nama ======");
		
		System.out.print("Masukan Nama Anda :");
		data.setNama(input.next());
		Nama = data.getNama();
		
		System.out.print("Mau cetak berapa kali?	: ");
		data.setjumlahCetak(input.nextInt());
		jumlahCetak = data.getjumlahCetak();
		
		System.out.println("Nama Anda	:"+ Nama);
		System.out.println("Hasil cetak	: ");
		data.cetak(jumlahCetak,Nama);
		
		
	}
	
}
