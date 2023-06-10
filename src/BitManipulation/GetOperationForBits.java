package BitManipulation;

public class GetOperationForBits {

	public static void main(String[] args) {
		int n= 5;
		int pos =2;
		int bitmask = n<<pos;
//		System.out.println(n & bitmask);
		if((n & bitmask) ==0) {
			System.out.println("bit is zero");
		}
		else {
			System.out.println("bit is one");
		}

	}

}
