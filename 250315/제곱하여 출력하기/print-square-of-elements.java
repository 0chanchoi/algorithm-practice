import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] b = new int[a];
        for(int i=0; i<a; i++){
            b[i] = sc.nextInt();
        }


        for(int i=0; i<a; i++){
            b[i] *= b[i];
            System.out.printf("%d ",b[i]);
        }
    }
}