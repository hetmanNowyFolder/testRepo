package tt.com.generics;

import java.util.Date;

public class TestSomeGenericType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomeGenericType<Integer, String, Date, Integer> janek = new SomeGenericType();
		SomeGenericType<String, String, Date, Integer> marcinek = new SomeGenericType("Marcin", "Linda", new Date(), 23);
		SomeGenericType rawMarcinek = new SomeGenericType("Marcin", "Linda", new Date(), 23);
		
		System.out.println(janek.toString());
		System.out.println(marcinek.toString());
		
		marcinek.setFourth(55);
		System.out.println(marcinek.toString());
		
		//tego na int nie zmienisz
		marcinek.setFirst("Nowy Marcinek");
		System.out.println(marcinek.toString());
		
		//to zmienisz bo typ niezdefiniowany
		rawMarcinek.setFirst(22);
		System.out.println(rawMarcinek.toString());
		
		
		
	}

}
