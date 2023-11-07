import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;
public class Main {

        public static void main(String[] args)  {
            //1
            Random rnd = new Random();
            int[] rndArr  = new int [20];
            for (int i = 0; i< rndArr.length; i++){
                rndArr[i] = rnd.nextInt(15)+1;
            }
            //2
            for (int i = 0; i< rndArr.length; i++){
                System.out.printf("%d ", rndArr[i]);
            }
            System.out.print("\n");
            //3
            HashMap<Integer, Integer> replay = new HashMap<Integer, Integer>();
            for (int i = 0; i< rndArr.length; i++){
                int k =0;
                if (replay.containsKey(rndArr[i])) {
                    k=replay.get(rndArr[i]);
                    k++;
                    replay.put(rndArr[i], k);
                }
                else {
                    replay.put(rndArr[i], 1);
                }
            }
            for (int i = 1; i< 15; i++){
                if ((replay.containsKey(i)) && (replay.get(i)>1))
                    System.out.printf("число '%d' встречается '%d' раза\n", i, replay.get(i));
            }
        }
}