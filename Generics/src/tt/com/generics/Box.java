package tt.com.generics;

public class Box<T> {
	
	private T t;
	
	public void add(T t) {
		this.t= t;
	}
	
	public T get() {
		return t;
	}
	
	public <U extends Number> void inspect(U u) {
		System.out.println("T: " + t.getClass().getName());
		System.out.println("U: " + u.getClass().getName());
	}
	
	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		Box<String> stringBox = new Box<String>();
		
		integerBox.add(new Integer(10));
		stringBox.add(new String("Hello world"));
		
		System.out.printf("Integer value: %d\n\n", integerBox.get());
		System.out.printf("String value: %s\n", stringBox.get());

	}

}
