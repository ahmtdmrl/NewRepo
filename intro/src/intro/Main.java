package intro;

public class Main {

	// main javada başlangıç noktasıdır.

	public static void main(String[] args) {
		System.out.println("Hello Java!");
		System.out.println("Hello World!");

		// değişken isimlendirmeleri javada camelCase yazılır
		// string ile veri atama
		String ortaMetin = "İlginizi Çekebilir";
		String altMetin = "Vade Süresi";

		System.out.println(ortaMetin);

		// integer tam sayı atamalarında kullanılır.
		int vade = 12;

		double dolarDun = 18.20;
		double dolarBugun = 18.20;

		boolean dolarDustuMu = false;

		String okYonu = "";

		if (dolarBugun < dolarDun) { // false
			okYonu = "down.svg";
			System.out.println(okYonu);

		}

		else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);

		}
		// array verileri listelemek için kullanılır

		String[] krediler = { "Hızlı Kredi", "Maasını Halkbanktan Alanlar", "Mutlu Kredi" };

		// System.out.println(krediler[0]);
		// System.out.println(krediler[1]);
		// System.out.println(krediler[2]);

		// for döngüsü
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}
}
