package org.nibor.git_merge_repos;


public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = add(a, b);
        System.out.println("Sum: " + sum);
    }

    public static int add(int x, int y) {
        return x + y;
    }
}
