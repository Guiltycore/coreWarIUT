package myUtils;

public class Tupple<T,K>{
	private T x;
	private K y;
	public Tupple(T a,K b){
		this.x=a;
		this.y=b;
	}
	public T getFirstElt(){
		return this.x;
	}
	public K getSecondElt(){
		return this.y;
	}
	public void setFirstElt(T a){
		this.x=a;
	}
	public void setSecondElt(K a){
		this.y=a;
	}
}
