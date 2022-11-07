import java.util.*;

// Distinct Numbers
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Set<Integer> set = new HashSet<> ();
        int N = scanner.nextInt();
        int[] input = new int[N];

        for(int i = 0; i < N; i++){
            input[i] = scanner.nextInt();
            set.add(input[i]);
        }
        System.out.println(set.size());
    }
}
