package tt.com.generics.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class UsingGenerics {

	public static double sum(ArrayList<Number> list) {
		double sum = 0;
		for(Number n : list){
			sum += n.doubleValue();
		}
		return sum;
	}
	
	public static double sumWildcard(ArrayList<? extends Number> list){
		double sum = 0;
		for(Number n : list){
			sum += n.doubleValue();
		}
		return sum;
	}
	
	public static void main(String[] args) {

		//without generics
		ArrayList listWithoutGenerics = new ArrayList();
		listWithoutGenerics.add("hello");
		String s1 = (String) listWithoutGenerics.get(0);
		
		//with generics
		ArrayList<String> listWithGenerics = new ArrayList<String>();
		listWithGenerics.add("hello");
		String s2 = listWithGenerics.get(0);
		
		//declarations
		BoxGeneric<Integer> integerBox = new BoxGeneric<>();
	
		OrderedPair<String, Integer> p1 = new OrderedPair<String, Integer>("Even",  8);
		OrderedPair<String, String> p2 = new OrderedPair<>("hello", "world");
		OrderedPair p3 = new OrderedPair("Even",  8);
		p3.setKey(1);
	
		OrderedPair<String, BoxGeneric<Integer>> p = new OrderedPair<>("primes", new BoxGeneric<Integer>());
		
		//raw type
		BoxGeneric rawBox = new BoxGeneric();
		
		OrderedPair<Integer, String> gMethodTest1 = new OrderedPair<>(1, "apple");
		OrderedPair<Integer, String> gMethodTest2 = new OrderedPair<>(2, "pear");
		boolean same = Util.compare(gMethodTest1, gMethodTest2);
		System.out.println(same);
		
		//bounded type
		BoxGeneric<Integer> boundedBox = new BoxGeneric<Integer>();
		boundedBox.set(new Integer(10));
		boundedBox.inspect(new Integer(10));
		
		//inheritance and subtypes
		//BoxGeneric<Number> boxz = new BoxGeneric<Number>();
		//boxz.add(new Integer(10));   // OK
		//boxz.add(new Double(10.1));  // OK

		//public void boxTest(BoxGeneric<Number> n) { /* ... */ }
		//can't pass BoxGeneric<Integer>, BoxGeneric<Double>
		//BoxGeneric<Integer> is not subtype of BoxGeneric<Number>
		
		//wildcards
		ArrayList<Integer> listaInt = new ArrayList<>();
		listaInt.add(2);
		listaInt.add(4);
		listaInt.add(8);
		//System.out.println(sum(listaInt));
		System.out.println(sumWildcard(listaInt));
		
		List<String> lista = new LinkedList<String>();
	}

}