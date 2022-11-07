import java.util.*;

// Mixing Milk
public class Main {

    static int pour(int bucketACurrent, int bucketBCapacity, int bucketBCurrent){
        /*if(bucketACurrent <= bucketBCapacity && (bucketBCurrent + bucketACurrent <= bucketBCapacity)){
            bucketBCurrent = bucketBCurrent + bucketACurrent;
            return bucketBCurrent;
        }*/

        bucketBCurrent = bucketBCurrent + bucketACurrent;
        return bucketBCurrent;
        /*bucketACurrent = bucketACurrent + bucketBCurrent - bucketBCapacity;
        return bucketBCapacity;*/
    }

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        // bucket capacity [element 0] bucket current [element 1]
        int[] bucket1 = {scanner.nextInt(), scanner.nextInt()};
        int[] bucket2 = {scanner.nextInt(), scanner.nextInt()};
        int[] bucket3 = {scanner.nextInt(), scanner.nextInt()};

        for(int i = 0; i <= 100; i++){
            int newPourA = pour(bucket1[1], bucket2[0], bucket2[1]);
            int newPourB = pour(bucket2[1], bucket3[0], bucket3[1]);
            int newPourC = pour(bucket3[1], bucket1[0], bucket1[1]);
            System.out.println(newPourA);
            System.out.println(newPourB);
            System.out.println(newPourC);
        }
    }
}
