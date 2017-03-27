package tp2extra;

import java.util.Random;

/**
 * Created by yd on 25/03/17.
 */
public class BOT {
    public static final int size=1024;
    private int[] bounds = new int[2];
    private int[] code= new int[1024];
    public BOT(){
        Random x= new Random();
        bounds[0]=x.nextInt(4097);
        bounds[1]=(bounds[0]+1024)%24;
    }
    public int[] getBounds(){
        return this.bounds;
    }
    public void generateCode(){
        Random x= new Random();
        for(int i=0;i<1024;++i){
            code[i]=x.nextInt((int)Math.pow(2,32));
            Adress.adress[(bounds[0]+i)%4097]=code[i];
        }
    }
    public boolean isCorrupted(){
        int i=0;
        while(i<1024&&Adress.adress[(bounds[0]+i)%4097]==code[i]){
            i++;
        }
        return i==1024;
    }
    public boolean inBound(int i){
        return (bounds[0]>bounds[1]&&(i>=bounds[0]||i<=bounds[1]))|| bounds[0]<bounds[1]&&(i>=bounds[0]&&i<=bounds[1]);
    }
}
