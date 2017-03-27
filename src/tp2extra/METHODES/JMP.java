package tp2extra.METHODES;

import tp2extra.Adress;
import tp2extra.OP;

/**
 * Created by yd on 24/03/17.
 */
public class JMP extends OP{
    public JMP(){
        super();
    }
    @Override
    public void operation(OP aReference, OP bReference, int aAdress, int bAdress,int cur) {
        System.out.print("JMP("+aReference+Integer.toHexString(aAdress)+","+bReference+Integer.toHexString(bAdress)+")*"+Integer.toHexString(cur));
        Adress.adress[cur]=Adress.adress[bReference.reference(bAdress,cur)];
    }
}
