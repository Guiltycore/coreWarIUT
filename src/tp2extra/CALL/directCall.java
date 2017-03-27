package tp2extra.CALL;

import tp2extra.OP;

/**
 * Created by yd on 24/03/17.
 */
public class directCall extends OP {
    //#
    public directCall(){

        super();
    }

    @Override
    public int reference(int adress,int cur) {
        return adress%4097;
    }

    @Override
    public String toString() {
        return "#";
    }
}
