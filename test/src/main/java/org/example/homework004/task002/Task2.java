package org.example.homework004.task002;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Task2 vp = new Task2();
        System.out.println(vp.isValid(str));

    }

    public boolean isValid(String s) {

        if (Objects.equals(s, "") || s == null)
            return true;

        Stack stack = new Stack();
        int len = s.length();
        char[] c = s.toCharArray();
        for (int i = 0; i < len; i++) {
            if (stack.empty()) {
                stack.push(c[i]);
            } else {
                switch (c[i]) {
                    case ')':
                        if (stack.peek().equals('(')) {

                            stack.pop();
                        } else {
                            return false;
                        }
                        break;
                    case ']':
                        if (stack.peek().equals('[')) {
                            stack.pop();
                        } else {
                            return false;
                        }
                        break;
                    case '}':
                        if (stack.peek().equals('{')) {
                            stack.pop();
                        } else {
                            return false;
                        }
                        break;
                    default:
                        stack.push(c[i]);
                        break;
                }
            }
        }
        if (stack.empty())
            return true;
        else
            return false;
    }

}
