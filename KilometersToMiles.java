/* Java programme to convert Kilometers to Miles */

import java.util.Scanner;
public class KilometersToMiles {
    public static void main(String[] args){
        Scanner length=new Scanner(System.in);
        float km,mi; //create variables to take inputs and store them.

        //taking input from the user 
        System.out.print("Enter the length in kilometers : ");
        km=length.nextFloat();

        //convert km to mi
        mi=(float)(km*0.621371);

        //display the result
        System.out.println(km+"km = "+mi+"mi.");

    }
    
}
