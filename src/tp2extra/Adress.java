package tp2extra;

/**
 * Created by yd on 24/03/17.
 */
public class Adress {
    public static int[] adress= new int[4097];
    public static String toStringAdress(int i){
        String result = Integer.toBinaryString(adress[i%4097]);
        while(result.length()<32){
            result="0"+result;
        }
        return result;
    }
    public static int toInt(String x){
        int i=0;
        for(int e=x.length()-1;e>=0;++e){
            i+=x.charAt(0)=='1'?(int)Math.pow(2,(x.length()-1)-e):0;
        }
        return i;
    }
    public static boolean isANumber(int i){
        return toStringAdress(i).substring(0,5).equals("0000");
    }
}
