/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10528808;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mawutor
 */
public class ShorterDoubleDice
{
     public static void main(String[] arg)
    {
         Scanner input = new Scanner(System.in);
         int n=0;
         System.out.println("HERE COMES THE DICE");
        do{ 
         
          Random r=new Random();
    Random y=new Random();
    int x= 1 + r.nextInt(5);
    int z= 1+ y.nextInt(5);
    System.out.printf("Roll #1:%d%n",x);
    System.out.printf("Roll #2:%d%n",z);
    if(x!=z)
    {
    int f= z+x;
    System.out.printf("The total is %d%n",f);
    }
    else{
         int f= z+x;
        System.out.printf("The total is %d%n",f);
        break;
        }
    
    }
        
        
    while(n==0);
    {
      System.out.printf("Huh?,Faster than I thought%n");   
 
    }
    
    }
}
