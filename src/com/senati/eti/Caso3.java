package com.senati.eti;

import java.util.Scanner;
public class Caso3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n = sc.nextInt();
		
		int factorial = 0;
		int i = 1;
		
		String signo = " x ";
		if (n <= 7)
			while(i <= n) {
				factorial += i;
			
			    System.out.print(i + signo);
			    i = i * i;
			
			    if (i == n) {
			    	signo = " = ";
			    	System.out.println(factorial);
			}
		}
		
		

	}

}
