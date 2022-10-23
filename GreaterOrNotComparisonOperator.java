/*Question : Use comparison operators to find out wheather a given number is greater than the user
 *           entered number or not .
 */
import java.util.Scanner;  //import scanner library
public class GreaterOrNotComparisonOperator{
    public static void main(String[] args){

        Scanner n=new Scanner(System.in);

        int num1=100,num2;  //declair int variable

        //Take input from the user
        System.out.print("Enter the number : ");
        num2=n.nextInt();

        //Check the given number is greater or less or equal to the preset value.
        //If the user entered number is less than the preset value than this part will be execute.
        if(num2<num1){
            System.out.println(num1+ " is greater than "+num2);
        }

        //If the user entered number is greater than the preset value than this part will be executed.
        else if(num2>num1){
            System.out.println(num1+" is less than "+num2);
        }

        /*If previous conditions does not match, that's the user entred value and the preset value boths
        are equal. In this case else part will be executed.*/
        else{
            System.out.println(num1+" is equal to "+num2);
        }
    }
}
