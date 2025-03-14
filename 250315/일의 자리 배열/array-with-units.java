import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];

        num[0] = sc.nextInt();
        num[1] = sc.nextInt();

        for(int i =0; i<8; i++){
            num[i+2] = (num[i]+num[i+1])%10;
        }
        
        for(int z = 0; z<10; z++){
            System.out.printf("%d ",num[z]);
        }
    }
}