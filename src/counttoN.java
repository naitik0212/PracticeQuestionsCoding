/*
Write a program to Count from 1 to N, you can either
a) plus one
b) get reversed number
find the least steps to count from 1 to N
 */

import java.lang.*;
import java.io.*;
import java.util.*;

public class counttoN {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int count =0;
        int i = 1;

        while(i!=a){
            StringBuilder input1 = new StringBuilder();
            count++;
            int temp = Integer.parseInt((input1.append(String.valueOf(i)).reverse()).toString());
            if(temp>i && temp < a){
                i = temp;
            }else
                i++;
        }
        System.out.println("Least number of steps to reach " + a + " is : " + count);
    }
}

/*Output
Enter the number:
4584
Least number of steps to reach 4584 is : 296
*/