
package com.mycompany.mavenproject2;

import java.util.Scanner;

public class Mavenproject2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        
        int N = scanner.nextInt();
        int i = 1;
        while (i <= N) {
            System.out.println(i);
            i++; 
        }

        scanner.close();
    }
}
