package tt.com.generics;

public class Bounds {
	
	public Bounds() {
		Integer[] arr1 = { 1, 2 , 7, -3 };
	    Integer[] arr2 = { 1, 7 , 8, -10 };
	    String[]  napisy = { "A", "Z", "C" };

	    GenArr<Integer> ga = new GenArr<Integer>(arr1);
	    MinMax<Integer> imx = ga.getMinMax();
	    System.out.println(imx.getMax() + " " + imx.getMin());
	    ga.init(arr2);
	    imx = ga.getMinMax();
	    System.out.println(imx.getMax() + " " + imx.getMin());

	    GenArr<String> gas = new GenArr<String>(napisy);
	    System.out.println(gas.getMinMax().getMax() + " " +gas.getMinMax().getMin());
	
	    System.out.println(imx.getClass().getName());
	}
	
	public static void main(String[] args) {
		new Bounds();
	}
	
}
