package tt.com.generics;

public class MinMax<T> {

	private T min;
	private T max;
	
	public MinMax(T f, T l){
		this.max = l;
		this.min = f;
	}
	
	public T getMin() { return min; }
	public T getMax() { return max; }
	
}
