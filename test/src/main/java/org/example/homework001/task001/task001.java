package org.example.homework001.task001;


import java.util.Scanner;

public class task001 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String outText = "";
        String[] array = text.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            outText += array[i] + " ";
        }

        System.out.println(outText);
    }

}

