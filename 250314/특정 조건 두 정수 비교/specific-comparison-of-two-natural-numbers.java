import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A<B){
            System.out.printf("1");
        }
        else{
            System.out.printf("0");
        }
        System.out.printf(" ");
        if(A==B){
            System.out.printf("1");
        }
        else{
            System.out.printf("0");
        }
    }
}