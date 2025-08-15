/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uio;

/**
 *
 * @author CL2~PC17
 */
public class Uio {

    public static void main(String[] args) {
        Scanner player = new Scanner(System.in);
        System.out.println("Enter First Number 1:");
        int x = Integer.parseInt(player.nextLine());
        System.out.println("Enter First Number 2:");
        int y = Integer.parseInt(player.nextLine());
        
         
        
        System.out.println("Player1 1 = Rock  2 = Paper  3 = Scissor");
        System.out.println("");
        
        System.out.println("Player 1: ");
        int player1 = Integer.parseInt(player.nextLine());
        System.out.println("");
        int player2 = Integer.parseInt(player.nextLine());
        System.out.println("Player 2: ");
        if(player1 == 1 && player2 == 2){
            System.out.print("Draw");
        }
        else if(player1 == 1 && player2 == 2){
            System.out.print("Draw");
        }
        else if(player1 == 1 && player2 == 2){
            System.out.print("Draw");
        }
        else if(player1 == 1 && player2 == 2){
            System.out.print("Player 2 win!");
        }
        else if(player1 == 1 && player2 == 2){
            System.out.print("Player 1 win!");
        }
        else if(player1 == 1 && player2 == 2){
            System.out.print("Player 2 win!");
        }
        else if(player1 == 1 && player2 == 2){
            System.out.print("Player 1 win!");
        }
        else if(player1 == 1 && player2 == 2){
            System.out.print("Player 2 win!");
        } 
        else if(player1 == 1 && player2 == 2){
            System.out.print("Player 1 win!");
        }
        else{
            System.out.print("Invalid choice please select option");
        }
    }
}
