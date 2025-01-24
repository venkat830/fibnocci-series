 import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        int i,Number;
        long Fctl=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter any number to find:");
        Number=sc.nextInt();
        for(i=1;i<=Number; i++){
            Fctl=Fctl*i;
            sc.close();
        }
        System.out.format("\n Factorial of %d=%d\n",Number,Fctl);
    }
}

