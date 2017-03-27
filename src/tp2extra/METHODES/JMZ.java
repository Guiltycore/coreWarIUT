package tp2extra.METHODES;

import tp2extra.Adress;
import tp2extra.OP;

/**
 * Created by yd on 24/03/17.
 */
public class JMZ extends OP {
    public JMZ(){
        super();
    }
    @Override
    public void operation(OP aReference, OP bReference, int aAdress, int bAdress,int cur) {
        System.out.print("JMZ("+aReference+Integer.toHexString(aAdress)+","+bReference+Integer.toHexString(bAdress)+")*"+Integer.toHexString(cur));
        if(aAdress==0){
            Adress.adress[cur]=Adress.adress[bReference.reference(bAdress,cur)];
        }
    }
}
