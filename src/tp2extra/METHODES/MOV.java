package tp2extra.METHODES;

import tp2extra.Adress;
import tp2extra.OP;

/**
 * Created by yd on 24/03/17.
 */
public class MOV extends OP {
    public MOV(){
        super();
    }
    @Override
    public void operation(OP aReference, OP bReference, int aAdress, int bAdress,int cur) {
        System.out.print("MOV("+aReference+Integer.toHexString(aAdress)+","+bReference+Integer.toHexString(bAdress)+")*"+Integer.toHexString(cur));
        Adress.adress[bReference.reference(bAdress,cur)]=Adress.adress[aReference.reference(aAdress,cur)];
    }
}
