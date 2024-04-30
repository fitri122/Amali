import java.util.Scanner;
public class ahmadfitri {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan nama: ");
		String nama_pekerja = input.nextLine();

		System.out.print("Masukkan bilangan hari bekerja: ");
		int bilangan_hari;
		while(true){
			bilangan_hari = input.nextInt();

			if(bilangan_hari > 31){
				System.out.println("\nBilangan hari tidak melebihi 31 hari.");

				System.out.print("Masukkan semula bilangan hari bakerja: ");
			}else{
				break;
			}
		}

		int jum_gaji = bilangan_hari * 160;

		System.out.println("\nRumusan gaji bulanan bagi " + nama_pekerja + ".");
		System.out.println("Jumlah hari bekerja " + bilangan_hari + ".");
		System.out.println("GAJI SEBULAN ADALAH " + jum_gaji + ".");



	}
}