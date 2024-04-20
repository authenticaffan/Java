import java.io.*;
public class calculator{
    static void add(int x,int y){
        int addi= x+y;
        System.out.println("Your answer is: " +addi);
    }
    static void sub(int x,int y){
        int subt= x-y;
        System.out.println("Your answer is: " +subt);
    }
    static void mul(int x,int y){
        int mult= x+y;
        System.out.println("Your answer is: " +mult);
    }
    static void div(int x,int y){
        int divi= x+y;
        System.out.println("Your answer is: " +divi);
    }

    public static void main(String[] args){
        add(5,5);
        sub(50,5);
        mul(2,5);
        div(40,4);
    }
}