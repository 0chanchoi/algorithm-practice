import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String N = sc.next();

        for(int i=0; i<8; i++){
            System.out.printf("%S", N);
        }
    }
}