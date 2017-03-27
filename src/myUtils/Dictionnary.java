package myUtils;

/**
 * Created by yd on 10/02/17.
 */
public class Dictionnary<T> {


    private T value;


    private Dictionnary<T>[] nextChar=new Dictionnary[128];


    boolean hasSons;


    public Dictionnary(){
        this.hasSons=false;
    }


    public void generate(){
        for(int i=0;i<128;i++){
            this.nextChar[i]=new Dictionnary<T>();
        }
        this.hasSons=true;
    }
    public T search(String a){

        if(a.equals("")){

            System.out.print("oklm2\n");
            return this.value;
        }
        else if(hasSons){
            return this.nextChar[a.charAt(0)].search(a.substring(1));
        }
        else{

            System.out.print("oklm1\n");
            return null;
        }
    }
    public void set(String a, T val){
        if(a.equals("")){
            this.value=val;
        }
        else if(hasSons){
            this.nextChar[a.charAt(0)].set(a.substring(1),val);
        }
        else{
            this.generate();
            this.nextChar[a.charAt(0)].set(a.substring(1),val);
        }
    }
}
