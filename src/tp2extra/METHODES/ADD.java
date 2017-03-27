package tp2extra.METHODES;
import tp2extra.Adress;
import tp2extra.OP;

/**
 * Created by yd on 24/03/17.
 */
public class ADD extends OP{
    public ADD(){
        super();
    }
    @Override
    public void operation(OP aReference, OP bReference, int aAdress, int bAdress,int cur) {
        System.out.print("ADD("+aReference+Integer.toHexString(aAdress)+","+bReference+Integer.toHexString(bAdress)+")*"+Integer.toHexString(cur));
        int addA=aReference.reference(aAdress,cur);
        int addB=bReference.reference(bAdress,cur);
        Adress.adress[addB]=(Adress.adress[addA]+Adress.adress[addB])%((int)Math.pow(2,32));
    }

}
