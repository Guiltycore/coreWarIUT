package myUtils;
public class Tree<T>{
	private T key;
	Tree<T> R;
	Tree<T> L;

	public Tree(){
		this.key = null;
		this.R = null;
		this.L = null;
	}
	public Tree(T K,Tree<T> R,Tree<T> L){
		this.key = K;
		this.L = L;
		this.R = R;
	}
	public Tree<T> getL(){
		return this.L;
	}
	public Tree<T> getR(){
		return this.R;
	}
	public T getKey(){
		return this.key;
	}
	public void setL(Tree<T> t){
		this.L = t;
	}
	public void setR(Tree<T> t){
		this.R = t;
	}
	public void setKey(T x){
		this.key = x;
	}
	public void readPreO(Tree<T> t){
		if(t==null){
			System.out.print("");
		}
		else if(t.getKey()==null){
			System.out.print("");
		}
		else{
			System.out.print("<"+t.getKey());
			this.readPreO(t.getL());
			this.readPreO(t.getR());
			System.out.print(">");
		}
	}
	public void readInO(Tree<T> t){
                if(t==null){
			System.out.print("");
		}
		else if(t.getKey()==null){
                        System.out.print("");
                }
                else{
			System.out.print("<");
                        this.readInO(t.getL());
			System.out.print(t.getKey());
                        this.readInO(t.getR());
                        System.out.print(">");
                }
        }
	public void readPostO(Tree<T> t){
		if(t==null){
			System.out.print("");
		}
		else if(t.getKey()==null){
			System.out.print("");
		}
		else{
			System.out.print("<");
			this.readPostO(t.getL());
			this.readPostO(t.getR());
			System.out.print(t.getKey());
			System.out.print(">");
		}
	}

}
