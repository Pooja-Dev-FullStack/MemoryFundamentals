package DeepShallowCopy;

public class UsesShallowCopy {
	
	public static void main(String[] args) {
		
		int[] val = {1,2,3};
		ShallowCopy ex = new ShallowCopy(val);
		ex.showData();
		val[0]=45;
		ex.showData();
		ex.data[1]=89;
		ex.showData();

	}

}
