package com.gaalbaat;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        System.out.println(args[2]);


        int k=8;

        for (int i = 0;  i<5 ; i++) {
            for (int j = 0; j <k ; j++) {
                System.out.print("");
            }
            k = k-2;

            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




//        int k = 1;
//        for (int t = 0; t <5 ; t++) {
//            for (int i = 0; i <k ; i++) {
//                System.out.print(" * "+" K:"+ k);
//            }
//            k = k+2;
//            System.out.println();
//        }


//        final double PI = 3.14;
//        final int hour = 20;
//        final int mint = 2;
//
//        String inp = JOptionPane.showInputDialog("Input ");
//        int n;
//        n = Integer.parseInt(inp);
//
//        System.out.println(n);
//
//
//        System.out.println(PI);
//
//        System.out.println("Factorial is:" + factorial(n));


        //Static Array
//        int arr[] = {12,21,23,43,56};
//        //Dynamic Array
//        int myArr[] = new int[5];
//        //Multi dimensional 2D array
//        int mutilArr[][] ={
//                {11,23,43,56,88},
//                {33,22,55,66,77},
//                {1234,9912,8128,1277,2166}
//        };
//
//        // 3D Array
//
//        int arr3D[][][] ={
//                {
//                        {122,233,475},
//                        {67,78,89},
//                        {5,6,7}
//                }
//
//        };

//        for (int[][] array2D :arr3D) {
//            for (int[] array1D: array2D) {
//                for (int data: array1D) {
//                    System.out.println("Print " + data);
//                }
//            }
//
//        }

//        String str3D[][][] = {
//                {
//                        {"Thor","IronMan","Captain",},
//                        {"Aquaman" , "Nightwing" , "Batman"},
//                        {"Zarb" , "Lalkar" , "Zomar"}
//                }
//        };


//        for (String[][] str2D: str3D) {
//            for (String[] str1D :str2D) {
//                for (String data : str1D){
//                    System.out.println("Superhero : " + data);
//                }
//            }
//        }

//        for(int[] row : mutilArr){
//            for (int data : row){
//                System.out.println("Print Data : "+ data);
//            }
//        }



//        for (int m = 0; m <mutilArr.length ; m++) {
//            for (int e = 0; e <mutilArr[0].length ; e++) {
//                    System.out.println("Multi dimensional :" +"Row & Column: " + mutilArr[m][e] );
//
//            }
//        }






//        Scanner scan = new Scanner(System.in);
//        int a ;
//        for (int i = 0; i <myArr.length ; i++) {
//            System.out.println("Enter Value");
//            myArr[i] = scan.nextInt();
//        }
//
//        for (int i : myArr) {
//            System.out.println("Dynamic array : " + i);
//        }
//
//
//        for (int i : arr) {
//            System.out.println("Static array :  " + i);
//
//        }


//        int [] source = {1, 2, 3, 4, 5, 6};
//        int [] destination = new int[6];
//        for (int i = 0; i < source.length; ++i) {
//            destination[i] = source[i];
//        }
//
//        // converting array to string
//        System.out.println(Arrays.toString(destination));
//
//        System.out.println(reverseIt("Supreme Zarb"));


//        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
//        // foreach loop
////        for (char item: vowels) {
////            System.out.println(item);
////        }
//        for (char g: vowels) {
//            System.out.println(g);
//        }

    }

//    public static String reverseIt(String source) {
//        int i, len = source.length();
//        StringBuffer dest = new StringBuffer(len);
//
//        for (i = (len - 1); i >= 0; i--) {
//            dest.append(source.charAt(i));
//        }
//        return dest.toString();
//
//    }


//    static int factorial(int a ){
//        if (a <=0){
//            return 1;
//        }else {
//            return  factorial(a-1) * a;
//        }
//    }
}
