package tp2extra.METHODES;

import tp2extra.OP;

/**
 * Created by yd on 24/03/17.
 */
public class DAT extends OP {
    public DAT(){
        super();
    }

    @Override
    public void operation(OP aReference, OP bReference, int aAdress, int bAdress,int cur) {
        System.out.print("DAT("+aReference+Integer.toHexString(aAdress)+","+bReference+Integer.toHexString(bAdress)+")*"+Integer.toHexString(cur));
    }
}
