/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uio;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class dpwh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("CAFETIREA");
        System.out.println("[1] Snacks");
        System.out.println("[1] Hotdog [25.00]");
        System.out.println("[2] Siomai [14.00]");
        System.out.println("[1] Drinks");
        System.out.println("[1] Coca-cola [15.00]");
        System.out.println("[2] Water [10.00]");
        //input for choice 
        System.out.println("Enter your choice:");
        int choi = input.nextInt();
        
            //1st if condition for choice
            if(choi ==1)
            {
            System.out.println("Snacks");
            int hot = 25;
            int siomai = 14;
            System.out.println("Enter your choice of snacks:");
            int snacks = input.nextInt();
                
                if(snacks == 1)
                {
                System.out.println("You choose hotdog");
                System.out.println("Enter Quantity");
                int quan = input.nextInt();
                int quan1 = quan * hot;
                System.out.println("Subtotal" + quan1);
                double tax = 0.12;
                double vat = quan1 * tax;
                double total = vat + quan1;
                System.out.println("Total" + total);
                System.out.println("Enter your cash:");
                int csh = input.nextInt();
                double change = csh - total;
                System.out.println("Change is: " + change);
                while(csh<total)
                {
                 System.out.println("Enter your cash:");
                csh = input.nextInt();
                }
                System.out.println("Change is: " + change);
                }
                else if(snacks == 2)
                {
                System.out.println("You choose siomai");
                System.out.println("Enter Quantity");
                int quan = input.nextInt();
                int quan1 = quan * siomai;
                System.out.println("Subtotal" + quan1);
                double tax = 0.12;
                double vat = quan1 * tax;
                double total = vat + quan1;
                System.out.println("Total" + total);
                System.out.println("Enter your cash:");
                int csh = input.nextInt();
                double change = csh - total;
                System.out.println("Change is: " + change);
                while(csh<total)
                {
                 System.out.println("Enter your cash:");
                csh = input.nextInt();
                }
                System.out.println("Change is: " + change);
                }
            }
            else if(choi ==2)
            {
            System.out.println("Drinks");
            int coke = 15;
            int water = 10;
            System.out.println("Enter your choice of Drinks:");
            int drinks = input.nextInt();
                
                if(drinks == 1)
                {
                System.out.println("You Choose Coca-Cola");
                System.out.println("Enter Quantity");
                int quan = input.nextInt();
                int quan1 = quan * coke;
                System.out.println("Subtotal" + quan1);
                double tax = 0.12;
                double vat = quan1 * tax;
                double total = vat + quan1;
                System.out.println("Total" + total);
                System.out.println("Enter your cash:");
                int csh = input.nextInt();
                double change = csh - total;
                System.out.println("Change is: " + change);
                while(csh<total)
                {
                 System.out.println("Enter your cash:");
                csh = input.nextInt();
                }
                System.out.println("Change is: " + change);
                }
                else if(drinks == 2)
                {
                System.out.println("You Choose Water");
                System.out.println("Enter Quantity");
                int quan = input.nextInt();
                int quan1 = quan * water;
                System.out.println("Subtotal" + quan1);
                double tax = 0.12;
                double vat = quan1 * tax;
                double total = vat + quan1;
                System.out.println("Total" + total);
                System.out.println("Enter your cash:");
                int csh = input.nextInt();
                double change = csh - total;
                System.out.println("Change is: " + change);
                while(csh<total)
                {
                 System.out.println("Enter your cash:");
                csh = input.nextInt();
                }
                System.out.println("Change is: " + change);
                }
            }
    }
}
