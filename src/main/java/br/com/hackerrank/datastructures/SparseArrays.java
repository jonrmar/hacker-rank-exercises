package br.com.hackerrank.datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class SparseArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> strings = new ArrayList<>(n);
        for(int i=0; i < n; i++) strings.add(sc.nextLine());

        int q = sc.nextInt();
        sc.nextLine();
        String test;
        int count;
        for(int i = 0; i< q; i++){
            test = sc.nextLine();
            count = 0;
            for(String s : strings){
                if(s.equals(test)) count++;
            }
            System.out.println(count);
        }
    }
}
