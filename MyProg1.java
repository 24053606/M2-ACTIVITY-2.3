
/**
 * Write a description of class M2_Activity_2_3 here.
 *
 * @author Chathura Asanka
 * @version 0.01
 */


import java.util.Scanner;
import java.util.Arrays;

public class MyProg1 
{

    public static void main()
    {
        double[] house_prices = new double[10];
        double total_price = 0;
        
        for(int i = 0; i < 10; i++){     
            System.out.println("Please input the " + (i + 1) + " house price: ");
            house_prices[i] = (new Scanner(System.in)).nextDouble();
        }
        
        for(int i = 0; i < 10; i++){ 
            
            total_price += house_prices[i];
            
            if(house_prices[i] > 500000){
                System.out.println((i + 1) + " house price: " +  house_prices[i]);
            }
        }
        
        System.out.println("Average house price is: " +  (total_price / house_prices.length));
        
        Arrays.sort(house_prices);
        
        System.out.println("Least house price is: " +  house_prices[0]);
        System.out.println("Most expensive house price is: " +  house_prices[house_prices.length - 1]);
        
    }
    
    
    
    
}
