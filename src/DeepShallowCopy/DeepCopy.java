package DeepShallowCopy;

import java.util.Arrays;

public class DeepCopy {
	public int[] data;
	
	public DeepCopy(int[] values) {
		data = new int[values.length];
		for(int i = 0; i < data.length; i++) {
			data[i]= values[i];
		}
	}
	
	public void showData() {
		System.out.println(Arrays.toString(data));
	}

}
