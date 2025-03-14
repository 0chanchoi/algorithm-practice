import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int Ae = sc.nextInt();
        int Am = sc.nextInt();
        int Be = sc.nextInt();
        int Bm = sc.nextInt();


        if((Ae>Be)&&(Am>Bm)){
            System.out.printf("1");
        }
        else{
            System.out.printf("0");
        }
    }
}