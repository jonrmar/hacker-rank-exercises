package br.com.hackerrank.datastructures;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer>[] array = new ArrayList[N];
        for(int i = 0; i< N; i++) array[i] = new ArrayList<>();

        ArrayList<String> lines = new ArrayList<>(Q);
        for(int i = 0; i< Q; i++){
            lines.add(sc.nextLine());
        }

        processDynamicArray(lines, N, array);
    }

    private static void processDynamicArray(ArrayList<String> lines, int N, ArrayList<Integer>[] array){
        Integer lastAnswer = 0;

        for(String line: lines){
            int[] queryElement = getArrayFrom(line);

            if(queryElement[0] == 1){
                array[findIndex(queryElement[1], N, lastAnswer)].add(queryElement[2]);
            } else {
                ArrayList<Integer> seq = array[findIndex(queryElement[1], N, lastAnswer)];

                lastAnswer = seq.get( queryElement[2] % seq.size() );

                System.out.println(lastAnswer);
            }
        }
    }

    private static int findIndex(int x, int N, int lastAnswer){
        return (x ^ lastAnswer)% N;
    }


    private static int[] getArrayFrom(String line){
        String[] elements = line.split(" ");

        return Arrays.stream(elements).mapToInt(Integer::parseInt).toArray();
    }
}
