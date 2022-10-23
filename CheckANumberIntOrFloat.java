/*Question : Write a java program to detect  */

import java.util.Scanner;   //import Scanner library
public class CheckANumberIntOrFloat {
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);

        float number; //declair variable

        //Take input fromt the user
        System.out.print("Enter the number : ");
        number=n.nextFloat();

        //Check the number is interger or not
        if(number==(int)(number)){
            System.out.println((int)(number)+" is an integer value.");
        }

        else{
            System.out.println(number+" is a floating value.");
        }

    }
    
}
