import java.util.Scanner;
public class Swap_wo_3rd_Variable {
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        int n1,n2;

        System.out.print("Enter the 1st number : ");
        n1=n.nextInt();

        System.out.print("Enter the 2nd number : ");
        n2=n.nextInt();

        n1=n1+n2;
        n2= n1-n2;
        n1=n1-n2;

        System.out.println("After swapping 1st number is : "+n1+" and the 2nd number is : "+n2);

    }

}
