import java.io.*;
public class buffer {
	public static void main(String[] args) throws IOException {
		String nama, alamat;
		char tipe;
		int bayar, kembalian, harga;
		
		InputStreamReader tg = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(tg);
		
		System.out.print("Masukan Nama Anda: ");
		nama = br.readLine();
		
		System.out.print("Masukan Tipe Pesawat Anda A-B: ");
		tipe = (char) br.read();
		
		switch(tipe) {
		case'A': {
			harga = 5000000;
			System.out.println("Harga Pesawat Anda Sesuai Tipe yang Anda Masukan Senilai Rp. "+harga);
			System.out.print("Nominal yang Anda Bayarkan Senilai Rp. ");
			bayar = Integer.parseInt(br.readLine());
			kembalian = bayar-harga;
			System.out.println("Kembalian Anda Senilai Rp. "+kembalian);
		break;
		}
		
		case'B': {
			harga = 2000000;
			System.out.println("Harga Pesawat Anda Sesuai Tipe yang Anda Masukan Senilai Rp. "+harga);
			System.out.print("Nominal yang Anda Bayarkan Senilai Rp. ");
			bayar = Integer.parseInt(br.readLine());
			kembalian = bayar-harga;
			System.out.println("Kembalian Anda Senilai Rp. "+kembalian);
		break;
		}
		
		case'C': {
			harga = 1000000;
			System.out.println("Harga Pesawat Anda Sesuai Tipe yang Anda Masukan Senilai Rp. "+harga);
			System.out.print("Nominal yang Anda Bayarkan Senilai Rp. ");
			bayar = Integer.parseInt(br.readLine());
			kembalian = bayar-harga;
			System.out.println("Kembalian Anda Senilai Rp. "+kembalian);
		break;
		}
		}
		
		System.out.println("Transaksi Anda Sudah Selesai. Terima Kasih");
	}
}