package hacktiv8;

public class SoalNo3 {
		    public static void main(String args[]) { 
		        Integer[] angka = { 3, 5, 5, 1, 2, 2 }; 
		        Integer result = null;
		        for (int i = 0; i < angka.length; i++) { 
		            for (int j = i + 1; j < angka.length; j++) { 
		                if (angka[i].equals(angka[j]) ) {   
		                    result = 1;
		                }
		                else {
		                	result=0;
		                }
		            } 
		        }
	            System.out.println(result);
		    }
		}
