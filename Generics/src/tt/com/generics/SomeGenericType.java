package tt.com.generics;

public class SomeGenericType<T, S, W, Y> {

	private T first;
	private S second;
	private W third;
	private Y fourth;
	
	public SomeGenericType(){
		this.first = null;
		this.second = null;
		this.third = null;
		this.fourth = null;
	}

	public SomeGenericType(T f, S s, W t, Y fo) {
		super();
		this.first = f;
		this.second = s;
		this.third = t;
		this.fourth = fo;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public S getSecond() {
		return second;
	}

	public void setSecond(S second) {
		this.second = second;
	}

	public W getThird() {
		return third;
	}

	public void setThird(W third) {
		this.third = third;
	}

	public Y getFourth() {
		return fourth;
	}

	public void setFourth(Y fourth) {
		this.fourth = fourth;
	}

	@Override
	public String toString() {
		return "SomeGenericType [getFirst()=" + getFirst() + ", getSecond()=" + getSecond() + ", getThird()="
				+ getThird() + ", getFourth()=" + getFourth() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((fourth == null) ? 0 : fourth.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		result = prime * result + ((third == null) ? 0 : third.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SomeGenericType other = (SomeGenericType) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (fourth == null) {
			if (other.fourth != null)
				return false;
		} else if (!fourth.equals(other.fourth))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		if (third == null) {
			if (other.third != null)
				return false;
		} else if (!third.equals(other.third))
			return false;
		return true;
	}
	
	
	
	
}
