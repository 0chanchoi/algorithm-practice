import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N>=1001){
            System.out.print("book");
        }
        else if(N>=1){
            System.out.printf("mask");
        }
        else{
            System.out.printf("no");
        }
    }
}