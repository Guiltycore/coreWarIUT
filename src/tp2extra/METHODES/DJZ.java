package tp2extra.METHODES;

import tp2extra.Adress;
import tp2extra.OP;

/**
 * Created by yd on 24/03/17.
 */
public class DJZ extends OP {
    public DJZ(){
        super();
    }
    @Override
    public void operation(OP aReference, OP bReference, int aAdress, int bAdress,int cur) {
        System.out.print("DJZ("+aReference+Integer.toHexString(aAdress)+","+bReference+Integer.toHexString(bAdress)+")*"+Integer.toHexString(cur));
        Adress.adress[aReference.reference(aAdress,cur)]--;
        if(Adress.adress[aReference.reference(aAdress,cur)]==0){
            Adress.adress[cur]=Adress.adress[bReference.reference(bAdress,cur)];
        }
    }
}
