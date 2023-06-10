package BitManipulation;

public class ClearOperationForBits {
    
    int k = 10; //1010
    int pos = 3;
    int bitmask =  k<<pos;
    int newbitmask = ~bitmask;
    public static void main(String[] args) {
	ClearOperationForBits clearOperationForBits = new ClearOperationForBits();
	if((clearOperationForBits.newbitmask & clearOperationForBits.k) == 0) {
	    System.out.println("zero");
	}
	else {
	    System.out.println("one");
	}
    }

}
