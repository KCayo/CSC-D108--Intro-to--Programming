/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumnumber;

/**
 *
 * @author Kevincayo
 */
public class sum100 
{
    
        public static void print_sums(){
            
            int sum= 0 ;
             for (int i=1; i<=100; i++){
                  for(int j=1; j<=i; j++){
                      sum=sum+j;
                  }
                  System.out.println(sum);
                  sum=0;
             }
        }
        
        public static void main (String[] args)
        {
            print_sums();
        }
}
