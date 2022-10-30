import java.util.Scanner;


public class FirstNPrimeNumber {
    public static void main(String[] args){
       
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the upper range : ");
            int N = scan.nextInt();
            int x = 2;
        
            for(int i = 0; i <= N-2; i++)
            {
                int count = 0;
        
                for(int j = 1; j <= x; j++)
                    if(x%j == 0)
                        count++;
        
                if(count == 2)
                    System.out.print(x + " ");
        
                x++;
            }
        }

    
    
}
