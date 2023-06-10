package DeepShallowCopy;

import java.util.Arrays;

public class UsesDeepCopy {
	
	public static void main(String[] args) {
		int[] vals = {1,2,3};
		DeepCopy dCopy = new DeepCopy(vals);
		dCopy.showData();
		vals[0]=12;
		dCopy.showData();
		System.out.println(Arrays.toString(vals));

	}

}
