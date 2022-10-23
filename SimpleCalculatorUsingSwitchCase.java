/*Question : Make a simple claculator using Switch-Case */
import java.util.Scanner;  //import Scanner library 

public class SimpleCalculatorUsingSwitchCase{
    public static void main(String[] args){
            Scanner n=new Scanner(System.in);
 
            float a,b,r; 
            char c; // declair char(charecter) variable to take operator 

            //Take 1st input from the user
             System.out.print("Enter the 1st number : ");
             a=n.nextFloat();
            
             // Take the operator  from the user
             System.out.print("Choose the operator (+\\-\\*\\/): ");
             c=n.next().charAt(0);

             //Take 2nd input from the user
             System.out.print("Enter the 2nd number : ");
             b=n.nextFloat();

             switch(c){
                case '+':
                    r=a+b;
                    System.out.println("After performing "+a+" + "+b+" we get "+ r );
                    break;


                
                case '-':
                    r=a-b;
                    System.out.println("After performing "+a+" - "+b+" we get "+ r ); 
                    break;   
                    
                    

                case '*':
                    r=a*b;
                    System.out.println("After performing "+a+" * "+b+" we get "+ r );
                    break;



                case '/':
                    r=a/b;
                    System.out.println("After performing "+a+" / "+b+" we get "+ r );
                    break;
             }
             



            
    }
}