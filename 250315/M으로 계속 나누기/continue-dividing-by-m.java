import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // Please write your code here.

        while(N>0){
            
            System.out.printf("%d\n",N);
            N = N/M;
        }
    }
}
