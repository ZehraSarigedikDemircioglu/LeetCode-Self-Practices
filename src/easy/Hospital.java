package easy;

import java.util.HashMap;
import java.util.Map;

public class Hospital {

    public static void main(String[] args) {

        String[] str = {"Cardiology", "Orthopaedics", "Neurology", "Cardiology", "Orthopaedics", "Cardiology"};
        String[] str2 = {"Oncology", "Gynaecology", "Orthopaedics", "Oncology", "Gynaecology", "Orthopaedics"};
        String[] str3 = {"Neurology", "Cardiology", "Oncology"};

        System.out.println(solution(str)); // 3
        System.out.println(solution(str2)); // 2
        System.out.println(solution(str3)); // 1
    }

    public static int solution(String[] array) {

        Map<String, Integer> result = new HashMap<>();
        int max = 0;

        for (String each : array) {
            int frequency = 0;

            for (String element : array) {
                if (each.equals(element)) {
                    frequency++;
                }
            }
            result.put(each, frequency);

            if (max < frequency) {
                max = frequency;
            }
        }
        return max;
    }
}
/*
A hospital has 5 departments: Cardiology, Orthopaedics, Neurology, Oncology, Gynaecology
There are N patients, numbered from 0 to N-1, and the K-th of them is in department represented by a string A[K].
Write a function : class Solution{
                public int solution(String[] A);}
that given an array A consisting of N strings, returns the max number of patients in one department.
 */
