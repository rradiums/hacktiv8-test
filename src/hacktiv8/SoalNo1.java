package hacktiv8;

public class SoalNo1 {
  	public static void main(String[]args) {
		int inputAngka;
		Scanner sc = new Scanner(System.in);
		Integer i = null;
		int b = 0,result;
		
		System.out.print("Masukan Angka (dalam puluhan): ");
		inputAngka = sc.nextInt();
		if (inputAngka>10 && inputAngka < 100) {
		for(int s=inputAngka/10; s>0; s--) {
			if (inputAngka>0) {
				i=inputAngka/10;
				if(i>0) {
					b = inputAngka%10;
				}
			}
			inputAngka = i*b;
			System.out.println(inputAngka);
		}
	}
		else {
			System.out.println("Masukan Angka Puluhan");
		}
  }

}
