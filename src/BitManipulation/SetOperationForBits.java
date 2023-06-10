package BitManipulation;

public class SetOperationForBits {

	public static void main(String[] args) {
		int n = 5; //(0101)
		// WHEN BIT VALUE = 1
		int pos=2;
		int bitmask = n<<pos;
		if((bitmask | n)==0) {
		    System.out.println("zero");
		}
		else {
		    System.out.println("one");           //one
		}
		
		
		// WHEN BIT VALUE = 0
		int k =1;
		int bitmask2= n<<k;
		if((bitmask2 | n)==0) {
		    System.out.println("zero");
		}
		else {
		    System.out.println("one");         // one
		}
	}

}
