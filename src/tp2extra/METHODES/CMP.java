package tp2extra.METHODES;

import tp2extra.Adress;
import tp2extra.Game;
import tp2extra.OP;

/**
 * Created by yd on 24/03/17.
 */
public class CMP extends OP {
    public CMP(){
        super();
    }
    @Override
    public void operation(OP aReference, OP bReference, int aAdress, int bAdress,int cur) {
        System.out.print("CMP("+aReference+Integer.toHexString(aAdress)+","+bReference+Integer.toHexString(bAdress)+")*"+Integer.toHexString(cur));
        if(Adress.adress[aReference.reference(aAdress,cur)]!=Adress.adress[bReference.reference(bAdress,cur)]){
            if(Game.cur[0]==cur){
                Game.cur[0]++;
            }
            else{
                Game.cur[1]++;
            }
        }
    }
}
