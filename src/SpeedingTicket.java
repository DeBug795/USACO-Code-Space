import java.io.*;
import java.util.*;

public class SpeedingTicket {
    public static void main(String[] args) throws IOException{
        //System.out.println(new File("speeding.in").getAbsolutePath());
        Scanner scanner = new Scanner(new File("speeding.in"));
        PrintWriter pw = new PrintWriter(new File("speeding.out"));

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        ArrayList<Integer> road = new ArrayList<>();
        ArrayList<Integer> bessieSpeed = new ArrayList<>();

        for(int i = 0; i < N; i++){
            int mile = scanner.nextInt();
            int speed = scanner.nextInt();
            for(int j = 0; j < mile; j++){
                road.add(speed);
            }
        }
// Mowing the array (array size 2000 x 200 2d array)
        for(int i = 0; i < M; i++){
            int mile = scanner.nextInt();
            int speed = scanner.nextInt();
            for(int j = 0; j < mile; j++){
                bessieSpeed.add(speed);
            }
        }

        int ans = 0;
        for(int i = 0; i < 100; i++){
            ans = Math.max(ans, bessieSpeed.get(i) - road.get(i));
        }
        pw.println(ans);
        pw.close();
    }
}
