package br.com.hackerrank.datastructures;

import java.util.Scanner;

public class LeftRotation {

    private static int[] leftRotation(int[] a, int d) {
        int ultimaPos = a.length - 1;
        int temp;
        for (int i = ultimaPos ; d > 0; i--, d--){
            temp = a[0];
            for(int j = 0; j < ultimaPos; j++) a[j] = a[j+1];

            a[ultimaPos] = temp;
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
