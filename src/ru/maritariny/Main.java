package ru.maritariny;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

//        1
//        5
//        1 2 4 8 16

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        int[] results = new int[t];

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(reader.readLine());
            int[] a = new int[n];
            String[] parts = reader.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                a[j] = Integer.parseInt(parts[j]);
            }

            Arrays.sort(a);

            int result = 2000000000;
            for (int j = 0; j < (a.length-1); j++) {
                result = Math.min(result, a[j]^a[j+1]);
            }
            results[i] = result;
        }

        for (int a: results){
            System.out.println(a);
        }
        reader.close();
    }
}
