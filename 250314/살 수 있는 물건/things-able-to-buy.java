import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N>1000){
            System.out.println("book");
        }
        else if(N>0){
            System.out.println("mask");
        }
        else{
            System.out.println("no");
        }
    }
}