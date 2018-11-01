/*
 * This program was made by Misha Donais                
 * On the 29th of October 2018
 * To calculate the max and min values of a random array
 */

package randomarray;

/**
 *
 * @author midon7419
 */
public class RandomArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Array
        int [] numbers = new int[10];
        //Variables
        int total = 0;
        int max = 0;
        int min = 1000;
        final int NUMBEROFVALUES = 10;
        
        System.out.println("Ten random numbers will be generated");
        
        //main loop
        for (int i = 0; i <=9; i+=1){
            
            //Generating random numbers
            numbers[i] = (int)Math.round(Math.random()*1000+1);
            
            } 
             
            //Finding max value
            for (int j = 0; j < numbers.length; j++){
                if (numbers[j] > max){
                    max = numbers[j];
                }
            }
            
            //Finding min value
            for (int k = 0; k < numbers.length; k++){
                System.out.println(numbers[k]);
                if (numbers[k] < min){
                    min = numbers[k]; 
                }
            }
      
        
        for (int i = 0; i <=9; i+=1){
            total = total + numbers[i];
        }
        
        System.out.println("Total Value: " + total);
        System.out.println("Average: " + (total/NUMBEROFVALUES) );
        System.out.println("Max Value: " + max);
        System.out.println("Min Value: " + min);
    }
    
}
