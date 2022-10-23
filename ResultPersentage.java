/*Question : Write a program to calculate percentages of a given student in CBSE board exam. 
             His marks from 5 subjects must be taken as input from the keyboard.(marks  are out of 100)
 */

import java.util.Scanner;
public class ResultPersentage {
    public static void main(String[] args){
        Scanner marks=new Scanner(System.in);
        float sub1,avg;

        System.out.print("Enter the marks of 1st subject : ");
        sub1=marks.nextFloat();
        if(sub1<=100){
            float sub2,sub3,sub4,sub5;
            
            System.out.print("Enter the marks of 2nd subject : ");
            sub2=marks.nextFloat();
            
            if(sub2<=100){
                
                System.out.print("Enter the marks of 3rd subject : ");
                sub3=marks.nextFloat();
                
                if(sub3<=100){
                    
                    System.out.print("Enter the marks of 4th subject : ");
                    sub4=marks.nextFloat();
                   
                    if(sub4<=100){
                        
                        System.out.print("Enter the marks of 5th subject : ");
                        sub5=marks.nextFloat();
                        
                        if(sub5<=100){
                        // calculate the average
                        avg=((sub1+sub2+sub3+sub4+sub5)/5);
                        //display the result
                        System.out.println("You get total "+avg+"% of marks.");
                        }

                        else{
                            System.out.println("Try with right input. ");
                        }
                        
                    }
                    else{
                        System.out.println("Try with right input. ");
                    }

                }
                else{
                    System.out.println("Try with right input. ");
                }
                
            }
            
            else{
                System.out.println("Try with right input. ");
            }
            
     
        }


        else{
            System.out.println("Try with right input. ");
        }

        
      



    }
}
