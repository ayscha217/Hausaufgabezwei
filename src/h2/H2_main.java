package h2;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i = 11;
        int j = 24;
        int k = 6;
        int min, max; 
        if (i <= j && i <= k) {
        	min = i;
        } else if (j <= i && j <= k) {
        min = j; 
	    } else { 
		min = k;
     
		if (i >= j && i >= k) {
		max = i;
		} else if ( j >= i && j >= k) {
        max = j;
		} else {
			max = k;
		}
System.out.println("Der minimale Wert ist " + min);
System.out.println("Der maximale Wert: " + max);
	    }
	} }
