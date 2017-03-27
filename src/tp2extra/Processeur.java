package tp2extra;

import tp2extra.CALL.directCall;
import tp2extra.CALL.inderectRelativeCall;
import tp2extra.CALL.relativeCall;
import tp2extra.METHODES.*;

import java.util.HashMap;

/**
 * Created by yd on 25/03/17.
 */
public class Processeur {
    private OP[] operators={new DAT(),new MOV(),new ADD(),new SUB(),new JMP(),new JMZ(),new DJZ(),new CMP()};
    private OP[] adr={new directCall(),new relativeCall(),new inderectRelativeCall(),new directCall()};
    public Processeur(){


    }
    public void commande(String opCode,String mAddrA,String mAddrB,String addrA,String addrB,int cur){
        operators[Integer.parseInt(opCode,2)].operation(
                adr[Integer.parseInt(mAddrA,2)],
                adr[Integer.parseInt(mAddrB,2)],
                Integer.parseInt(addrA,2),
                Integer.parseInt(addrB,2),
                cur);
    }
}
