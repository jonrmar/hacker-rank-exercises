package br.com.hackerrank.implementation;

import java.util.Scanner;

public class GradingStudents {

    static int[] solve(int[] grades){
        int[] roundedGrades = new int[grades.length];
        for(int i = 0; i < grades.length; i++){
            if(grades[i] < 38)
                roundedGrades[i] = grades[i];
            else{
                int nextMultiple = (int)(5*(Math.ceil(grades[i]/(double)5)));
                if(Math.abs(grades[i] - nextMultiple) < 3) roundedGrades[i] = nextMultiple;
                else roundedGrades[i] = grades[i];
            }
        }
        return roundedGrades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}
