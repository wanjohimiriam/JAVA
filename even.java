import java.util.Scanner;

public class even {
    public static void main(String args[]){
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Key in a number\n");
        num = scan.nextInt();
        EvenODD(num);
    }
    public static void EvenODD(int number){
        if(number%2 == 0){
            System.out.println("Member is even");
        }
        else{
            System.out.println("Memeber is odd");
        }
    }
}
