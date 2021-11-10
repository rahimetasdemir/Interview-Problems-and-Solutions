package com.company;

import java.util.Arrays;

public class Main {

    static int [] str1_elements_num = new  int[26];
    static int [] str2_elements_num = new  int[26];

    static boolean Check_Permutation(String str1, String str2){

        if(str1.length()==str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                str1_elements_num[((int) str1.charAt(i) - 97)] += 1;
                str2_elements_num[((int) str2.charAt(i) - 97)] += 1;

            }

            if(Arrays.equals(str1_elements_num,str2_elements_num)){
                System.out.println("String permutation is true");
                return true;

            }
            else {
                System.out.println("String permutation is false");
                return false;

            }
        }
        else {  // when the length of strings are different
            System.out.println("String permutation is false");
            return false;

        }

    }

    public static void main(String[] args) {
	// write your code here
        String first_str="abcdefg";
        String second_str="abdcefg";
        String third_str="abcdafg";
        Check_Permutation(first_str,second_str);
        Check_Permutation(first_str,third_str);

    }
}
