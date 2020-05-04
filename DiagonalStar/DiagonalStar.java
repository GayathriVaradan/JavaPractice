package com.controlflow;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
    }
    public static void printSquareStar(int number){
        if (number<5){
            System.out.println("Invalid Value");
        }else{
            for(int row = 1; row<=number; row++){
                for(int colomn = 1; colomn<= number; colomn++){
                    if(row==1 || row == number || colomn==1 ||colomn==number){
                        System.out.print("*");
                    }else if(colomn==1 ||colomn==number){
                        System.out.print("*");
                    }else if(row==colomn){
                        System.out.print("*");
                    }else if(colomn==number-row+1){
                        System.out.print("*");
                    }else{
                    System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
