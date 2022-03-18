package com.NumberShapes;
import java.util.Scanner;

public class NumberShapes {

    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        class Number {
            int number;
            public boolean isBoth(){

            }
            public boolean isSquare(){
                int squareRoot = (int) Math.sqrt(number);
                if(Math.floor(squareRoot) == squareRoot){
                    return true;
                }else{
                    return false;
                }
            }
            public boolean isTriangular() {
                int x = 1;
                int triangularNumber = 1;
                while (triangularNumber < number) {
                    x++;
                    triangularNumber += x;
                }
                if (triangularNumber == number) {
                    return true;
                } else {
                    return false;
                }
            }
        }
            Number myNumber = new Number();
         myNumber.number = 16;
        System.out.println(myNumber.isSquare());

    }
}
