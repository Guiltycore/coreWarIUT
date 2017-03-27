package tp2extra.CALL;

import tp2extra.Adress;
import tp2extra.OP;

/**
 * Created by yd on 24/03/17.
 */
public class inderectRelativeCall extends OP {
    //@
    public inderectRelativeCall(){
        super();
    }

    @Override
    public int reference(int adress,int cur) {
        return new relativeCall().reference(Adress.adress[adress],adress);
    }

    @Override
    public String toString() {
        return "@";
    }
}
