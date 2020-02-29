package hacktiv8;

import java.util.Scanner;

public class SoalNo2 {
	public static void main(String[] args) 
    {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan Jumlah Angka yang akan dibandingkan(Min 2):");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Masukan "+n+" angka :");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Angka kedua terbesar:"+a[n-2]);
        System.out.println("Angka kedua terkecil:"+a[n-1]);
    }
}

