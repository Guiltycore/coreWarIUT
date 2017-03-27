package tp2extra;

/**
 * Created by yd on 24/03/17.
 */
public class Game {
    public static int[] cur= new int[2];
    private static BOT[] x;
    public static void main(String[] Args){
        Processeur e=new Processeur();
        x= new BOT[2];
        x[0]=new BOT();
        x[1]=new BOT();
        x[0].generateCode();
        x[1].generateCode();
        while(!isOk()){
            x[1]=new BOT();
        }
        cur[0]=x[0].getBounds()[0];
        cur[1]=x[1].getBounds()[0];
        int i=0;
        String currendCode="";
        while(!x[0].isCorrupted()&&!x[1].isCorrupted()){
            currendCode=Adress.toStringAdress(cur[i]);
            System.out.println("\nPlayer "+(i+1)+" launch code: " + currendCode);
            e.commande("0"+currendCode.substring(1,4),
                    currendCode.substring(4,6),
                    currendCode.substring(6,8),
                    currendCode.substring(8,20),
                    currendCode.substring(20)
                    ,cur[i]);
            cur[i]++;
            i=(i+1)%2;
        }
        System.out.println("\nPlayer 1 is: "+(x[0].isCorrupted()?"Corrupted":"Winner")+" And player 2 is: "+(x[1].isCorrupted()?"Corrupted":"Winner"));
    }
    public static boolean isOk(){
        return !(x[0].inBound(x[1].getBounds()[0])||x[0].inBound(x[1].getBounds()[1]));
    }
}
