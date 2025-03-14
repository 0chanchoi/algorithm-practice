import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int M = 0;
        int Y = 1;


        int sex = sc.nextInt();
        int age = sc.nextInt();

        if(sex==M){
            if(age>=19){
                System.out.printf("MAN");
            }
            else{
                System.out.printf("BOY");
            }
        }
        if(sex==Y){
            if(age>=19){
                System.out.printf("WOMAN");
            }
            else{
                System.out.printf("GIRL");
            }
        }

    }
}