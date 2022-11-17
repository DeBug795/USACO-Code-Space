import java.util.*;

//  Do You Know Your ABCs? 2020 USACO
class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[7];

        for(int i = 0; i < 7; i++) {
            input[i] = scanner.nextInt();
        }

        Arrays.sort(input);
        int c = input[6] - (input[0] + input[1]);

        if(input[0] + input[1] + input[2] == input[6]) {
            System.out.println(input[0] + " " + input[1] + " " + c);
        }
        else {
            System.out.println(input[0] + " " + input[1] + " " + c);
        }

    }
}