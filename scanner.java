import java.util.Scanner;
public class scanner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nama, alamat;
		char tipe;
		int bayar, kembalian, harga;
		
		System.out.print("Masukan Nama Anda: ");
		nama = input.nextLine();
		
		System.out.print("Masukan Tipe Pesawat Anda A-B: ");
		tipe = input.next().charAt(0);
		
		switch(tipe) {
		case'A': {
			harga = 5000000;
			System.out.println("Harga Pesawat Anda Sesuai Tipe yang Anda Masukan Senilai Rp. "+harga);
			System.out.print("Nominal yang Anda Bayarkan Senilai Rp. ");
			bayar = input.nextInt();
			kembalian = bayar-harga;
			System.out.println("Kembalian Anda Senilai Rp. "+kembalian);
		break;
		}
		
		case'B': {
			harga = 2000000;
			System.out.println("Harga Pesawat Anda Sesuai Tipe yang Anda Masukan Senilai Rp. "+harga);
			System.out.print("Nominal yang Anda Bayarkan Senilai Rp. ");
			bayar = input.nextInt();
			kembalian = bayar-harga;
			System.out.println("Kembalian Anda Senilai Rp. "+kembalian);
		break;
		}
		
		case'C': {
			harga = 1000000;
			System.out.println("Harga Pesawat Anda Sesuai Tipe yang Anda Masukan Senilai Rp. "+harga);
			System.out.print("Nominal yang Anda Bayarkan Senilai Rp. ");
			bayar = input.nextInt();
			kembalian = bayar-harga;
			System.out.println("Kembalian Anda Senilai Rp. "+kembalian);
		break;
		}
		}
		
		System.out.println("Transaksi Anda Sudah Selesai. Terima Kasih");
	}
}