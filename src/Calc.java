import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Calc {
     public static void main(String[] args) throws Exception {
         while (true) {
             System.out.println("Input: ");

             Scanner input = new Scanner(System.in);
             String str = input.nextLine();

             Scanner s = new Scanner(str);
             boolean bul1 = s.hasNextInt();
             boolean bul2 = s.hasNext();

             try {
                 if (bul1 == true) {
                     String sum = Calc.clc(str);
                     System.out.println("Output: \n" + sum);
                 } else if (bul1 == false && bul2 == true) {
                     String str1 = s.next();
                     String str2 = s.next();
                     String str3 = s.next();

                     String sum = Calc.clc(str1, str2, str3);
                     System.out.println("Output: \n" + sum);
                 } else {
                     System.out.println("Out");
                     break;
                 }
             } catch (Exception e) {
                 System.out.println("break");
             }}}


    public static String clc(String str) {
        Scanner s = new Scanner(str);
        int a = s.nextInt();
        String b = s.next();
        int c = s.nextInt();

        String sum = "arabian";

        if (a <= 10 && a > 0 && c <= 10 && c > 0) {

            int num = 0;

            switch (b) {
                case "+":
                    num = a + c;
                    break;
                case "-":
                    num = a - c;
                    break;
                case "*":
                    num = a * c;
                    break;
                case "/":
                    num = a / c;
                    break;
                default:
                    System.out.println("break");
            }
            sum = Integer.toString(num);
        } else {
            System.out.println("break");
            sum = "...";
        }
        return sum;
    }

    public static String clc(String str1, String str2, String str3) {

        String sum = "rim";

        Rim opr1 = Rim.valueOf(str1);
        Rim opr2 = Rim.valueOf(str3);

        int a = opr1.ordinal();
        int b = opr2.ordinal();

        String arb = Integer.toString(++a) + " " + str2 + " " + Integer.toString(++b);
        String rims = Calc.clc(arb);

        Scanner s = new Scanner(rims);
        int c = s.nextInt();

        if (c == 0) {
            sum = "0";
        } else if (c < 0) {
            c = -c;
            Rim rim[] = Rim.values();
            Rim num = rim[--c];

            sum = "-" + num.toString();
        } else {
            Rim rim[] = Rim.values();
            Rim num = rim[--c];

            sum = num.toString();
        }
        return sum;
    }

}

