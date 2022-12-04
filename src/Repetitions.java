import java.util.*;

public class Repetitions {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] charInput = input.toCharArray();
        int N = charInput.length;

        int counter = 0;
        for(int i = 0; i < N-1; i++){
            if(charInput[i] == charInput[i+1]) {
                counter++;
            }
        }
        System.out.println(counter);


        System.out.println(input.subSequence(0,input.length()));
    }
}
