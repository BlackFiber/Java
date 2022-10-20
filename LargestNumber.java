import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        Scanner n= new Scanner(System.in);

        int n1,n2,n3;

        System.out.print("Enter the 1st number : ");
        n1=n.nextInt();

        System.out.print("Enter the 2nd number : ");
        n2=n.nextInt();

        System.out.print("Enter the 3rd number : ");
        n3=n.nextInt();

        if(n1>n2 && n1>n3){
            System.out.println("The largest number is : "+n1);
        }

        else if(n2>n1 && n2>n3){
            System.out.println("The largest number is : "+n2);
        }

        else if(n3>n1 && n3>n2){ 
            System.out.println("The largest number is : "+n3);
        }

        else{
            System.out.println("Please try with right inputs.");
        }
    }
    
}
