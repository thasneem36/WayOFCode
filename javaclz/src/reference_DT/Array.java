package Operator.reference_DT;

import java.util.Arrays;

public class Array {
    
    public static void main(String args[]){

        System.out.println("wellcome");
        System.out.println("-----------------------------------");



        // 1 way
        int ab[] = new int[5];
        ab[0] = 10;
        ab[1] = 1;
        ab[2] = 100;
        ab[4] = 50;
        ab[3] = 88;
        // System.out.println("index "+ab[2]);
        System.out.println(Arrays.toString(ab));
        System.out.println();

        // 2nd way
        char[] a = new char[] {

            'a','t','m',
            't','s','w'

        };
        // System.out.println(a[2]);
        System.out.println(Arrays.toString(a));
        System.out.println();

        //3 way
        int[] aaa = {
            1,2,3,6,8
        };
        // System.out.println(aaa[2]);
        System.out.println(Arrays.toString(aaa));
        System.out.println();


        System.out.println("-----------------------------------");

    }

}
