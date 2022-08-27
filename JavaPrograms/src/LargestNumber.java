import java.util.Scanner;

public class LargestNumber {


    public static void main(String[] args) {

        int a,b,c;

        Scanner sc=new Scanner(System.in);
         a=sc.nextInt();
         b= sc.nextInt();
         c= sc.nextInt();

        System.out.println("Enter A Value=" + a);


        if(a>b && a>c){
            System.out.println("A is Big");


        }

        else if (b>a && b>c){

            System.out.println("B is Big");
        }
        else {
            System.out.println("C is big");
        }

    }
}