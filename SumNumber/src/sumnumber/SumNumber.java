/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumnumber;

/**
 *
 * @author Kevin Cayo
 */
import java.util.*;
public class SumNumber {
 
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner in= new Scanner (System.in);
                            int num, i, sum;
                            sum=0;
                            System.out.println ("Enter an integer:");
                            num= in.nextInt ( );
                                for (i=0; i<=num; i++)
                                  sum=sum+i;
                                System.out.println ("The sum of 1 through " + num+ " is " + sum); 									
		
		
		
		
		}

	}