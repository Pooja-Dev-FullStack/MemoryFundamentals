package BitManipulation;

public class CountingSetBits {

    public static void main(String[] args) {
	int n= 10;//1010 //9= 1001
	int count=0;
	while(n!=0) {
	if((n&(n-1))!=0) {
	    count++;
	    n = (n&(n-1));
	}
    }
	System.out.println(count);
    }
}
