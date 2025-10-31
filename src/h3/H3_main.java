package h3;

public class H3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i = 305;
    int j = 102;
    int k = -9;
    
    if (i > j && !(i > 200) && !(j > 100)) {
    	k = 1;
    }
    else if (i > j && i > 200 && !(j > 100)) {
    	k= 2;
    }
    else if (i > j && i > 200 && j > 100) {
    	k = 3;
    }
    else if (!(i > j) && !(i > 200) && !(j> 100)) {
    	k=4;
    }
    else {
    	k= -10;
    }
    System.out.println("Der Wert von k ist: " + k);
	}

}
