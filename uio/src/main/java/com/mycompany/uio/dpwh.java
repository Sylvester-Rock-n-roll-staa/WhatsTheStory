/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uio;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class dpwh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> receipt = new ArrayList<>();
        System.out.println("CAFETIREA");
        System.out.println("[1.0] Snacks");
        System.out.println("[1] Hotdog [25.00]");
        System.out.println("[2] Siomai [14.00]");
        System.out.println("[2.0] Drinks");
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
                int subtotal = quan * hot;
                System.out.println("Subtotal" + subtotal);
                double tax = 0.12;
                double vat = (int) subtotal * tax;
                double total = vat + subtotal;
                System.out.println("Total" + total);
                System.out.println("Enter your cash:");
                int csh = input.nextInt();
                double change = csh - total;
                
                receipt.add("\n Hotdog x" + quan +
                        "\n Subtotal: " + subtotal +
                        "\n Total: " + total +
                        "\n Change:" + change);
                while(csh<total) {
                    System.out.println("Enter exact amount you cash");
                    csh = input.nextInt();
                }
                System.out.println("::::::::::::::::::::::::::");
                System.out.println(":::::::::RECEIPT::::::::::");
                for (String item : receipt) {
                    System.out.println(item);
                }
                System.out.println("::::::::::::::::::::::::::");
                }
                        
                else if(snacks == 2)
                {
                System.out.println("You choose siomai");
                System.out.println("Enter Quantity");
                int quan = input.nextInt();
                int subtotal = quan * siomai;
                System.out.println("Subtotal" + subtotal);
                double tax = 0.12;
                double vat = (int) subtotal * tax;
                double total = vat + subtotal;
                System.out.println("Total" + total);
                System.out.println("Enter your cash:");
                int csh = input.nextInt();
                double change = csh - total;
                
                receipt.add("\n Siomai x" + quan +
                        "\n Subtotal: " + subtotal +
                        "\n Total: " + total +
                        "\n Change:" + change);
                while(csh<total) {
                    System.out.println("Enter exact amount you cash");
                    csh = input.nextInt();
                }
                System.out.println("::::::::::::::::::::::::::");
                System.out.println(":::::::::RECEIPT::::::::::");
                for (String item : receipt) {
                    System.out.println(item);
                }
                System.out.println("::::::::::::::::::::::::::");
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
                System.out.println("You choose Coca-Cola");
                System.out.println("Enter Quantity");
                int quan = input.nextInt();
                int subtotal = quan * coke;
                System.out.println("Subtotal" + subtotal);
                double tax = 0.12;
                double vat = (int) subtotal * tax;
                double total = vat + subtotal;
                System.out.println("Total" + total);
                System.out.println("Enter your cash:");
                int csh = input.nextInt();
                double change = csh - total;
                
                receipt.add("\n Coca-Cola x" + quan +
                        "\n Subtotal: " + subtotal +
                        "\n Total: " + total +
                        "\n Change:" + change);
                while(csh<total) {
                    System.out.println("Enter exact amount you cash");
                    csh = input.nextInt();
                }
                System.out.println("::::::::::::::::::::::::::");
                System.out.println(":::::::::RECEIPT::::::::::");
                for (String item : receipt) {
                    System.out.println(item);
                }
                System.out.println("::::::::::::::::::::::::::");
                }
                else if(drinks == 2)
                {
                System.out.println("You choose Water");
                System.out.println("Enter Quantity");
                int quan = input.nextInt();
                int subtotal = quan * water;
                System.out.println("Subtotal" + subtotal);
                double tax = 0.12;
                double vat = (int) subtotal * tax;
                double total = vat + subtotal;
                System.out.println("Total" + total);
                System.out.println("Enter your cash:");
                int csh = input.nextInt();
                double change = csh - total;
                
                receipt.add("\n Water x" + quan +
                        "\n Subtotal: " + subtotal +
                        "\n Total: " + total +
                        "\n Change:" + change);
                while(csh<total) {
                    System.out.println("Enter exact amount you cash");
                    csh = input.nextInt();
                }
                System.out.println("::::::::::::::::::::::::::");
                System.out.println(":::::::::RECEIPT::::::::::");
                for (String item : receipt) {
                    System.out.println(item);
                }
                System.out.println("::::::::::::::::::::::::::");
                }
            }
        }
    }
}
